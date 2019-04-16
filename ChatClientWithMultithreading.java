import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatClientWithMultithreading {

JTextArea incoming;

JTextFiled outgoing;

BufferedReader reader;

PrintWriter writer;

Socket sock;

public static void main (String[] args) {

ChatClientWithMultithreading client = new ChatClientWithMultithreading();

client.go();

}

public void go() {

JFrame frame = new JFrame("Chat Client");

JPanel main Panel = new JPanel();

incoming = new JTextArea(15,50);

incoming.setLineWrap(true);

incoming.setWrapStyleWord(true);

incoming.setEditable(false);

JScrollPane qScroller = new JScrollPane(incoming);

qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

outgoing = new JTextField(20);

JButton sendButton = new JButton("Send");

sendButton.addActionListener(new SendButtonListener());

mainPanel.add(qScroller);

mainPanel.add(outgoing);

mainPanel.add(sendButton);

setUpNetworking();

Thread readerThread = new Thread(new IncomingReader());

readerThread.start();

frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

frame.setSize(400,500);

frame.setVisible(true);

}

private void setUpNetworking() {

try {

sock = new Socket("192.168.0.6", 5003);

InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());

reader = new BufferedReader(streamReader);

writer = new printWriter(sock.getOutputStream());

System.out.println("Networking Established");

}

catch(IOException ioe) {

ioe.printStackTrace();

}

}

public class SendButtonListener implements ActionListener {

public void actionPerformed(ActionEvent e) {

try {

writer.println(outgoing.getText());

writer.flush();

}

catch (Exception ex) {

ex.printStackTrace();

}

outgoing.setText(" ");

outgoing.requestFocus();

}

}

public class IncomingReader implements Runnable {

public void run() {

String message;

try {

while ((message = reader.readLine()) != null ) {

System.out.println("read " + message);

incoming.append(message + "\n");

}

}

catch(Exception ex) {

ex.printStackTrace();

}

}

}

}

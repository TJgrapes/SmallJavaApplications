import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleChatClientA {

JTextField outgoing;

PrintWriter writer;

Socket sock;

public void go() {

JFrame frame = new JFrame("Simple Chat Client A");

JPanel mainPanel = new JPanel();

outgoing = new JTextField(20);

JButton sendButton = new JButton("Send");

sendButton.addActionListener(new SendButtonListener());

mainPanel.add(outgoing);

mainPanel.add(sendButton);

frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

setUpNetworking();

frame.setSize(400,500);

frame.setVisible(true);

}

private void setUpNetworking() {

try {

sock = new Socket("192.168.0.6", 5001);

writer = new PrintWriter(sock.getOutputStream());

System.out.println("Connected to the server..");

}

catch(IOException ioe) {

ioe.printStackTrace();

}

}

/*

class SendButtonListener implements MouseListener {

public void mouseClicked (MouseEvent e) {

try {

 When the action is performed (send button is clicked), get the test from the text field and write it to the server


writer.println(outgoing.getText());

writer.flush();

}

catch(Exception ex) {

ex.printStackTrace();

}


// Reset the text box to a blank field

outgoing.setText("");

outgoing.requestFocus();

}



public void mouseEntered (MouseEvent e) {



}

public void mouseExited (MouseEvent e) {



}

public void mousePressed (MouseEvent e) {



}

public void mouseReleased (MouseEvent e) {



}

}

*/

class SendButtonListener implements ActionListener {

public void actionPerformed (ActionEvent e) {

try {

/* When the action is performed (send button is clicked), get the test from the text field and write it to the server
*/

writer.println(outgoing.getText());

writer.flush();

}

catch(Exception ex) {

ex.printStackTrace();

}


// Reset the text box to a blank field

outgoing.setText("");

outgoing.requestFocus();

}

}

}

class SimpleChatClientATest {

public static void main (String[] args) {

SimpleChatClientA chatClientA = new SimpleChatClientA();

chatClientA.go();

}

}
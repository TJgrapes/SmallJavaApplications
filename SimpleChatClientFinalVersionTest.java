import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleChatClientFinalVersion {

BufferedReader reader;

PrintWriter writer;

Socket sock;

// These need to be defined at the class level as instance variables so other classes can access them
// outside of the methods they are used in
// (So they exist beyond the scope of the method)

JTextField outgoing;

JTextArea incoming;

// Name to indicate who (which client) sent the message

String username;

public String getUsername() {

return username;

}




public void setupGUI() {

// Create GUI components


JFrame frame = new JFrame("SimpleChatClient");

JPanel mainPanel = new JPanel();

outgoing = new JTextField(20);

JButton sendButton = new JButton("Send");

incoming = new JTextArea(15,50);

JScrollPane qScroller = new JScrollPane(incoming);


// Add components to the mainPanel


mainPanel.add(qScroller);

mainPanel.add(outgoing);

mainPanel.add(sendButton);



// Set GUI component attributes

incoming.setLineWrap(true);

incoming.setWrapStyleWord(true);

incoming.setEditable(false);



qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


// Register the send button with its Listener class

sendButton.addActionListener(new SendButtonListener());




// Finish setting up the GUI

frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

frame.setSize(400,500);

frame.setVisible(true);


// call setUpNetworking

setUpNetworking();

// call setUserName to have user set their name so we know who is sending what messages

setUsername();


// Make a new thread so both main thread and readerThread can be runnable after main calls go()

Thread readerThread = new Thread(new IncomingReader());

readerThread.start();


}

private void setUpNetworking() {

try {

sock = new Socket("192.168.0.6", 5004);

InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());

// Setup reading AND writing

reader = new BufferedReader(streamReader);

writer = new PrintWriter(sock.getOutputStream());

System.out.println("Connected to the server..");

}

catch(IOException ioe) {

ioe.printStackTrace();

}

}

private void setUsername() {

System.out.println("Please enter your name: ");

Console term = System.console();

username = term.readLine();

System.out.println("Welcome " + getUsername() );

}

// Inner class to access writer and text field
// Write to the server when the user clicks the send button

class SendButtonListener implements ActionListener {

public void actionPerformed(ActionEvent ev) {

try {

writer.println(outgoing.getText());

writer.flush();

}

catch (Exception ex) {

ex.printStackTrace();

}

outgoing.setText("");

outgoing.requestFocus();

}

}

// Inner class to read messages from the server on new thread
// Inner class has access to reader and incoming 
// Main thread can start a new thread, thus can call run() method and continuosly read messages

class IncomingReader implements Runnable {

public void run() {

String message;

try {

// Read messages as long as server has messages
while (( message = reader.readLine()) != null ) {

System.out.println("received " + message);

incoming.append(getUsername() + ": " + message + "\n");

}

}

catch (Exception ex) {

ex.printStackTrace();

}

}

}

}

class SimpleChatClientFinalVersionTest {

public static void main(String[] args) {

SimpleChatClientFinalVersion client = new SimpleChatClientFinalVersion();

client.setupGUI();

}

}
import java.io.*;
import java.net.*;
class SendOnlyChatClient {

PrintWriter clientWriter;

Socket sock;

String message;

public void go() {


// Connect to the server computer/application
setUpNetworking();

Console term = System.console();

System.out.println("\nPlease enter a message to send to the server");

System.out.println("\n-------------------------");

System.out.println("\nENTER 'done' WHEN YOU WISH TO TERMINATE THE SESSION" + "\n");

// Allows user to enter messages until they decide they want to stop
// Set max messages to 1000 to allow the program to run 'continuously'
// (Could not use a while loop that looped forever)
for (int i = 0; i < 1000; i++) {

message = term.readLine();


// If user does not want to send any more messages, terminate the program
if (message.equals("done")) {

// Write the message to the server program so we can use it to terminate the program

clientWriter.println(message);

// Writes the message to the server as soon as it is written

clientWriter.flush();

System.out.println("\nYOU HAVE ENDED YOUR SESSION");

clientWriter.close();

break;

}

// Otherwise, allow the user to send messages to the server

else {

clientWriter.println(message);

clientWriter.flush();

System.out.println("\n[Message] " + message + " has been sent to the server");

System.out.println("\nPlease enter a message to send to the server..");

System.out.println("\n");

// Returns to for loop, allowing the user to continue sending messages

}

}

clientWriter.close();



}


public void setUpNetworking() {

try {

sock = new Socket("192.168.0.8", 5001);

clientWriter = new PrintWriter(sock.getOutputStream());

System.out.println("\nConnection established to the server..");

}

catch(IOException ex) {

ex.printStackTrace();

System.out.println("IOEXCEPTION");

}

}

}

class SendOnlyChatClientTest {

public static void main (String[] args) {

SendOnlyChatClient chatClient = new SendOnlyChatClient();

chatClient.go();

}

}


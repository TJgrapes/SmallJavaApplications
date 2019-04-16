import java.io.*;
import java.net.*;
import java.util.ArrayList;

class SendOnlyChatServer {

ServerSocket serverSock;

BufferedReader serverReader;

PrintWriter serverWriter;

InputStreamReader serverInputStream;

Socket clientSock;

String message;

// An ArrayList which will hold all user messages

ArrayList<String> clientMessages = new ArrayList<String>();

public void printClientMessages() {

for (String s: clientMessages) {

System.out.println("\n" + s);

}

}

public void setUpNetworking() {

try {

serverSock = new ServerSocket(5001);

System.out.println("Server Program running..");

while (true) {

// Creates a new client Socket when a client requests a connection with the server

clientSock = serverSock.accept();

serverInputStream = new InputStreamReader(clientSock.getInputStream());

// Use that client socket as the stream to read from

serverReader = new BufferedReader(serverInputStream);

for ( int i = 0; i < 1000; i++ ) {

message = serverReader.readLine();

// Stop reading messages and print out all the messages entered if the user wants to stop messaging
if ( message.equals("done")) {

System.out.println("\nAll messages you sent to the server: ");

printClientMessages();

break;

}

// Otherwise, print out the message and it to the ArrayList

else {

System.out.println("\n" + message);

clientMessages.add(message);

// Return to for loop

}

}

serverReader.close();

}


}



catch(IOException ioe) {

ioe.printStackTrace();

}

}

}

class SendOnlyChatServerTest {

public static void main (String[] args) {

SendOnlyChatServer chatServer = new SendOnlyChatServer();

chatServer.setUpNetworking();

}

}
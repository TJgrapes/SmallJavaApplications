import java.io.*;
import java.net.*;

class DailyAdviceClient {

public void go() {

try {

// Create a new client socket that connects to the server computer with IP address "192.168.0.6"
// and application port number 5000 (the port that the server program is running on)

Socket s = new Socket("192.168.0.6", 5000);

InputStreamReader streamReader = new InputStreamReader(s.getInputStream());

BufferedReader reader = new BufferedReader(streamReader);

// Ask the user if they would like motivation

System.out.println("Would you like motivation today?");

Console term = System.console();

String motivationAnswer = term.readLine();

// If user wants advice, get advice from the server

if( motivationAnswer.equals("yes") || motivationAnswer.equals("Yes") || motivationAnswer.equals("YES") || motivationAnswer.equals("Y") )  {

String advice = reader.readLine();
System.out.println("Today you should: " + advice);

reader.close();

}

else {

System.out.println("Okay, I will not give you advice today");

}

}

catch (ConnectException ce) {

ce.printStackTrace();

System.out.println("COULD NOT CONNECT TO THE SERVER PROGRAM");

}

catch (SocketException se) {

se.printStackTrace();

System.out.println("SOCKET EXCEPTION");

}

catch(IOException ioe) {

ioe.printStackTrace();

System.out.println("IO EXCEPTION");

}





}

}

class DailyAdviceClientTestEnhanced {

public static void main (String[] args) {

DailyAdviceClient client = new DailyAdviceClient();


client.go();


}

}
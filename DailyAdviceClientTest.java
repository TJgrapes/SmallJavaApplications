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

String advice = reader.readLine();
System.out.println("Today you should: " + advice);

reader.close();

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

class DailyAdviceClientTest {

public static void main (String[] args) {

DailyAdviceClient client = new DailyAdviceClient();


client.go();


}

}
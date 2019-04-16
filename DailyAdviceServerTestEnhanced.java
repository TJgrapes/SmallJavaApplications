import java.io.*;
import java.net.*;

class DailyAdviceServer {

String[] adviceList = {"Not give up", "Believe in yourself", "Just keep coding"};

public String getAdvice() {

int random = (int) (Math.random() * adviceList.length);
return adviceList[random];

}

public void go() {

System.out.println("Server program is running..");

try {


// Create a Server Socket and assign the program a port

ServerSocket serverSock = new ServerSocket(5000);


// Accept Client requests (allow computers to connect to the server program) forever

while(true) {

/* 
This method accepts client requests and assigns the client a new Socket so the Server Socket can continue to // listen to client requests on the original port number (5000)
This 'frees up" the port

The accept method also "blocks" (just sits there) until it receives a client request
*/

Socket sock = serverSock.accept();

// Instead of writing to a file, we write to the client socket

PrintWriter writer = new PrintWriter(sock.getOutputStream());


// Chooses a random string from the advice list
String advice = getAdvice();

writer.println(advice);

writer.close();

System.out.println(advice);

}

}

catch(IOException ex) {

ex.printStackTrace();

}

}

}

class DailyAdviceServerTestEnhanced {

public static void main (String[] args) {

DailyAdviceServer server = new DailyAdviceServer();

server.go();

}

}
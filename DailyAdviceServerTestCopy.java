import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DailyAdviceServer {

String[] adviceList = {"Not give up", "Believe in yourself", "Just keep coding"};

public String getAdvice() {

int random = (int) (Math.random() * adviceList.length);
return adviceList[random];

}

public void go() {

System.out.println("Server program is running..");

try {

ServerSocket serverSock = new ServerSocket(80);

while(true) {

Socket sock = serverSock.accept();

PrintWriter writer = new PrintWriter(sock.getOutputStream());

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

class DailyAdviceServerTestCopy {

public static void main (String[] args) {

DailyAdviceServer server = new DailyAdviceServer();

server.go();

}

}
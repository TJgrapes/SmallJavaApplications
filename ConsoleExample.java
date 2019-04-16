import java.io.*;

class ConsoleExample {

public static void main (String [] args) {

Console cn = System.console();

System.out.print("Enter a Phrase: ");
String p = cn.readLine();

System.out.println("Java says " + p);

}

}
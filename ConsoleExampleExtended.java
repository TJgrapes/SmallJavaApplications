import java.io.*;

class ConsoleExampleExtended {

public static void main (String [] args) {

// Representing the console by creating a console object

Console cn = System.console();

System.out.println("On a scale of 1 - 10, how hot is Taylor... ");

/* readLine method reads a single line of text from the console and returns it as a string.. so we use parseInt to turn it into an int variable */

int other = Integer.parseInt(cn.readLine());

System.out.println(other);

int hotness = Integer.parseInt(cn.readLine());

if (hotness >= 7 ) {

System.out.println("Taylor is super hot!!");

}

else if (hotness >= 5) {

System.out.println("Taylor is average hot");

}

else if (hotness >= 0) {

System.out.println("Taylor is not very hot");

}

else {

System.out.println("Please no negative values :(");

}

}

}
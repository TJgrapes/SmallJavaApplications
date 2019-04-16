import java.io.*;
import java.util.*;

class GreetingsArraySplit {

ArrayList<String> greetingsArray = {"Good Morning/Buenos dias", "Good Afternoon/Buenas tardes", "Good Evening/Buenas Noches"};

// Array to Hold English Translations



//Array to Hold Spanish Translations

String[] greetingsSpanish;

File spanishGreetings;

public void serialize() {

try {

// Setup the Writer

spanishGreetings = new File("SpanishGreetings.txt");

FileWriter fWriter = new FileWriter(spanishGreetings);

BufferedWriter writer = new BufferedWriter(fWriter);

// Write data to the file

for (String g: greetingsArray) {

writer.write(g);

}

writer.flush();

writer.close();

}

catch(IOException ioe) {

ioe.printStackTrace();

}

try {

// Setup the Reader

BufferedReader reader = new BufferedReader (new FileReader(spanishGreetings));

// Read from the file and parse it

String greet;

while ((greet = reader.readLine()) != null) {

String[] tokens = greet.split("/");

String[] greetingsEnglish = new String[3];

greetingsEnglish[0] = tokens[0];

System.out.println(greetingsEnglish);

}

}

catch(IOException ioe) {

ioe.printStackTrace();

}

}

}

class GreetingsArraySplitTest {

public static void main (String[] args) {

GreetingsArraySplit greet = new GreetingsArraySplit();

greet.serialize();

}

}




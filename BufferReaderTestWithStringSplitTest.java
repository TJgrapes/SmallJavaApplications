import java.io.*;
import java.util.*;

class BufferReaderTestWithStringSplit {

String[] splitArrayStore;

public void serialize() {

try {

BufferedWriter writer = new BufferedWriter(new FileWriter("BufferedReaderTestWithStringSplit.txt"));

String[] greetings = { "Good morning/Buenas dias", "Good afternoon/Buenas tardes", "Good evening/Buenas noches" };

for ( String s : greetings ) {

String[] splitArray = s.split("/");

splitArrayStore = splitArray;

for (String sa : splitArrayStore) {

System.out.println(s);

}

}



for ( String s : splitArrayStore ) {

writer.write(s);

System.out.println(s);

}

writer.close();

}

catch (IOException ex) {

ex.printStackTrace();

}

/*

try {

BufferedReader reader = new BufferedReader(new FileReader("BufferedReaderTestWithStringSplit.txt"));

String line = null;

while (( line = reader.readLine()) != null) {

System.out.println(line);

}

reader.close();

}


catch (IOException ex) {

ex.printStackTrace();

}

*/

}

}

class BufferReaderTestWithStringSplitTest {

public static void main (String[] args) {

BufferReaderTestWithStringSplit mySplit = new BufferReaderTestWithStringSplit();

mySplit.serialize();

}

}


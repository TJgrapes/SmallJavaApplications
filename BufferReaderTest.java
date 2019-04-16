import java.io.*;

class BufferReader {

File savedFile;

public void buffer() {

try {

// Create a file object (as opposed to just using a String) to represent the actual file
// This is safer way to represent a file

File myFile = new File("BufferedReaderTest.txt");

// Set the instance variable savedFile to myFile so we can access it
savedFile = myFile;

// Create a FileWriter and chain it to a BufferedWriter with the file
BufferedWriter writer = new BufferedWriter(new FileWriter(savedFile));

// Create a String array with will be written to the BufferedWriter
String[] greetings = { "Good morning", "\nGood afternoon", "\nGood evening" };

// Write each string in the greetings array to the file
for ( String s : greetings ) {

writer.write(s);

}

writer.close();

}

catch (IOException ex) {

ex.printStackTrace();

}

try {

BufferedReader reader = new BufferedReader(new FileReader(savedFile));

// readLine method reads one line at a time..
// Make a String variable hold each line as the line is read
// Read each line of text and assign it to the variable 'line'
// While that variable is not null, print out the line that was just read

String line = null;

while (( line = reader.readLine()) != null) {

System.out.println(line);

}

reader.close();

}


catch (IOException ex) {

ex.printStackTrace();

}

/*
while (( true == true ) != false ) {

System.out.println("Wow");

}

*/

/*
String null1 = "null";

String null2 = "null";

while (( null1 = null2 ) != null ) {

System.out.println("Nice");

}

*/

}

}



class BufferReaderTest {

public static void main (String[] args) {

BufferReader br = new BufferReader();

br.buffer();

}

}
import java.io.*;
import java.util.*;

/* 

** HAD TO ADD \N CHARACTER when writing mayday arraylist (writing it to the file) FOR READLINE() METHOD TO WORK, BECAUSE OTHERWISE IT WAS READ ALL AS ONE LINE AND WOULD STOP AT THE FIRST STRING 

*/

class TrinixMayday {

File trinixMayday;

File jukeboxFile;

File songArrayFile;

// This is how to initialize an ArrayList with values upon declaration


ArrayList<String> mayday = new ArrayList<>(Arrays.asList("Nasa", "Close to Me", "One Night", "Last Minute", "On my Mind", "Milky Way", "Mozenda", "Supernova", "Off", "Otherside", "Jet Plane", "Bastille", "Arizona", "Go Home", "Keep the Story", "Desert", "Blinded Edge", "Atlantis", "Upside Down", "Mayday From the Moon"));




// ArrayList which we will use split method on


ArrayList<String> jukeboxPlaylist = new ArrayList<>(Arrays.asList("American Idiot/Green Day", "\nMidnight/Trinix", "\nWalk This Way/Aerosmith", "\nTalk To Me/Marian Hill", "\n3 Strikes/Terror Jr"));


// New ArrayList to store parsed results from jukeboxPlaylist


ArrayList<String> jukeboxParsed = new ArrayList<String>();


// ArrayList which will hold String objects that represent Songs; we will make them become Song objects when we parse and write them to songArrayParsed

ArrayList<String> songArray = new ArrayList<String>(Arrays.asList("American Idiot/Green Day/8/120", "Midnight/Trinix/9/70", "Walk This Way/Aerosmith/6/80","Walk This Way/Aerosmith/6/80", "Talk To Me/Marian Hill/7/100", "3 Strikes/Terror Jr/10/130", "3 Strikes/Terror Jr/10/130"));

// ArrayList to store parsed results from songArray

ArrayList<Song> songArrayParsed = new ArrayList<Song>();


public void buffer() {

//mayday.add("Hello"); // Just tested if I could still add elements to the ArrayList because of the way it was created, using Arrays.asList method

trinixMayday = new File("TrinixMaydaySongs.txt");

// Write the songs to a txt file

try {

// Setup the BufferedWriter to write data to the file

int i = 0;

BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(trinixMayday));


// Write each song from mayday array to the text file

for (String s : mayday) {



// Only write the first string without a new line character

if (i == 0) {

bufferedWriter.write(s);

i++;

// System.out.println(s);

}

// Else, write each String on a new ling

else {

bufferedWriter.write("\n" + s);

// System.out.println(s);

}

} // Close for loop

bufferedWriter.flush();

bufferedWriter.close();

} // Close try block

catch (IOException ioe) {

ioe.printStackTrace();

}



try {

// Setup the BufferedReader

BufferedReader bReader = new BufferedReader(new FileReader(trinixMayday));


// Read data from the text file

/// Set the string to null


String song = null;

/// Set the string equal to what is read from the file
/// If it is not null, read the String


while((song = bReader.readLine()) != null) {

System.out.println(song);

} // Close while loop

} // Close try block


catch(IOException ioe) {

ioe.printStackTrace();

}

} // Close buffer()



public void bufferAndParse() {

/// Write the data to a txt file



try {

/// Setup the BufferedWriter


jukeboxFile = new File("jukebox.txt");

FileWriter fWriter = new FileWriter(jukeboxFile);

BufferedWriter writer = new BufferedWriter(fWriter);

System.out.println("\n");


/// Write the data

for (String s: jukeboxPlaylist) {

writer.write(s);

System.out.println("String that has been written to the file: " + s);

} // Close for loop

writer.flush();

writer.close();

} // Close try block

catch(IOException ioe) {

ioe.printStackTrace();

}


/// Read the data from the txt file and use split to separate Strings by title and artist

/// Setup the reader

try {

BufferedReader reader = new BufferedReader(new FileReader(jukeboxFile));


// Read the data from the txt file


/// Split the string on the "/" and only add the first token (the title) of the song to
/// the parsed arrayList

/* 

** HAD TO ADD \N CHARACTER FOR READLINE() METHOD TO WORK, BECAUSE OTHERWISE IT WAS READ ALL AS ONE LINE AND WOULD STOP AT THE FIRST STRING 

*/

String juke = null;

while(( juke = reader.readLine()) != null) {

// The tokens array serves as an intermediate array to hold each parsed string values

String[] tokens = juke.split("/");

jukeboxParsed.add(tokens[0]);

System.out.println("\njukeboxParsed array now includes: " + jukeboxParsed);

} // Close while loop

System.out.println(jukeboxParsed);

} // Close try block


catch(IOException ioe) {

ioe.printStackTrace();

}

Collections.sort(jukeboxParsed);

System.out.println("\nSorted jukebox array: " + jukeboxParsed);

} // Close bufferAndParse()


// Use this method on the Song Array to parse 4 song tokens and put them in a parsed
// as song objects in a parsed song Array

public void bufferAndParseSong() {

/// Write the data to a txt file



try {

/// Setup the BufferedWriter


songArrayFile = new File("songArray.txt");

BufferedWriter writer = new BufferedWriter(new FileWriter(songArrayFile));

System.out.println("\n");

int i = 0;


/// Write the data

for (String s: songArray) {

if (i == 0) {

writer.write(s);

i++;

System.out.println("String that has been written to the file: " + s);

}

else {

writer.write("\n" + s);

System.out.println("\nString that has been written to the file: " + s);

}

} // Close for loop

writer.flush();

writer.close();

} // Close try block

catch(IOException ioe) {

ioe.printStackTrace();

}


/// Read the data from the txt file and use split to separate Strings by title, artist, rating, and bpm
/// Store the split strings and store them as song objects in songArrayParsed

/// Setup the reader

try {

BufferedReader reader = new BufferedReader(new FileReader(songArrayFile));


// Read the data from the txt file


/// Split the string on the "/" and only add the first token (the title) of the song to
/// the parsed arrayList 

String song = null;

while((song = reader.readLine()) != null) {

// The tokens array serves as an intermediate array to hold each parsed string values

String[] tokens = song.split("/");

// Create a new song object using each token of the split string

Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);

// Add the song to songArrayParsed, which holds song objects

songArrayParsed.add(nextSong);

System.out.println("\nSongArrayParsed array now includes: " + songArrayParsed);

} // Close while loop

System.out.println("\nFull SongArrayParsed: " + songArrayParsed);

} // Close try block


catch(IOException ioe) {

ioe.printStackTrace();

}

// One argument sort method that sorts by title

Collections.sort(songArrayParsed);

System.out.println("\nSorted by Title " + songArrayParsed);

// Create an instance of ArtistCompare

ArtistCompare artistCompare = new ArtistCompare();

// Use overloaded sort method to sort song array using compare method defined
// in ArtistSort class

Collections.sort(songArrayParsed, artistCompare);

System.out.println("\nSorted by artist: " + songArrayParsed);

TitleCompare titleCompare = new TitleCompare();

Collections.sort(songArrayParsed, titleCompare);

System.out.println("\nSorted by title using TitleCompare class: " + songArrayParsed);


// Make a HashSet from the songArrayList

HashSet<Song> hashSongParsed = new HashSet<Song>();

hashSongParsed.addAll(songArrayParsed);

// Doesn't automatically sort elements.. Not sure how to sort a HashSet

System.out.println("\nHashSet: " + hashSongParsed);


// Make a TreeSet from the hashSongParsed HashSet

TreeSet<Song> treeSongParsed = new TreeSet<Song>();

treeSongParsed.addAll(hashSongParsed);

System.out.println("\nTree set: " + treeSongParsed);



} // Close bufferAndParseSong()

// Inner class that implements Comparator to sort songs in another way (by artist)
// Use this with the overloaded sort() method that takes a list and a comparator

class ArtistCompare implements Comparator<Song> {

// override the compare() method, which will decide how to sort the songs

public int compare(Song one, Song two) {

return one.getArtist().compareTo(two.getArtist());

}

} // Close inner class

class TitleCompare implements Comparator<Song> {

public int compare(Song one, Song two) {

return one.getTitle().compareTo(two.getTitle());

} 

} 

}


class Song implements Comparable<Song> {

String title;

String artist;

String rating;

String bpm;

Song(String t, String a, String r, String b) {

title = t;

artist = a;

rating = r;

bpm = b;

}

public String getTitle() {

return title;

}

public String getArtist() {

return artist;

}

public String getRating() {

return rating;

}

public String getBpm() {

return bpm;

}

// Override the toString method to print out the song title when we call
// The String class simply returns the String when toString is called
// System.out.println(Song song) (When we call that function on our song object)

// Without overriding the toString method, whenever we call System.out.println on the 
// ArrayList object, we get: 
// SongArrayParsed array now includes:
// [Song@1bc6a36e,Song@1ff8b8f, Song@387c703b, Song@224aed64, Song@71e7a66b]

public String toString() {

return title + ": " + artist;

}

// Implement the compareTo method from the Comparable interface
// Call the method on our String object since Strings have a compareTo method

// So if we use compareTo on a String object, it will know how to compare the Strings
// Then when we call the sort method, it will sort them alphabetically by title
// Alphabetize by title

public int compareTo(Song s) {

return title.compareTo(s.getTitle());

}


// Override the hashCode method so songs with the same title will have the same hashcodes

public int hashCode() {

return getTitle().hashCode();

}

// Override the equals method so two objects are considered equal if they have same title
// This allows the HashSet to correctly decide whether or not to add a new object
// (Prevents duplicates)
// String class defines equals so that if two string equal each other, they are equal
// For example, String myString = "hello"  ==  String myOtherString = "hello"

public boolean equals(Object aSong) {

Song s = (Song) aSong;

return getTitle().equals(s.getTitle());

}

}



class TrinixMaydayTest {

public static void main (String[] args) {



// Simple write and read of an Array




TrinixMayday tMayday = new TrinixMayday();

tMayday.buffer();




// Write and read Array; parse 2 tokens: title and author; sort Collection


//TrinixMayday jukebox = new TrinixMayday();

//jukebox.bufferAndParse();



// Write and read Array; parse 4 tokens; store as a ArrayList<Song> objects

TrinixMayday songArrayParse = new TrinixMayday();

songArrayParse.bufferAndParseSong();

// Shows what the toString() method does if it is not overriden from the object class

/// String songArrayParseString = songArrayParse.toString();

/// System.out.println(songArrayParseString);

}

}
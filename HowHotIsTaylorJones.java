public class HowHotIsTaylorJones {

public static void main (String [] args) {

// Create list of hotness values for Taylor

String [] taylorHotness = {"Super hot", "So hot", "The hottest man in Tallahassee"};

// Get the length of the array and store in an int

int taylorHotnessLength = taylorHotness.length;

// Pick a random value of Taylor's hotness from array

int taylorHotnessIndex = (int) (Math.random() * taylorHotnessLength);

// Create the phrase

String phrase = "Taylor is " + taylorHotness[taylorHotnessIndex];

// Output phrase to the console

System.out.println(phrase);

}

}
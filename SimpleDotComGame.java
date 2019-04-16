// Simple Dot Com Game

// Test Code for Simple Dot Com Class

public class SimpleDotComTestClass {

public static void main (String[] args) {

// Instantiate a new SimpleDotCom object

SimpleDotCom dot = new SimpleDotCom();

// Create an int array that will store the position of the dotcom

int[] locations = {2,3,4};

// Set the locations on the dot object

dot.setLocationsCells(locations);

// Create a fake user guess

String guess = "2";

// Check the user guess and store the result as "hit", "miss", or "kill'

String result = dot.checkGuess(guess);

// Create a variable indicating whether it passed or failed the test; default is failed

String testResult = "failed";

// Test the checkGuess method using the guess

if ( result.equals("hit")) {

testResult = "passed";

}

System.out.println(testResult);

}

}
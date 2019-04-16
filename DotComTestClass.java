// DotCom Game

// DotCom Class

import java.lang.Integer;
import java.io.*;
import java.util.ArrayList;


class DotCom {

// Instance variables

private ArrayList<String> locationCells;

// Getters and Setters

public void setLocationCells(ArrayList<String> locs) {

locationCells = locs;

}

// Other Methods

/// Check user guess: return "hit", "miss", or "kill"

String checkGuess (String userInput) {

String result = "miss";

// Change to hit or kill if the stringGuess matches a cell in the int array

/// Check the ArrayList to see if the UserInput (guess) is an element in the ArrayList; Returns index position if it is in the array, returns a -1 if it is not in the array

int index = locationCells.indexOf(userInput);

// So if userInput is in the array, we must return a hit and remove that element in the array

if (index >= 0) {

locationCells.remove(index);

// Check to see if the ArrayList is empty; if empty, change result to "kill"

if (locationCells.isEmpty()) {

result = "kill";

}

else {

result = "hit";

}

}

return result;

}

}


// DotComTestClass

class DotComTestClass {

public static void main (String[] args) {

// Instance Variables

// User's number of guesses to report at end of game

int numOfGuesses = 0;

// GameHelper object that allows us to get input from the command line

GameHelper helper = new GameHelper();

// Create a SimpleDotCom object

SimpleDotCom dot = new SimpleDotCom();

// Create a random number between 0 and 4 which will be first number for dotcom array

int randomNum = (int) (Math.random() *5);

// Use randomNum as first cell in the 3 element array

int[] locations = {randomNum, randomNum + 1, randomNum + 2};

// Set the locations array on the dot object

dot.setLocationCells(locations);

// Create a boolean which tracks if the game is still alive, to use in the while loop test repeat while the game is still alive

boolean isAlive = true;

// If game is still alive, get user input and check guess

while(isAlive = true) {

String guess = helper.getUserInput("enter a number");

String result = dot.checkGuess(guess);

numOfGuesses++;

if (result.equals("kill")) {

isAlive = false;

System.out.println("You took " + numOfGuesses + " guesses");

}

}

}

}


// Create a GameHelper class to get input from the command line

class GameHelper {

public String getUserInput(String prompt) {

String inputLine = null;
System.out.print(prompt + " ");
try {
BufferedReader is = new BufferedReader ( new InputStreamReader(System.in));
inputLine = is.readLine();
if (inputLine.length() == 0)  return null;
} catch (IOException e) {
System.out.println("IOException: " + e);
}
return inputLine;
}
}



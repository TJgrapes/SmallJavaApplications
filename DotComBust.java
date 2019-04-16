// DotCom Game

// DotCom Class

import java.lang.Integer;
import java.io.*;
import java.util.ArrayList;


class DotCom {

// Instance variables

private ArrayList<String> locationCells;

private String name;

// Getters and Setters

public void setLocationCells(ArrayList<String> locs) {

locationCells = locs;

}

public void setName(String n) {

name = n;

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

System.out.println("You sunk " + name + " : ) ");

}

else {

result = "hit";

}

}

return result;

}

}


// DotComBust

class DotComBust{



// Instance Variables


/// GameHelper object that allows us to get input from the command line

private GameHelper helper = new GameHelper();

/// Create ArrayList of DotCom objects, which will hold each DotCom

private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

/// Create a variable that will keep track of number of guesses

private int numOfGuesses = 0;


// Methods

/// Game Flow Methods

//// Set Up Game: Create 3 DotCom objects, assign names, and put them in the ArrayList

DotCom one = new DotCom();

one.setName("Pets.com");

DotCom two = new DotCom();

two.setName("eToys.com");

DotCom three = new DotCom();

three.setName("Go2.com");

dotComsList.add(one);

dotComsList.add(two);

dotComsList.add(three);

System.out.println("Your goal is to sink three dot coms.");

System.out.println("Pets.com, eToys.com, Go2.com");

System.out.println("Try to sink them all in the fewest number of guesses");


for (DotCom dotComToSet: dotComsList) {

// Ask the helper for a DotCom location

ArrayList<String> newLocation = helper.placeDotCom(3);

// Call the setter method on this DotCom to give it the location hyou just got from the helper

dotComToSet.setLocationCells(newLocation);

}

}


//// Start Playing Method: While there are still dotcoms, get user guess and check it

private void startPlaying() {

while(!dotComsList.isEmpty()) {

String userGuess = helper.getUserInput("Enter a guess");

checkUserGuess(userGuess);

}

}

//// Check Guess method: Check the guess and return correct result

private void checkUserGuess(String userGuess) {

numOfGuesses++;

String result = "miss";

for (DotCom dotComToTest: dotComsList) {

result = dotComToTest.checkGuess(userGuess);

if (result.equals("hit")) {

break;

}

if (result.equals("kill")) {

dotComsList.remove(dotComToTest);
break;

}

}

System.out.println(result);

}

//// Finish game method

private void finishGame() {

System.out.print.ln("All Dot Coms are dead!");

if (numOfGuesses <= 18) {

System.out.println("It only took you " + numOfGuesses + " guesses.");
System.out.println("You got out before your options sank");

else {
System.out.println(Took you long enough. " + numOfGuesses + " guesses.");
System.out.println("lol");
}

}

//// main method: create game object, telll game object to set up game, tell game object to start the main game play loop (keep asking for user inputr and checking the guess)

public static void main (String [] args) {

DotComBust game = new DotComBust();
game.setUpGame();
game.startPlaying();

}











// Create a GameHelper class to get input from the command line

class GameHelper {

private static final String alphabet = "abcdefg";

private int gridLength = 7;

private int gridSize = 49;

private int [] grid = new int[gridSize];

private int comCount = 0;

public String getUserInput(String prompt) {

String inputLine = null;

System.out.print(prompt + " ");

try {

BufferedReader is = new BufferedReader (new InputStreamReader(System.in));

inputLine = is.readLine();

if (inputLine.length() == 0 ) return null;

} catch ("IOException: " + e);

}

return inputLine.toLowerCase();

}

public ArrayList<String> placeDotCom(int comSize) {

ArrayList<String> alphaCells = new ArrayList<String>();

String [] alphacoords = new String [comSize];

String temp = null;

int [] coords = new int[comSize];

int attempts = 0;

boolean success = false;

int location = 0;



comCount++;

int incr = 1;

if ((comCount % 2) ==1) {

incr = gridLength;

}

whille (!success & attempts++ < 200) {

location = (int) (Math.random() * gridSize);

int x = 0;

success = true;

while (success && x < comSize) {

if (grid[location] == 0 {

coords[x++] = location;

location += incr;

if (location >= gridSize) {

success = false;

}

if ( x > 0 && (location%gridLength == 0 )) {

success = false;

}

else {

System.out.print(" used " + location);
success = false;
}

}

}


int x = 0;

int row = 0;

int column = 0;

while ( x < comSize) {

grid[coords[x]] = 1;

row = (int) (coords[x] % gridLength;

temp = String.valueOf(alphabet.charAt(column));

alphaCells.add(temp.concat(Integer.toString(row)));

x++;

}

return alphaCells;

}

}



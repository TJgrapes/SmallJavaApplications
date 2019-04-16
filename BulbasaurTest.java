// Encapsulation Program (Private instance variables and public getters and setters)

//**?? FIGURED OUT BUG IN PROGRAM!

// Now that I learned about the scope of variables, I needed to use the INSTANCE VARIABLES instead of just using local variables in the battle method so that the incrementation of the local variables would persist

// Now it works as it should: Both variables xp and level increment as they should :)

///** Discovered that I can call a funtion (for example, getName()) inside another function without prefixing it with the object reference. (in this case the battle function) to call the getName function on any object that calls the battle method!! This works because the getName function belongs to the same class

// In other words, I can use the function on any object that enters the battle method

import java.io.Console;

class Bulbasaur {

// Bulbasaur Constructor

/// This creates a new Bulbasaur object and initializes its name, xp, level, and battleTimes

public Bulbasaur(String objName, int objXp, int objLevel, int objBattleTimes) {

name = objName;

xp = objXp;

level = objLevel;

battleTimes = objBattleTimes;

/* Set default evolution stage because it makes sense when a new Bulbasaur is created, it should only be a "Bulbasaur", not an "Ivysaur" or a "Venusaur"

*/

evolutionStage = "Bulbasaur";

bulbasaurCount++;



}


/// Instance Variables

/// Note: battleTimes is the number of times Bulbasaur can battle

private String name;

private int level;

private int xp;

private int battleTimes;

private String evolutionStage;

static int bulbasaurCount;

// Methods

/// Getters and Setters

//// Set Bulbasaur name

public void setName(String n) {

name = n;

}

//// Set Bulbasaur level

public void setLevel(int l) {

level = l;

}



//// Set Bulbasaur xp

public void setXp(int x) {

xp = x;

}

//// Set Bulbasaur battleTimes

public void setBattleTimes(int b) {

battleTimes = b;

}

//// Set Bulbasaur evolutionStage

public void setEvolutionStage(String e) {
	evolutionStage = e;
}

//// Get Bulbasaur name

public String getName() {
return name;

}

//// Get Bulbasaur level

public int getLevel() {
return level;

}

//// Get Bulbasaur xp

public int getXp() {
return xp;

}

//// Get Bulbasaur battleTimes

public int getBattleTimes() {

return battleTimes;

}

//// Get Bulbasaur evolutionStage

public String getEvolutionStage() {
	return evolutionStage;
}

/// Other Methods

//// Battle Initializer: First, decide whether or not bulbasaur can battle based on battleTimes; Allow it to battle if battleTimes > 0
//// Using this method so we do not have to manually pass in input arguments required for the battle method EACH TIME we want to call the battle method on an object
//// Instead, the battleInitializer makes the call to battle for the object, and uses the get methods to fetch the fields
//// This also allows improves readability and allows the methods to only contain the code that performs its main function

public void battleInitializer() {
	
	// Make Bulbasaur battle until it gets tired (battleTimes == 0)

	while ( getBattleTimes() >= 0) {

	// If battleTimes = 0, don't allow Bulbasaur to battle and print out a message

	if (getBattleTimes() == 0) {

	System.out.println( getName() + " is too tired to battle! Visit the Pokemon Center to heal your " + getName());

	break;

}

	else if (getBattleTimes() > 0) {

	// Allow Bulbasaur to battle

	battle( getXp(), getLevel(), getBattleTimes());

}


}
	
}

// Battle

public void battle(int tempXp, int tempLevel, int tempBattleTimes) {

// Begginning battle message

//*** Can use general getName() function to call the getName() method on whatever object that calls the battle method!, because it is in the same class

System.out.println( getEvolutionStage() + " " + getName() + " is entering battle!");



System.out.println(getEvolutionStage() + " " + getName().toUpperCase() + " finished battle");

xp = xp + 100;

System.out.println(getName().toUpperCase() + " xp: " + getXp());

// If xp reaches 1000, call levelUp method
if ( getXp() >= 1000) {
	levelUp();
}

else if ( getXp() < 1000 ) {
System.out.println( getEvolutionStage() + " " +  getName() + " level: " + getLevel() + " " + getEvolutionStage() + " xp: " + getXp());

}



//Decrement battleTimes after the battle

battleTimes = battleTimes - 1;

if (getBattleTimes() == 0) {
	
	System.out.println( getEvolutionStage() + getName() + " cannot battle anymore");
	
}

else if ( getBattleTimes() == 1) {
	
	System.out.println( getEvolutionStage() + " " + getName() + " can battle " + getBattleTimes() + " more time before it needs to recover");
	
}

else if ( getBattleTimes() > 1 ) {
	
System.out.println( getEvolutionStage() + " " + getName() + " " + " can battle " + getBattleTimes() + " more times before it needs to recover");

}


}


public void levelUp() {
	
	xp = 0;
	level = level + 1;

System.out.println( getEvolutionStage() + " " + getName() + " leveled up");

// Call the evolve method once level reaches 16
if( getLevel() == 16) {
	evolve();
}

System.out.println(getEvolutionStage() + getName() + " level: " + getLevel() + " " + getEvolutionStage() + "  xp: " + xp);

}

// Evolve method
public void evolve() {
	System.out.println("Huh?? " + getName() + " is evolving!");
	System.out.println("Congratulations! " + getName() + " evolved into Ivysaur!" );
	
	// Change evolutionStage to Ivysaur
	
	setEvolutionStage("Ivysaur");
	// Call the renameAfterEvolve method to give user option to rename bulbasaur
	renameAfterEvolve();
}

public void renameAfterEvolve(){
	
	System.out.println("Would you like to give a new name to " + getName() + " ?" + "\nPlease enter 'Y' or 'N' " );
	
	Console term = System.console();
	
	String rename = term.readLine();
	
	switch(rename){
		
		case "Y": 
		
		System.out.println("Please enter a new name");
		
		String newName = term.readLine();
		
		setName(newName);
		
		break;
		
		case "N":
		
		System.out.println("You have chosen not to rename " + getName());
		
		break;
		
		default:
		
		System.out.println("Please enter a valid character");
		
		renameAfterEvolve();
		
		break;
	}

	
}



}

class BulbasaurBattle2Thread implements Runnable {
	
	// implement the run method

public void run() {
	
	Bulbasaur bulbasaur2 = new Bulbasaur("Fuschia",500,5,6);

	System.out.println("Bulbasaur count: " + Bulbasaur.bulbasaurCount);
	
	bulbasaur2.battleInitializer();
	
}
	
	
}

class BulbasaurBattle3Thread implements Runnable {
	
	// implement the run method

public void run() {
	
	Bulbasaur bulbasaur3 = new Bulbasaur("Hemp",0,13,10);

	System.out.println("Bulbasaur count: " + Bulbasaur.bulbasaurCount);
	
	bulbasaur3.battleInitializer();
	
}
	
	
}





class BulbasaurTest {

// Note: This is where we create new Bulbasaur objects and call methods in the Bulbasaur class

// Main method

public static void main (String [] args) {
	
	

// Create new Bulbasaur object
	
// Key: public Bulbasaur(String objName, int objXp, int objLevel, int objBattleTimes)

Bulbasaur bulbasaur1 = new Bulbasaur("Bulba",800,15,3);

System.out.println("Bulbasaur count: " + Bulbasaur.bulbasaurCount);

// Start a NEW THREAD for bulbasaur2 to battle on so they can battle simultaneously

// Runnable theSecondJob = new BulbasaurBattle2Thread();

// Thread bulbasaurBattle2 = new Thread(theSecondJob);

// bulbasaurBattle2.start();

// Start a NEW THREAD for bulbasaur3 to battle on so the can battle simultaneously

// Runnable theThirdJob = new BulbasaurBattle3Thread();

// Thread bulbasaurBattle3 = new Thread(theThirdJob);

// bulbasaurBattle3.start();




bulbasaur1.battleInitializer();





}

}







// Encapsulation Program (Private instance variables and public getters and setters)

Class Bulbasaur {

/// Instance Variables

int level;

int xp;

// Methods

/// Getters and Setters

//// Set Bulbasaur level

public void setLevel(int l) {

level = l;

}

//// Set Bulbasaur xp

public void setXp(int x) {

xp = x;

}

//// Get Bulbasaur level

public int getLevel() {
return level;

}

//// Get Bulbasaur xp

public int getXp() {
return xp;

}

/// Other Methods

//// Battle

public void battle(int xp, int level) {

// increment xp and level

xp = xp + 100;

/// If xp reaches 1000, level up and set xp equal to 0

if ( level = 1000) {

// set xp to 0 and increment level by 1

xp = 0;
level = level + 1;

// Call levelUp method

levelup(xp, level);

}

else if (level < 1000) {

System.out.println ("Bulbasaur level: " + level + "Bulbasaur xp: " + xp);

}

}


public int levelup (int xp, int level) {

System.out.println("Bulbasaur leveled up");

System.out.println("Bulbasaur level: " + level + "Bulbasaur xp: " + xp);

}

}



Class BulbasaurTests {

// Main method

public static void main (String [] args) {

// Create new Bulbasaur object

Bulbasaur bulbasaur1 = new Bulbasaur();

bulbasaur1.setLevel(3);
bulsasaur1.setXp(300);

// Call battle method on bulbasaur1 object

bulbasaur1.battle

}

}



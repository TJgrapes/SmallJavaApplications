class Doggy {

public int numOfBarks = 3;

public void bark (int numOfBarks) {

while ( numOfBarks > 0) {
System.out.println("Woof");
numOfBarks = numOfBarks-1;

}
}
}

class TestDriveDoggy {

public static void main (String [] args) {

// Create Dog Objects

Doggy one = new Doggy();
Doggy two = new Doggy();
Doggy three = new Doggy();

// Set variables of Doggy objects

one.numOfBarks = numOfBarks;
two.numOfBarks = numOfBarks;
three.numOfBarks = numOfBarks;

// Make Doggys bark three times

one.bark(numOfBarks);
two.bark(numOfBarks);
three.bark(numOfBarks);

}
}

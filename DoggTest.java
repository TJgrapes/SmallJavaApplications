// Practicing input arguments and return methods

class Dogg {

int size;

//** Must create numOfBarks as an instance variable for it to work (exist in the program) within the methods where it is not an input paramter: The setBarks method and the getBarks method.. (It works without the numOfBarks instance variable in the bark method because it is passing an argument into the method each time and thus the value exists and is able to be used in the method

// Will this change once we incorporate encapsulation??

int numOfBarks;

String name;

public void setBarks (int b) {

numOfBarks = b;

}

public void bark(int numOfBarks) {

while (numOfBarks > 0) {

System.out.println("Woof");

numOfBarks = numOfBarks - 1;

}

}

public int getBarks() {

return numOfBarks;

}

}

class DoggTest {

public static void main (String [] args) {

Dogg myDogg = new Dogg();

myDogg.bark(3);

Dogg myDogg2 = new Dogg();

myDogg2.bark(5);

myDogg.setBarks(4);

myDogg2.setBarks(7);


int myDoggBarks = myDogg.getBarks();

System.out.println(myDoggBarks);

int myDogg2Barks = myDogg2.getBarks();

System.out.println(myDogg2Barks);



}

}


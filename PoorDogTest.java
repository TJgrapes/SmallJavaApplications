// See that instance variables are given a default intial value if they are not initialized

// See that local variables that are not initialized will stop compilation

class PoorDog {

int size;

String name;

public void setName(String n) {

name = n;

}

public String getName() {

return name;

}

public void setSize(int s) {

//int x;

//size = s + x;

// Will throw error because local variables was not initialized:

//error: variable x might not have been initialized
//size = s + x;

size = s;

}

public int getSize() {

return size;

}

}

class PoorDogTest {

public static void main (String [] args) {

PoorDog myPoorDog = new PoorDog();


//myPoorDog.setSize();

// Will throw an error because setSize requires a method parameter which is not initialized:

// error: method setSize in class PoorDog cannot be applied to given types;
// myPoorDog.setSize();required: int found: no arguments



int myPoorDogSize = myPoorDog.getSize();

String myPoorDogName = myPoorDog.getName();

System.out.println(myPoorDogSize);

System.out.println(myPoorDogName);

// Outputs are 0 and null

}

}
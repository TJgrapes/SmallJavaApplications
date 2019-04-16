// Practcing using Encapsulation

///* If we try to set size directly with .size, we get the error:  error: size has private access in GoodDog and are unable to set it :)

class GoodDog {

private int size;

public int getSize() {

return size;

}

public void setSize(int s) {

size = s;

}

void bark() {

System.out.println("Woof");

}

}

class GoodDogTestClass {

public static void main (String [] args) {

GoodDog myDog = new GoodDog();

//* If we try to set size directly with .size, we get the error:  error: size has private access in GoodDog and are unable to set it :)

//myDog.size = 8;

myDog.setSize(9);

int myDogSize = myDog.getSize();

System.out.println(myDogSize);

}

}
// Java application with a class and a test class to create and test the object

// Dog class

class Dog {

int size;
String breed;
String name;

void bark() {
System.out.println("Woof Woof");
}

}
// Test Class

class TestClass {
public static void main (String[] args) { // main method goes in the test class

// Create object in main method to test state and behavior

Dog casper = new Dog();

// Set instance variables and call method

casper.size = 55;
casper.breed = "goldenretriever";
casper.name = "casper";

System.out.println(casper.size);
System.out.println(casper.breed);
System.out.println(casper.name);

casper.bark();

}
}




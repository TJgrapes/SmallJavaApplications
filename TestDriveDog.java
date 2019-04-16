// Testing how instance variables affect the method

Class Dog {

int size;
String name;

void bark() {

if (size > 70) {
System.out.println("Woof Woof");
}

else if (size > 14) {
System.out.println("Ruff Ruff");
}

else if (size > 0) {
System.out.println("Yip Yip");
}
}
}

// Test Class to test Dog Class and create Dog objects

Class TestDriveDog {

public static void main (String[] args) {

// Create Dog1 object

Dog dog1 = new Dog();

dog1.size = 71;
dog1.name = "Fred":

// Make dog1 bark

dog1.bark();

// Create dog2 object

Dog dog2 = new Dog();

dog2.size = 15;
dog2.name = "James";

// Make dog2 bark

dog2.bark();

//Create dog3 object

Dog dog3 = New Dog();

dog3.size = 1;
dog3.name = "Taylor";

// Make dog3 bark

dog3.bark();

}
}





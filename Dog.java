class Dog {

String name;
public static void main (String[] args) {

public void bark () {
System.out.println(name + "says Ruff");
}

Dog dog1 = new Dog();
dog1.bark();
dog1.name = "Bart";

// Create a Dog Array

Dog() myDogs = new Dog[3];

// Put dogs into myDogs

myDogs[0] = new Dog();
myDogs[1] = new Dog();
myDogs[2] = dog1;

// Access Dogs using array reference

myDogs[0].name = "Fred";
myDogs[1].name = "Marge";

System.out.println("last dog's name is ");
System.out.println(myDogs[2].name);

// Loop through array and tell all dogs to bark

int x = 0;

while (x < myDogs.length) {
myDogs[x].bark();
x = x + 1;
}
}
}
}
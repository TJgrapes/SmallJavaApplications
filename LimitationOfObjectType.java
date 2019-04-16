// Seeing the limitations of using Object as the reference type

import java.util.ArrayList;

class LimitationOfObjectType {

public static void main (String [] args) {

// create Dog objects

Dog dog1 = new Dog();

Dog dog2 = new Dog();

ArrayList<Object> dogArrayList = new ArrayList<Object>();

// Add Dog objects to the Object array 

dogArrayList.add(dog1);

dogArrayList.add(dog2);

// Try to get the Dog object and store it in a Dog variable: Will come out as type object, so we won't be able to store it as a Dog type variable (because the array was created using the Object reference type)

// Get this error: error: incompatible types: Object cannot be converted to Dog

//Dog myDog = dogArrayList.get(1);

//However, we can do a cast to cast it to type Dog and store it as a Dog type variable

Dog myDogCast = (Dog) dogArrayList.get(1);

// Check to see that cast allowed me to use Dog method on the Dog instance

myDogCast.castDog();



// However, we can store it in an Object variable type

Object myDog = dogArrayList.get(1);


}

}

class Dog {

int size;

String name;

public void castDog() {

System.out.println("I am now a dog");

}

}
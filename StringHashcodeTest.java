class StringHashcode {

public StringHashcode(String s) {

myString = s;

}

private String myString;

public String getMyString() {

return myString;

}

// Override the hashCode() method so that it assigns a Hashcode BASED ON A STRING:
// SPECIFICALLY, THE myString String

public int hashCode() {

return myString.hashCode();

}

// Override the equals() method SO THAT TWO OBJECTS ARE EQUAL IF THEIR myString string INSTANCE VARIABLES ARE EQUAL


public boolean equals(StringHashcode shc) {

return getMyString().equals(shc.getMyString());

}



}

class StringHashcodeTest {

public static void main (String[] args) {

// Create an object with instance String variable "Hello"

StringHashcode sameHash = new StringHashcode("Hello");

// BEFORE OVERRIDING THE hashCode() METHOD

// Prints out hashcodes for ON THE STRINGHASHCODE OBJECT, NOT ON ITS STRING OBJECTS
// Get different hashcodes for the two different objects


// AFTER OVERRIDING THE hashCode() METHOD

// Prints out hashcodes ON THE myString STRING instance variable:
// So IF THE STRINGS ARE THE SAME, WILL PRINT OUT THE SAME HASHCODES

int sameHashInt = sameHash.hashCode();

System.out.println("Hashcode for first StringHashcode object: " + sameHashInt);

// Create a new object with same String

StringHashcode newSameHash = new StringHashcode("Hello");

int newSameHashInt = newSameHash.hashCode();

System.out.println("Hashcode for second StringHashcode object: " +newSameHashInt);

// BEFORE OVERRIDING equals() method:
// Prints false

// AFTER OVERRIDING equals() method:
// RETURNS true IF TWO OBJECTS HAVE THE SAME myString string

boolean eq = sameHash.equals(newSameHash);

System.out.println("Objects are equal: " + eq);


// Check for object REFERENCE equality: use ==

int sameHashIntCopy = sameHashInt;

// Return true if both references point to the same object

if ( sameHashInt == sameHashIntCopy) {

System.out.println("Reference equality: " + true);

}



}

}
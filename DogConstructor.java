public class DogConstructor {

int age;



// Dog class constructor

public DogConstructor(int dogsAge ) {

age = dogsAge;

}

public void ageMethod( int dogsAge ) {

System.out.println("Your dog is " + age + " years old");

}


public static void main (String [] args) {

DogConstructor myDog = new DogConstructor(2);

int myDogAge = myDog.age;

System.out.println(myDogAge);

myDog.ageMethod(myDogAge);

}

}
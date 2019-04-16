// Practicing Superclass constructors with argumrnts; Seeing how a subclass can access private variables of its superclass by calling its superclass constructor and passing in a variable

class Animal {


private String name;


public String getName() {

return name;

}

// Animal constructor

public Animal (String theName) {

name = theName;

}

}

class Hippo extends Animal {

// Hippo constructor

public Hippo(String n) {

// Call the superclass constructor and pass in the name variable so the Animal part of the Hippo can store the name variable and the Hippo can then access the name variable when the getName method is called

super(n);

}

}

public class TestHippo {

public static void main (String [] args) {

Hippo h = new Hippo("Buffy");

System.out.println(h.getName());

}

}
// Practice using Inheritance; Overriding methods; Overloading methods; Calling superclass version of Method
// Practice using Polymorphism; Implementing interfaces



class Beverage implements Order {
	
// Beverage constructors
	
public Beverage(){
	System.out.println("The no arg Beverage constructor has been implemented");
}

	
public Beverage(String s, int o) {
	this(s);
	size = s;
	ounce =o;
	System.out.println("The Beverage(String s, int o) constructor has been implemented");
}

public Beverage(String s) {
	this();
	size = s;
	System.out.println("The Beverage(String s) constructor has been implemented");
}

public Beverage(int o){
	ounce = o;
}



	
// Instance variables

private int ounce;

private String size;

// Methods

/// Other Methods

// Override the abstract method in the Order interface

public void orderInterfaceImplemented(){
	System.out.println("The Beverage class has implemented the Order interface and overridden its method");
}

/// Getters and Setters

//// Getters


public int getOz () {

return ounce;

}

public String getSize(){
	return size;
}

//// Setters

public void setOz ( int oz ) {

ounce = oz;

}

public void setSize(String s) {
	size = s;
}

/// Other Methods

public void beverage(){
	System.out.println("I am a beverage");
}
//Overloaded method: Changed argument list of beverage method (added a String for condiment), which is used to append output string

public void beverage(String c) {
	
	System.out.println("I am a beverage with " + c);
}


}

class Coffee extends Beverage implements Order {
	
	// Coffee constructors
	
public Coffee(){
	super();
	System.out.println("The no arg Coffee constructor has been implemented");
	
}


public Coffee(String s, int o) {
	// Send coffee instance variables to the superclass (beverage) constructor, so the 'beverage part' of coffee can store (initialize) those variables and make them accessible when we call the getter methods on the coffee object
	// We must do this because the instance variables are marked private, which means they are not inherited by the subclasses
	super(s,o);
	System.out.println("The Coffee constructor(String s, int o) has been implemented");

}

public Coffee (String s, int o, boolean dr){
	super(s,o);
	darkRoast = dr;
	System.out.println("The Coffee constructor(String s, int o, boolean dr) has been implemented");
}

public Coffee(String s){
	super(s);
	System.out.println("The Coffee constructor(String s) for this Coffee has been implemented");
	
}

public Coffee(int o){
	super(o);
	System.out.println("The Coffee constructor(int o) for this Coffee has been implemented");
	
}

	/// Instance Variables

boolean darkRoast;
boolean mediumRoast;
boolean lightRoast;

	// Methods

	/// Other methods

	// Override the beverage method: First, use the superclass beverage method, then add additional code: "But I am also a coffee"
	
	public void beverage() {
		super.beverage();
		System.out.println("But I am also a coffee");
	}
	
	
	// Override the overloaded beverage method in the Beverage class
	public void beverage(String c) {
	
	System.out.println("I am a coffee with " + c);
}

	// Override the abstract method in Order interface

	public void orderInterfaceImplemented() {
		System.out.println("The Coffee class has implemented the Order interface and overridden its method");
	}

	/// Getters and Setters

	//// Getters

	///// Get the boolean roast value

	boolean getRoast(){
		
		if (darkRoast) {
			return darkRoast;
		}
		
		else if (mediumRoast){
			return mediumRoast;
		}
		
		else if (lightRoast){
			return lightRoast;
		}
		
		else {
			System.out.println("No roast specified");
			return false;
		}
	}
	
}

public class Inheritance implements Comparable<T> {

public static void main (String [] args) {

// Other Coffee Objects

// Create a Coffee object (set values for both size and ounce)
	
	/*
	Coffee java = new Coffee("Medium", 12);
	
	int javaOz = java.getOz();
	System.out.println(javaOz);
	
	String javaSize = java.getSize();
	System.out.println(javaSize);
	
	// Call the Coffee beverage method, which first calls the superclass beverage method
	java.beverage();
	
	// Call the inherited, overloaded beverage method from the Beverage class
	java.beverage("sugar");
	
	*/
	
	/* Create a Coffee object: only initialize the size: the Coffee constructor with only the size argument will be called, which will first call the superclass beverage constructor with only the size argument
	Since ounce variable is not initialized, it will be given a default value of 0 by Java
	*/
	
	/* 
	
	Coffee javaString = new Coffee("Large");
	
	
	String javaStringSize = javaString.getSize();
	System.out.println(javaStringSize);
	
	int javaStringOz = javaString.getOz();
	System.out.println(javaStringOz);
	
	
	// Create a Coffee object but only initialize the ounce variable; uninitialized name variable will be set to null
	
	Coffee javaInt = new Coffee(16);
	
	int javaOunce = javaInt.getOz();
	System.out.println(javaOunce);
	
	String javaIntSize = javaInt.getSize();
	System.out.println(javaIntSize);
	*/
	
	
	Coffee javaDarkRoasted = new Coffee("Large", 16, true);
	
	String javaStringRoast = javaDarkRoasted.getSize();
	System.out.println(javaStringRoast);
	
	int javaIntRoast = javaDarkRoasted.getOz();
	System.out.println(javaIntRoast);
	
	boolean javaBoolRoast = javaDarkRoasted.getRoast();
	System.out.println(javaBoolRoast);
	
	javaDarkRoasted.orderInterfaceImplemented();
	
	
	// Practice creating an object using polymorphism (Assign a Coffee object to a Beverage reference variable)
	
	Beverage BevPoly = new Coffee("Medium", 12);
	
	
	String BevPolySize = BevPoly.getSize();
	System.out.println(BevPolySize);
	
	int BevPolyOz = BevPoly.getOz();
	System.out.println(BevPolyOz);
	
	// Since it is a Coffee object, it will use the overridden method in the Coffee class
	BevPoly.orderInterfaceImplemented();
	
	// Create a Beverage object
	
	Beverage myBev = new Beverage("Small", 8);
	
	String myBevSize = myBev.getSize();
	System.out.println(myBevSize);
	
	int myBevOz = myBev.getOz();
	System.out.println(myBevOz);
	
	myBev.orderInterfaceImplemented();
	
	
	
}

}

interface Order {
	// Abstract Methods
	
	public void orderInterfaceImplemented();
}








class ExceptionHandling {

public static void main (String[] args) {

// Try block runs if we use this variable
String myNumberString = "3";

/* Throws an exception when we run the parseInt method, because the parseInt method only works if the String is in 'number form'
*/
String myNumberString2 = "three";

try {

Integer myNumberInt = Integer.parseInt(myNumberString2);

System.out.println(myNumberInt);

}

catch(NumberFormatException e) {
System.out.println("Integer.parseInt method threw an exception!");

}

finally {

System.out.println("tryRiskyMethod has finished");

}

}

}




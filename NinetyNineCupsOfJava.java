// 99 cups of Java on the table application

public class NinetyNineCupsOfJava {

public static void main (String [] args) {

// Create variables

int numCups = 99;

String cupsWord = "cups";



// Create while loop for while numCups is greater than or equal to 0

while ( numCups > 0) {

// change "cups" to "cup" when numCups == 1
if (numCups == 1) {
cupsWord = "cup";
}


// Create output message


System.out.println(numCups + " " + cupsWord + " of Java on the table");
System.out.println(numCups + " " + cupsWord + " of Java");
System.out.println("Take one out, pass it around");


// decrement numCups

numCups = numCups - 1;



// Output message when there are still cups left

// change "cups" to "cup" when numCups == 1
if (numCups == 1) {
cupsWord = "cup";
}

if ( numCups > 0) {
System.out.println(numCups + " " + cupsWord + " of Java");
}



//Output message when there are no cups left

else {
System.out.println("There are no more cups of Java");
}
}
}
}



import java.util.Scanner;

class MinAndMaxInputChallenge {


public static void minAndMax() {

int min = -1;

int max = -1;

boolean first = true; // boolean flag to determine if the user has entered a number


Scanner scanner = new Scanner(System.in);

while (true) {

System.out.println("Enter number:");

if(!scanner.hasNextInt()) {

// Use the boolean flag here to indicate if that no values were entered if the 
// first value entered was invalid

if(first) {

first = false;

System.out.println("No values were entered");

break; // break out of the while loop so the min and max values are not printed

}

// Prints out min and max values after at lease 1 valid value was entered

System.out.println("Minimum number: " + min);

System.out.println("Maximum number: " + max);

break;

}

else if(scanner.hasNextInt()) {

int numberEntered = scanner.nextInt();

//Ensures that only numbers entered will be the min and max values, instead of the initial 
// values that were set as placeholders for min and max

if(first) {

first = false;

min = numberEntered;

max = numberEntered;

}

if(numberEntered < min) {

min = numberEntered;

System.out.println(min+ " is currently the minimum number");

}

else if (numberEntered > max) {

max = numberEntered;

System.out.println(max + " is currently the maximum number");

}

else if (min < numberEntered && numberEntered < max) {

System.out.println(numberEntered + " is neither the minimum nor the maximum");

}

else if (min == numberEntered || max == numberEntered) {

System.out.println(numberEntered + " is either equal to the current minimum or maximum value");

}



scanner.nextLine();

} // else if

} // while loop
    
scanner.close();
    
} // method

} // class

class MinAndMaxInputChallengeTest {

    public static void main (String[] args) {

	System.out.println("Enter numbers and the program will determine the minimum and maximum values entered");

	MinAndMaxInputChallenge.minAndMax();
        
    }
    
    
}
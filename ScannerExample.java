import java.util.Scanner;

class ScannerExample {

public static void main (String [] args) {

// Allows user to read a number from System.in

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number: ");

/* nextInt Scans the next token of the input as an int and returns the int scanned from the input
*/

int n = sc.nextInt();

System.out.println("The given number : " + n );

}

}
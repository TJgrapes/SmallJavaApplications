import java.util.Scanner;

class ScannerAdd {
    
public static void add10Numbers() {

int numberCounter = 1;

int sum = 0;

Scanner scanner = new Scanner(System.in);


while(numberCounter < 11) {

	System.out.println("Enter number #" + numberCounter);

	if (!scanner.hasNextInt()) {

	System.out.println("Invalid number");

	scanner.nextLine(); // handles enter key, so loop won't run forever

	continue;

	}

	else if(scanner.hasNextInt()) {
	
	sum+= scanner.nextInt();

	scanner.nextLine();

	numberCounter++;
        
    }

}

scanner.close();

System.out.println("Total sum of the numbers entered " + sum);

    
}

}

class ScannerAddTest {



    public static void main (String[] args) {

	System.out.println("Enter 10 numbers that you would like to sum");

	ScannerAdd.add10Numbers();

	
}
    
    
}
class Switch2 {
    

    
}

class Swtich2Test {

    public static void main (String[] args) {

	char character = 'A';

	switch (character) {

		case 'A': System.out.println("Character " + character + " was found");

		break;

		case 'B': System.out.println("Character " + character + " was found");

		break;

		case 'C': System.out.println("Character " + character + " was found");

		break;

		case 'D': System.out.println("Character " + character + " was found");

		break;

		case 'E': System.out.println("Character " + character + " was found");

		break;

		default: System.out.println("No character was found");

		break;

		
        
  		}

	String month = "July";

	switch (month.toLowerCase()) {

	case "january": case "febuary": case "march": System.out.println("You are in the first quarter of the year and it is " + month);

	break;

	case "april": case "may": case "june" : System.out.println("You are in the second quarter of the year and it is " + month);

	break;

	case "july": case "august": case "september": System.out.println("You are in the third quarter of the year and it is " + month);

	break;

	case "october": case "november": case "december": System.out.println("You are in the fourth quarter of the year and it is " + month);

	break;

	default: System.out.println("A valid month wasn't entered");

}












	}
    
    
}
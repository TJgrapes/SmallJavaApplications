public class Switch {

public static void main (String [] args) {

int minutes = 150;

switch (minutes) {

	case 30: System.out.println("We can play one match of badminton");

		break;

	case 60: System.out.println("We can play two matches of badminton");

		break;

	case 90: case 120: case 150: System.out.println("We can play more than two matches of badminton");

		break;

	default: System.out.println("We cannot play badminton");

}

}

}


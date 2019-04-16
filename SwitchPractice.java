/* Practicing using switch statement: Use to match specific case
Switch allows us to check equality of a variable or expresiion with a value that does ot need to be a boolean
*/

class SwitchPractice {

public static void main (String[] args) {

int cards = 4;

switch(cards) {

case 0: System.out.println("Add you cards here");
break;

case 1: System.out.println("4 more cards available");
break;

case 2: System.out.println("3 more cards available");
break;

case 3: System.out.println("2 more cards available");
break;

case 4: System.out.println("1 more card available");
break;

case 5: System.out.println("You are currently using all available cards");
break;

default:
break;

}

}

}


public class Ternary {

public static void main (String [] args) {

int points = 21;

char gameOver = ( points >= 21 ) ? 'Y' : 'N';

System.out.println(gameOver);

points = points - 1;

char gameOver2 = ( points >= 21 ) ? 'Y' : 'N';

System.out.println(gameOver2);

}

}
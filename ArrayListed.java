import java.util.ArrayList;

public class ArrayListed {

public static void main (String [] args) {

ArrayList<Integer> myFavoriteNumbers = new ArrayList<Integer>();

myFavoriteNumbers.add(6);

myFavoriteNumbers.add(8);

myFavoriteNumbers.add(10);

myFavoriteNumbers.add(12);

myFavoriteNumbers.add(0, 4);

System.out.println(myFavoriteNumbers.get(2));

// Iterate through the ArrayList to print out all its elements

for ( int i = 0; i < myFavoriteNumbers.size(); i++ ) {

System.out.println(myFavoriteNumbers.get(i));

}

for ( int number : myFavoriteNumbers) {

System.out.println(number);

}

}

}


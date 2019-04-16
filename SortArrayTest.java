import java.util.Scanner;
import java.util.Arrays;

class SortArray {

public static int[] getIntegers(int capacity) {

Scanner scanner = new Scanner(System.in);

int [] array = new int[capacity];

System.out.println("Enter " + capacity + " integer values to be sorted: \n");

// populate the array

for(int i = 0; i < array.length; i++) {

array[i] = scanner.nextInt();

}

return array;

}


public static void printArray(int[] array) {

for(int i = 0; i < array.length; i++) {

System.out.println("Element at " + i + " contains " + array[i] );

}

}

public static int[] sortIntegers(int[] array) {

// Copy the array

int[] sortedArray = new int[array.length];

for(int i = 0; i<array.length; i++) {

sortedArray[i] = array[i];

}

// Sort the array

boolean flag = true;

int temp;

while(flag) {

flag = false;

for(int i = 0; i<sortedArray.length-1; i++) {

if(sortedArray[i] < sortedArray[i+1]) {

temp = sortedArray[i];

sortedArray[i] = sortedArray[i+1];

sortedArray[i+1] = temp;

flag = true;

} // if

} // for

} // while

return sortedArray;

} // method



} // class

    

   

class SortArrayTest {

    public static void main (String[] args) {

	int myArray[] = SortArray.getIntegers(5);

	int[] sortedArray = SortArray.sortIntegers(myArray);

	SortArray.printArray(sortedArray);
	

	}

}
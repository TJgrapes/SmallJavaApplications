class Stack {


int maxSize; // Initializes the number of slots of the array

char[] stackArray; // Array to hold the data of the stack

int top; // Acts as a pointer for the item on the top of that Stack (The one inserted last)

public Stack(int size) {

maxSize = size;

stackArray = new char[maxSize];

top = -1;

}

// Pushes an element to the top of the stack

public void push(char j)  {

/*

if ( top < maxSize -1 ) {

top++;

stackArray[top] = j;

}

else {

System.out.println("The array is full!");

}

}

*/

if ( isFull() ) {

System.out.println("The stack is full");

}

else {

top++;

stackArray[top] = j;

}



}

// Pop the top element off of the stack

public char pop() {

if ( top == -1 ) {

System.out.println("The stack is empty");

return 'c';

}

else {

int oldTop = top;

top--;

return stackArray[oldTop];

}

}

// Get the element on the top of the stack

public char peak() {

return stackArray[top];

}

public boolean isEmpty() {

return (top == -1);

}

public boolean isFull() {

return (top == maxSize - 1);

}

// Use push and pop methods to reverse a given string

public String wordReverse(String s) {

// Create an empty string

String reverse = "";

// Push each character of the string onto the stack

for ( int i = 0; i < s.length(); i++) {

char pushed = s.charAt(i);

push(pushed);

}

// Pop each character off the stack and append it to the reverse string variable

for( int i = 0; i < s.length(); i++) {

char popped = pop();

reverse+= popped;

System.out.println(reverse);

}

return reverse;

}



}

class StackTest {

public static void main (String [] args) {

Stack myStack = new Stack(10);

String result = myStack.wordReverse("Hello");

System.out.println(result);

System.out.println(myStack.stackArray);

System.out.println(myStack.stackArray.length);


}

}
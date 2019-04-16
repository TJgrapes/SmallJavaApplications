class Queue {

int maxSize; // initializes the number of slots of the array

int[] queArray; // Array to hold the data

int front; // index position for the element in the front

int rear; // index position for the element at the back of the queue

int nItems; // counter to maintain the number of items in the queue

public Queue(int size) {

maxSize = size;

queArray = new int[size];

front = 0;

rear = -1;

nItems = 0;

}

// Insert elements at the end of the queue (so the more recent inserts will be first in the queue)

public void insert(int j) {

// This line allows us to overwrite old values because it resets the rear position
// Thus, we can continue to add elements above the specified array size;
// old values will just be overwritten

if (rear == maxSize - 1) {

rear = -1;

}

rear++;

queArray[rear] = j;

nItems++;

}

// "Removes" item from the front of the queue; Changes the front pointer variable

public int remove() {

int temp = queArray[front];

front++;

if( front == maxSize) {

front = 0;

}

nItems++;

return temp;

}

public int peekFront() {

return queArray[front];

}

public boolean isEmpty() {

return (nItems == 0);

}

public boolean isFull() {

return (nItems == maxSize);

}



// View the contents of the queue
public void view() {

for (int i = 0; i < queArray.length; i++) {

System.out.println(queArray[i]);

}

}

}




class QueueTest {

public static void main (String[] args) {

Queue myQueue = new Queue(5);

myQueue.insert(1);

myQueue.insert(2);

myQueue.insert(3);

myQueue.insert(4);

myQueue.insert(5);

// myQueue.insert(6);

System.out.println("Element at the front: " + myQueue.peekFront());

System.out.println("Removed " + myQueue.remove());

System.out.println("Element at the front: " + myQueue.peekFront());



myQueue.view();



}

}
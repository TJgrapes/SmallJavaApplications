class multiThreading implements Runnable {

// Implement the run method

public void run() {

try {

Thread.sleep(2000);

}

catch (InterruptedException ie) {

ie.printStackTrace();

}

go();

}

public void go() {

doMore();

}

public void doMore() {

System.out.println("In new thread");

}

}

class MultithreadingTest {

public static void main (String[] args) {

// Create a Runnable object defined in class multiThreading

Runnable newThreadJob = new multiThreading();

// Create a new thread and pass it the Runnable object

Thread newThread = new Thread(newThreadJob);

// Start the new thread

newThread.start();

System.out.println("Back in main thread");

}

}




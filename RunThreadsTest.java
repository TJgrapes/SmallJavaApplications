class RunThreads implements Runnable {

public void run() {

for (int i = 0; i < 25; i++) {

String threadName = Thread.currentThread().getName();

System.out.println(threadName + " is running");

}

}

}

class RunThreadsTest {

public static void main (String[] args) {

RunThreads runner = new RunThreads();

Thread alpha = new Thread(runner);

Thread beta = new Thread(runner);

// alpha.setName("Alpha thread");

// beta.setName("Beta thread");

// Make both threads runnable

alpha.start();

beta.start();

}


}
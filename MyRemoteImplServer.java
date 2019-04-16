import java.rmi.*;
import java.rmi.server.*;

// Declare the methods here that will be available to the client

interface MyRemote extends Remote {

public String sayHello() throws RemoteException;

}

// Implement the methods that we declared in the MyRemote interface

class MyRemoteImplServer extends UnicastRemoteObject implements MyRemote {

public String sayHello() {

String hello = "Server says Hello!";

return hello;

}

// Since the superclass constructor for UnicastRemoteObject throws an exception, we must
// Create a constructor in this class just to declare the exception

public MyRemoteImplServer() throws RemoteException { }

public static void main (String[] args) {

/* Make the remote service available to clients; to do this, instantiate the myRemoteImpl class and put it into the RMI registry by calling the Naming.rebind method, giving it a name and the instance

When we register the implementation object, the RMI system actually puts the stub in the registry, since that's what the client really needs

*/

try {

MyRemote service = new MyRemoteImpl();

Naming.rebind("HelloServer", service);

}

catch(Exception ex) {

ex.printStackTrace();

}

}


}



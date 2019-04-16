import java.rmi.*;

class MyRemoteClient {

public static void main (String[] args) {

MyRemoteClient rem = new MyRemoteClient();

rem.go();

}

public void go() {

try {

MyRemote service = (MyRemote) Naming.lookup("rmi://192.168.0.7/Hello");

String s = service.sayHello();

System.out.println(s);

}

catch (Exception ex) {

ex.printStackTrace();

}

}

}




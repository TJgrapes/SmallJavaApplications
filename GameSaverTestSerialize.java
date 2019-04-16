import java.io.*;

class GameCharacter implements Serializable {

int power;
String type;

// GameCharacter constructor

public GameCharacter (int p, String t) {

power = p;
type = t;
}

public int getPower() {

return power;

}

public String getType() {

return type;

}

}


class GameSaverTestSerialize {

public static void main (String[] args) {

GameCharacter one = new GameCharacter(50, "Elf");

GameCharacter two = new GameCharacter(200, "Troll");

GameCharacter three = new GameCharacter(120, "Magician");

// Serialize the objects

try {

FileOutputStream fos = new FileOutputStream("Serialization.io");

ObjectOutputStream oos = new ObjectOutputStream(fos);

oos.writeObject(one);

oos.writeObject(two);

oos.writeObject(three);

oos.close();

}

catch(IOException ex) {

ex.printStackTrace();

}

// Deserialize the objects

try {

FileInputStream fis = new FileInputStream("Serialization.io");

ObjectInputStream ois = new ObjectInputStream(fis);

Object oneObj = ois.readObject();

Object twoObj = ois.readObject();

Object threeObj = ois.readObject();

GameCharacter oneChar = (GameCharacter) oneObj;

GameCharacter twoChar = (GameCharacter) twoObj;

GameCharacter threeChar = (GameCharacter) threeObj;

ois.close();

System.out.println(oneChar.getType());

System.out.println(twoChar.getType());

System.out.println(threeChar.getType());

}

catch (Exception ex) {

ex.printStackTrace();

}

}

}







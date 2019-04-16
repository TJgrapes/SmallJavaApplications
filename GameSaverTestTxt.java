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


class GameSaverTestTxt {

public static void main (String[] args) {

GameCharacter one = new GameCharacter(50, "Elf");

GameCharacter two = new GameCharacter(200, "Troll");

GameCharacter three = new GameCharacter(120, "Magician");

/*

// Save object state in Strings in a .txt file

try {

FileWriter writer = new FileWriter("Save.txt");

writer.write("Elf");

writer.write("\nTroll");

writer.write("\nMagician");

writer.close();


}

catch(IOException ex) {

ex.printStackTrace();

}

*/

try {

FileReader reader = new FileReader("Save.txt");

char[] cArray = reader.read("Save.txt");

System.out.println(cArray);


reader.close();


}

catch(IOException ex) {

ex.printStackTrace();

}

}

}





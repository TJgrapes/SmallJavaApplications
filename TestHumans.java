class Human {

int age;
String gender;
String name;

public void greet (String name, int age, String gender) {
System.out.println("Hi, I am " + name);
System.out.println(" I am " + age + " ,and " + gender);
}

}

class TestHumans {

public static void main (String [] args) {

Human taylor = new Human();

taylor.age = 24;
taylor.gender = "male";
taylor.name = "Taylor";

taylor.greet(taylor.name, taylor.age, taylor.gender);

Human shirly = new Human();

shirly.age = 26;
shirly.gender = "female";
shirly.name = "Shirly";

shirly.greet(shirly.name, shirly.age, shirly.gender);

Human chongqing = new Human();

chongqing.age = 40;
chongqing.gender = "male";
chongqing.name = "Chongqing";

chongqing.greet(chongqing.name, chongqing.age, chongqing.gender);

}
}


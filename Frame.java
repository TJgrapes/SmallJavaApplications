import javax.swing.*;

class Frame {

public static void main (String[] args) {

// Create JFrame

JFrame frame = new JFrame();

// Create button

JButton button = new JButton("Button");

// ORDER MATTERS: MUST ADD BUTTON BEFORE SETVISIBLE IN ORDER FOR IT TO SHOW

frame.getContentPane().add(button);

frame.setSize(1000,1000);

frame.setVisible(true);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

}
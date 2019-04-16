import javax.swing.*;
import java.awt.event.*;
import java.awt.Container.*;
import java.awt.*;


class MyDrawPanel extends JPanel {

public void paintComponent(Graphics g) {

g.setColor(Color.ORANGE);

g.fillRect(20,50,100,100);

}

}

class SimpleGui implements MouseListener {

JButton button;

static int clickCounter;

public void guiSetup() {

// Create a frame for the GUI
// This is what we add components to
JFrame frame = new JFrame();

// Create a button to add to the frame

button = new JButton("My button");

// Add button to the frame

frame.getContentPane().add(button);

// Create a new DrawPanel

MyDrawPanel myPanel = new MyDrawPanel();

// Add the DrawPanel to the frame

frame.getContentPane().add(myPanel);

frame.setSize(300,300);

frame.setVisible(true);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


// Add MouseListener Interface callback methods to the button

button.addMouseListener(this);

}

// Implement the Mouselistener methods

public void mouseClicked (MouseEvent e) {

button.setText("I was clicked");

clickCounter++;

if ( clickCounter > 1 && clickCounter < 11 ) {

System.out.println("You clicked me " + clickCounter + " times");

}

else if ( clickCounter < 11 ) {

System.out.println("You clicked me " + clickCounter + " time");

}

else {

button.setText("Do not click me anymore!");
System.out.println("Do not click me anymore!");

}

}

public void mouseEntered (MouseEvent e) {



}

public void mouseExited (MouseEvent e) {



}

public void mousePressed (MouseEvent e) {



}

public void mouseReleased (MouseEvent e) {



}



}


class SimpleGui2 {

public static void main (String[] args) {

SimpleGui myGui = new SimpleGui();

myGui.guiSetup();

}

}
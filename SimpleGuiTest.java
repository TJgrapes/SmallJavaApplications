import javax.swing.*;
import java.awt.event.*;

class SimpleGui implements ActionListener, MouseListener {

JButton button;

static int clickCounter;

public void guiSetup() {

// Create a frame for the GUI
// This is what we add components to
JFrame frame = new JFrame();

// Create a button to add to the frame

button = new JButton("Click me");

// Add button to the frame

frame.getContentPane().add(button);

frame.setSize(5000,5000);

frame.setVisible(true);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Add ActionListener Interface callback methods to the button
button.addActionListener(this);

button.addMouseListener(this);

}

// Implement the ActionPerformed method
// This is a method that is called to let us know that an event happened

public void actionPerformed(ActionEvent event) {

button.setText("Some event happened to me!");

}

// Implement the Mouselistener methods

public void mouseClicked (MouseEvent e) {

clickCounter++;



if ( clickCounter > 1 && clickCounter < 11 ) {

System.out.println("You clicked me " + clickCounter + " times");

button.setText("I was clicked " + clickCounter + " times");

}

else if ( clickCounter == 1 ) {

System.out.println("You clicked me " + clickCounter + " time");

button.setText("I was clicked " + clickCounter + " time");

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

class SimpleGuiTest {

public static void main (String[] args) {

SimpleGui myGui = new SimpleGui();

myGui.guiSetup();

}

}






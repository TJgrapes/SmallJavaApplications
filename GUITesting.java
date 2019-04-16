import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class GUIOvalWidget extends JPanel {


public void paintComponent(Graphics g) {

// Create random colors

int red = (int) (Math.random() * 255);

int green = (int) (Math.random() * 255);

int blue = (int) (Math.random() * 255);

// Use the randomly generated colors as RGB values for the oval

Color ovalColor = new Color(red, green, blue);

g.setColor(ovalColor);

g.fillOval(70,70,100,100);

}

}

class CreateGUI {

// Create frame and label

JFrame frame;

JLabel label;

public void GUISetup() {

// Setup GUI

frame = new JFrame();

label = new JLabel("I'm a label");

/// Create button widget that will change oval color

JButton colorButton = new JButton("Change color");

/// Create button widget that will change text label

JButton labelButton = new JButton("Change label");

/// Register the buttons with ActionListener interface and pass their appropriate Listener interfaces as arguments

colorButton.addActionListener(new ColorListener());

labelButton.addActionListener(new LabelListener());

/// Create Oval widget

GUIOvalWidget ovalWidget = new GUIOvalWidget();

/// Add widgets to the frame

frame.getContentPane().add(BorderLayout.SOUTH, colorButton);

frame.getContentPane().add(BorderLayout.CENTER, ovalWidget);

frame.getContentPane().add(BorderLayout.EAST, labelButton);

frame.getContentPane().add(BorderLayout.WEST, label);

frame.setSize(300,300);

frame.setVisible(true);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}

// Set up event handling

/// Implement inner classes for Event handling

//// Implement inner class for colorButton

class ColorListener implements ActionListener {

public void actionPerformed(ActionEvent event) {

// Repaint the oval (Change the color) by calling repaint, which will call paintComponent()

frame.repaint();

}

}

//// Implement inner class for text label

class LabelListener implements ActionListener {

public void actionPerformed(ActionEvent event) {

label.setText("Label changed");

}

}

}



class GUITesting {

public static void main (String [] args) {

CreateGUI myGUI = new CreateGUI();

myGUI.GUISetup();


}

}


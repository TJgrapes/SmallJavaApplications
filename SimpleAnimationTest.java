import javax.swing.*;
import java.awt.*;

class SimpleAnimation {

// Starting x and y coordinates for the circle

int x = 70;

int y = 70;

public void setUp() {

/// Setup the GUI

// Create the components

JFrame frame = new JFrame();

MyDrawPanel drawPanel = new MyDrawPanel();

// Add drawPanel to the frame

frame.getContentPane().add(drawPanel);

// Setup the frame

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setSize(300,300);

frame.setVisible(true);


/// Animate the coordinates of circle
/// Move the circle down and to the right by 1 pixel 130 times

for (int i = 0; i < 130; i++) {

x++;

y++;

// This is where the circle is repainted and actually moves
// The repaint() method calls paintComponent() to redraw the circle with
// incremented coordinates 

drawPanel.repaint();

try {

// We put it to sleep so we can see the animation happen

Thread.sleep(50);

}

catch(Exception ex) {

ex.printStackTrace();

}

}

for (int i = 0; i < 130; i++) {

y--;

// This is where the circle is repainted and actually moves
// The repaint() method calls paintComponent() to redraw the circle with
// incremented coordinates 

drawPanel.repaint();

try {

// We put it to sleep so we can see the animation happen

Thread.sleep(50);

}

catch(Exception ex) {

ex.printStackTrace();

}

}

for (int i = 0; i < 130; i++) {

x--;

y++;

// This is where the circle is repainted and actually moves
// The repaint() method calls paintComponent() to redraw the circle with
// incremented coordinates 

drawPanel.repaint();

try {

// We put it to sleep so we can see the animation happen

Thread.sleep(50);

}

catch(Exception ex) {

ex.printStackTrace();

}

}

for (int i = 0; i < 130; i++) {

y--;

// This is where the circle is repainted and actually moves
// The repaint() method calls paintComponent() to redraw the circle with
// incremented coordinates 

drawPanel.repaint();

try {

// We put it to sleep so we can see the animation happen

Thread.sleep(50);

}

catch(Exception ex) {

ex.printStackTrace();

}

}

}


// The inner class, which has access to x and y variables

class MyDrawPanel extends JPanel {

public void paintComponent(Graphics g) {

int red = (int) (Math.random() * 255);

int green = (int) (Math.random() * 255);

int blue = (int) (Math.random() * 255);

Color randomColor = new Color(red, green, blue);

g.setColor(randomColor);

// Updates the coordinates of the circle to the new incremented x and y values
// from the for loop inside the go method

g.fillOval(x,y,40,40);

}

}

}

class SimpleAnimationTest {

public static void main(String[] args) {

SimpleAnimation myAnimation = new SimpleAnimation();

myAnimation.setUp();

}

}

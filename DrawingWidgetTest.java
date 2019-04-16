import java.awt.*;
import javax.swing.*;


class DrawingWidget extends JPanel {


public void paintComponent(Graphics g) {

// Paint a graphic object

// Color myColor = new Color(255,0,0);

// Set the color of the graphics object

// g.setColor(myColor);

// Set the shape of the graphics object to a rectangle

// g.fillRect(20,50,100,100);

// Display an image as the graphic object

  File myPic = new File("TerrorJrGrapes.png");

  Image image = new ImageIcon(myPic).getImage();

  g.drawImage(image,100,100,this);

}

}

class DrawingWidgetGUI {

public void GUISetup() {

JFrame frame = new JFrame();

DrawingWidget myWidget = new DrawingWidget();

frame.getContentPane().add(myWidget);

frame.setSize(500,500);

frame.setVisible(true);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

}

class DrawingWidgetTest {

public static void main (String [] args) {

DrawingWidgetGUI dwGUI = new DrawingWidgetGUI();

dwGUI.GUISetup();

}

}


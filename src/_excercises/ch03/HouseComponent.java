package _excercises.ch03;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
This component draws a house.
*/
public class HouseComponent extends JComponent {
  
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    
    House house = new House(5, 100);
    
    house.draw(g2);
  }
  
}

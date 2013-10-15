package _excercises.ch03;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
A house that can be positioned anywhere on the screen.
*/
public class House {
  
  private int xPos;
  private int yPos;

  public House(int x, int y) {
    xPos = x;
    yPos = y;
  }
  
  public void draw(Graphics2D g2) {
    Rectangle front = new Rectangle(xPos, yPos, 100, 100);
    Rectangle door = new Rectangle(xPos+10, yPos+60, 20, 40);
    Rectangle window = new Rectangle(xPos+60, yPos+30, 20, 20);
    
    Point2D.Double roofLeftPoint = new Point2D.Double(xPos, yPos);
    Point2D.Double roofRightPoint = new Point2D.Double(xPos+100, yPos);
    Point2D.Double roofTopPoint = new Point2D.Double(xPos+50, yPos-50);
    
    Line2D.Double roofLeftLine = new Line2D.Double(roofLeftPoint,
                                                   roofTopPoint);
    Line2D.Double roofRightLine = new Line2D.Double(roofRightPoint, 
                                                    roofTopPoint);
    
    g2.draw(front);
    g2.draw(door);
    g2.draw(window);
    g2.draw(roofLeftLine);
    g2.draw(roofRightLine);
  }
  
  public int[] setPos(int x, int y) {
    xPos = x;
    yPos = y;
    
    return new int[]{xPos, yPos};
  }
  
  public int[] getPos() {
    return new int[]{xPos, yPos};
  }

  public int getxPos() {
    return xPos;
  }

  public int getyPos() {
    return yPos;
  }  

}

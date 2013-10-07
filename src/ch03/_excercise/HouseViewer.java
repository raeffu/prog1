package ch03._excercise;

import javax.swing.JFrame;

public class HouseViewer {

  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setSize(300, 400);
    frame.setTitle("A House, in the middle of the street.");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    HouseComponent component = new HouseComponent();
    frame.add(component);

    frame.setVisible(true);
  }

}

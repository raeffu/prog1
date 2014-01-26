package _excercises.ch08.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class ListenerTimerTester {
  
  public static void main(String[] args) {
  
    class MyListener implements ActionListener {

      public void actionPerformed(ActionEvent event) {
        System.out.println("action");
      }
      
    }
    
    ActionListener listener = new MyListener();
    
    final int DELAY = 1000; // Milliseconds between timer ticks
    Timer t = new Timer(DELAY, listener);
    t.start();
  }
}

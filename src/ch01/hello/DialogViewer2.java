package ch01.hello;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogViewer2 {

  public static void main(String[] args) throws Exception {
    URL imageLoc = new URL("http://www.asdf.com/89asdf.gif");
    
    JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLoc));
    
//    String name = JOptionPane.showInputDialog("What is your name?");
//    JOptionPane.showMessageDialog(null, "Your name is: "+name);
    System.exit(0);
  }

}

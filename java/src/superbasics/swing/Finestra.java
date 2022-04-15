package superbasics.swing;

import javax.swing.*;
import java.awt.*;

public class Finestra extends JFrame {
 Finestra(){
     setTitle("App");
     setLocation(200,200);
     setSize(500,500);
     setLayout(null);
     // defined in another class to declutter the code
     PannelloInterattivo p1 = new PannelloInterattivo();

     add(p1);
     JPanel p2 = new JPanel();
     p2.setSize(500,350);
     p2.setLocation(0,250);
     p2.setBackground(Color.LIGHT_GRAY);

     add(p2);

     setVisible(true);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 }

}

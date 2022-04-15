package oop.laura.oggetti.swing;

import javax.swing.*;
import java.awt.*;

public class Finestra extends JFrame {
 Finestra(){

     setTitle("App");
     setLocation(1000,100);
     setSize(500,500);
     setLayout(null);

     Pannello p = new Pannello();
     p.setLocation(0,0);
     p.setBackground(Color.PINK);

     Pannello p2 = new Pannello();
     p2.setLocation(0,250);
     p2.setBackground(Color.LIGHT_GRAY);

     add(p);
     add(p2);

     setVisible(true);
 }

}

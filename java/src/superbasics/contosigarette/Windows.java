package superbasics.contosigarette;

import javax.swing.*;

public class Windows extends JFrame {
    Windows(){
        setTitle("Conteggio Sigarette");
        setLocation(200,200);
        setSize(400,500);
        setResizable(false);
        setLayout(null);

        MainPanel p1 = new MainPanel();
        add(p1);

        setVisible(true);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

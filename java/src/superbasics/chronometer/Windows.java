package superbasics.chronometer;

import javax.swing.*;

public class Windows extends JFrame {

    Windows(){
        setTitle("App");
        setLocation(200,200);
        setSize(500,500);
        setLayout(null);

        Panel p = new Panel();
        add(p);

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}

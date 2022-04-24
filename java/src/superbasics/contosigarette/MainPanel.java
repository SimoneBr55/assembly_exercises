package superbasics.contosigarette;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    JLabel nSig;
    JButton plus;
    JButton minus;
    JButton reset;
    Integer countSig = 0;

    JLabel title;

    MainPanel(){
        Panel p1 = new Panel();
        setSize(400,500);
        setLocation(0,0);
        setBackground(Color.WHITE);
        setLayout(null);

        title = new JLabel("Conteggio delle mie Sigarette", SwingConstants.CENTER);
        title.setSize(400,200);
        title.setLocation(0,-70);
        add(title);

        nSig = new JLabel("0", SwingConstants.CENTER);
        nSig.setSize(400,200);
        nSig.setLocation(0,0);
        nSig.setFont(new Font("Serif", Font.BOLD, 30));
        //nSig.setBackground(Color.BLACK);
        //nSig.setOpaque(true);
        //nSig.setText("Numero Sigarette");
        add(nSig);

        plus = new JButton();
        plus.setSize(100,50);
        plus.setText("+");
        plus.setLocation(100,200);
        add(plus);
        plus.addActionListener(e -> {
            countSig++;
            nSig.setText(countSig.toString());
        });

        minus = new JButton();
        minus.setSize(100,50);
        minus.setText("-");
        minus.setLocation(200,200);
        add(minus);
        minus.addActionListener(e -> {
            countSig--;
            nSig.setText(countSig.toString());
        });

        reset = new JButton();
        reset.setSize(100,50);
        reset.setText("Reset");
        reset.setLocation(150,250);
        add(reset);
        reset.addActionListener(e -> {
            countSig = 0;
            nSig.setText(countSig.toString());
        });

        // esiste scrollpanel
    }
}

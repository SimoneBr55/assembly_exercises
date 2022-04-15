package superbasics.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PannelloInterattivo extends JPanel {

    JTextField tf;
    JButton b1;
    JLabel l1;

    PannelloInterattivo() {
        Pannello p1 = new Pannello();
        setSize(500,250);
        setLocation(0,0);
        setBackground(new Color(240,225,100));
        setLayout(null);

        tf = new JTextField();
        tf.setSize(100,50);
        tf.setLocation(0,0);
        add(tf);

        b1 = new JButton();
        b1.setSize(100,50);
        b1.setText("Cliccami");
        b1.setLocation(100,0);
        add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String testo;
                //if (tf.getText().isEmpty()) { // potrebbero esserci problemi se per qualche
                // motivo si ha tf che è null
                if ("".equals(tf.getText())) { // considero a partire da "" che sono sicuro
                    // esistere
                    testo = "ERRORE";
                } else {
                    testo = tf.getText();
                }
                l1.setText(testo);
                //System.out.println(testo);
                //System.out.println("Sono stato premuto");
            }
        });

        l1 = new JLabel();
        l1.setSize(100,50);
        l1.setLocation(200,0);
        l1.setText("Ciao");
        l1.setOpaque(true);
        l1.setBackground(Color.CYAN);
        add(l1);

    }
}

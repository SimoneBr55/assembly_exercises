package superbasics.chronometerThreadedBotti;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import
        java.awt.event.ActionListener;

public class PanelCronometro extends JPanel implements
        ActionListener {
    JButton b1, b2, b3;
    JLabel tempo;
    Cronometro cronometro = new Cronometro();

    PanelCronometro() {
        setSize(500, 500);
        setLocation(0, 0);
        setBackground(Color.CYAN);
        setLayout(null);
        JLabel titolo = new JLabel("", SwingConstants.CENTER);
        titolo.setText("Cronometro");
        titolo.setSize(200, 100);
        titolo.setLocation(150, 50);
        titolo.setFont(new Font("Arial", Font.PLAIN, 30));
        tempo = new JLabel("",
                SwingConstants.CENTER);
        tempo.setText("0");
        tempo.setSize(300, 100);
        tempo.setLocation(100, 150);
        tempo.setFont(new Font("Arial", Font.PLAIN, 50));
        b1 = new
                JButton();
        b1.setSize(100, 100);
        b1.setLocation(50, 300);
        b1.setText("Start");
        b2 = new JButton();
        b2.setSize(100, 100);
        b2.setLocation(200, 300);
        b2.setText("Stop");
        b3 = new JButton();
        b3.setSize(100, 100);
        b3.setLocation(350, 300);
        b3.setText("Reset");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(titolo);
        add(tempo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (b1 == e.getSource()) {
            cronometro.start();
        }
        if (b2 == e.getSource()) {
            cronometro.stop();
            tempo.setText(cronometro.get_number());
        }
        if (b3 == e.getSource()) {
            cronometro.reset();
            tempo.setText(cronometro.get_number());
        }
    }

    public void aggiorna_cronometro() {
        tempo.setText(cronometro.get_number());
    }
}

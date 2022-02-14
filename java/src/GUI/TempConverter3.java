package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// l'ascoltatore di eventi è il frame.
// il generatore di eventi sono gli elementi del frame

// come fa a ricevere gli eventi il frame?
// anche gli eventi saranno gli oggetti
// il frame può ricevere eventi se ha metodi adeguati a ricevere eventi.
// implements ActionListener



public class TempConverter3 extends JFrame implements ActionListener {

    // devo rendere attributi quegli elementi grafici che utilizzerò in futuro.

    JTextField tfCel;
    JTextField tfFar;

    JButton btCel;
    JButton btFar;
    public TempConverter3() throws HeadlessException {
        JPanel mainPanel = new JPanel(new GridLayout(3,2)); // creo un pannello con un layout

        tfCel = new JTextField("0.0");
        tfFar = new JTextField("0,0");

        JLabel lbCel = new JLabel("C");
        JLabel lbFar = new JLabel("F");

        btCel = new JButton("C -> F");
        btFar = new JButton("F -> C");

        btCel.addActionListener(this);
        btFar.addActionListener(this);

        mainPanel.add(tfCel);
        mainPanel.add(lbCel);
        mainPanel.add(tfFar);
        mainPanel.add(lbFar);
        mainPanel.add(btCel);
        mainPanel.add(btFar);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel); // al pane attacco il pannello e al pannello attacco i componenti
        setSize(300, 200);
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        TempConverter3 panel = new TempConverter3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e);
        if(e.getActionCommand().equals("C -> F")){
            //System.out.println("Cel");
            //String t = tfCel.getText();
            //double tt = Double.parseDouble(t);
            double tc = Double.parseDouble(tfCel.getText());
            double tf = tc * 1.8 + 32;
            tfFar.setText(String.format("%.2f", tf));
        }
        if(e.getActionCommand().equals("F -> C")){
            //System.out.println("Far");
            double tf = Double.parseDouble(tfFar.getText());
            double tc = (tf - 32 )/ 1.8;
            tfCel.setText(String.format("%.2f",tc));
        }
    }
}

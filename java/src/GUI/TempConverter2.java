package GUI;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyBoundsAdapter;

public class TempConverter2 extends JFrame { /* tempconverter non è una classe vuota come le altre, ma estende la classe JFrame, è un HFrame particolare
    Ci serve allora un costruttore, riscrivo in TempConverter2
    */
    public TempConverter2() throws HeadlessException {
        JPanel mainPanel = new JPanel(new GridLayout(3,2)); // creo un pannello con un layout


        JTextField tfCel = new JTextField("0.0");
        JTextField tfFar = new JTextField("0,0");

        JLabel lbCel = new JLabel("C");
        JLabel lbFar = new JLabel("F");

        JButton btCel = new JButton("C -> F");
        JButton btFar = new JButton("F -> C");


        //JPanel p1 = new JPanel();
        //JPanel p2 = new JPanel(new GridLayout(3,2));

        mainPanel.add(tfCel);
        mainPanel.add(lbCel);
        mainPanel.add(tfFar);
        mainPanel.add(lbFar);
        mainPanel.add(btCel);
        mainPanel.add(btFar);

        //JButton btOK = new JButton("OK");
        //JButton btCancel = new JButton("Cancel");
        //p1.add(btOK);
        //p1.add(btCancel);

        //JTextField tfTemp = new JTextField("0.0");
        //p2.add(tfTemp);
/*
        mainPanel.add(p1,BorderLayout.PAGE_END);
        mainPanel.add(p2,BorderLayout.CENTER);*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel); // al pane attacco il pannello e al pannello attacco i componenti
        setSize(600, 600);
        setResizable(true);
        setVisible(true);

        // now to TempConverter3
    }

    public static void main(String[] args) {
        TempConverter2 panel = new TempConverter2();
    }
}

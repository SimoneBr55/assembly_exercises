package GUI;

import javax.swing.*;
import java.awt.*;

public class TempConverter extends JFrame { /* tempconverter non è una classe vuota come le altre, ma estende la classe JFrame, è un HFrame particolare
    Ci serve allora un costruttore, riscrivo in TempConverter2
    */
    public TempConverter() throws HeadlessException {
    }

    public static void main(String[] args) {
        JFrame f  = new JFrame("Ciao");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // definisce il comportamento dei tasti per chiudere
        f.setContentPane(new JPanel());
        f.setSize(600,600);
        f.setResizable(true); // ammette di essere ridimensionata
        f.setVisible(true); //ultima istruzione: alzare il sipario
        // con il solo sopra, esce una finestra
    }
}

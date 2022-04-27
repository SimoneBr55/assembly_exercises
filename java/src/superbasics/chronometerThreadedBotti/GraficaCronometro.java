package superbasics.chronometerThreadedBotti;

import superbasics.chronometerThreadedBotti.PanelCronometro;

import javax.swing.*;

public class GraficaCronometro extends JFrame {
    PanelCronometro p;

    GraficaCronometro() {
        setSize(500, 500);
        setLocation(100, 100);
        setResizable(false);
        setLayout(null);
        p = new PanelCronometro();
        add(p);
        setVisible(true);
    }

    public static void
    main(String args[]) {
        GraficaCronometro g = new GraficaCronometro();
        while (true) {
            g.aggiorna_cronometro();
        }
    }

    private void aggiorna_cronometro() {
        p.aggiorna_cronometro();
    }
}
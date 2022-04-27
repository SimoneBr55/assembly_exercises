package superbasics.threads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends Thread implements ActionListener {

    Centralino centralino;
    String nome;
    JButton chiama, riaggancia;
    JFrame f;

    public Cliente(String nome, Centralino centralino){
        this.centralino = centralino;
        this.nome = nome;
        f = new JFrame();
        f.setSize(200,100);
        f.setTitle(nome);
        chiama = new JButton("Chiama");
        riaggancia = new JButton("Riaggancia");
        f.add(chiama);

        chiama.addActionListener(this);
        riaggancia.addActionListener(this);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void run() {
        System.out.println("Sto chiamando");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        centralino.chiamata(this);
        if (e.getSource() == chiama){
            centralino.chiamata(this);
        } else if (e.getSource() == riaggancia) {
            centralino.riaggancia(this);
            f.remove(riaggancia);
            f.add(chiama);
            f.repaint();
            f.revalidate();
        }
    }

    public void rispondi() {
        f.remove(chiama);
        f.add(riaggancia);
        f.repaint();
        f.revalidate();
    }

    public void riaggancia() {
        centralino.riaggancia(this);
        f.remove(riaggancia);
        f.add(chiama);
        f.repaint();
        f.revalidate();
    }
}

package superbasics.threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Centralino extends Thread{
    JFrame f;
    LinkedList<Cliente> coda = new LinkedList();
    boolean occupato = false;
    public Centralino(){
        f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(1000,1000);
        f.setTitle("Centralino");


        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
    public void run() {
        while(true){
            //System.out.println("Ciao");
            if(coda.size() > 0 && occupato == false) {
                Cliente cliente = coda.getFirst();
                JButton rispondi = new JButton("Rispondi a " + cliente.nome);
                rispondi.setSize(100,50);
                f.add(rispondi);
                f.revalidate();

                rispondi.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cliente.rispondi();
                        f.getContentPane().removeAll();
                        JButton riaggancia = new JButton("Riaggancia");
                        riaggancia.setSize(100,50);
                        f.add(riaggancia);
                        f.repaint();
                        f.revalidate();
                        riaggancia.addActionListener( e1 -> {
                            cliente.riaggancia();
                        } );


                    }
                });
                occupato = true;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }

    public void chiamata(Cliente cliente) {
        //System.out.println(coda);
        if (coda.contains(cliente) == false){
            coda.addLast(cliente);
        }
    }

    public void riaggancia(Cliente cliente) {
        if (coda.contains(cliente)) {
            coda.removeFirst();
            f.getContentPane().removeAll();
            f.repaint();
            f.revalidate();
            occupato = false;
        }
    }
}

package superbasics.threads;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Centralino centralino = new Centralino();
        centralino.start();

        Cliente cliente1 = new Cliente("Francesco", centralino);
        cliente1.start();

        Cliente cliente2 = new Cliente("Luca", centralino);
        cliente2.start();
    }
}

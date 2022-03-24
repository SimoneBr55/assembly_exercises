package Game.GUI;

import Game.Interfaces.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class TestApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");

        BouncePanel panel = new BouncePanel();
        frame.setContentPane(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        panel.init();;

    }
}


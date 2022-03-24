package Game.GUI;

import Game.Interfaces.GameObject;
import Game.Objects.Ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class BouncePanel extends JPanel {
    Timer timer;
    HashMap<String, GameObject> gameObjects;

    public BouncePanel() {
        super();
        setBackground(Color.BLACK);
    }

    public void init() {
        gameObjects = new HashMap<>();
        gameObjects.put("ball", new Ball(this, gameObjects,
                20,20,
                getWidth() / 2, getHeight() / 2,
                10,10));
        timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameObjects.get("ball").update();
            }
        });
        while (true) {
            timer.start();
            gameObjects.get("ball").update();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GameObject object : gameObjects.values()) {
            object.paint(g);
        }
    }
}

package GUI;

import javax.swing.*;
import java.awt.*;

public class UICounter extends JFrame {
    JButton btPlus;
    JButton btMinus;
    JTextField tfNumber;

    public UICounter() throws HeadlessException {
        super();

        btPlus = new JButton("+");
        btMinus = new JButton("-");
        tfNumber = new JTextField("0");

        //btPlus.addActionListener(this);
        // I can also provide an implementation directly here by declaring the listener via a lambda function (since t
        // method would have only one function
        btPlus.addActionListener(e -> {
                if (e.getActionCommand().equals("+")) {
                    int n = Integer.parseInt(tfNumber.getText()) + 1;
                    tfNumber.setText(Integer.toString(n));
                }
        });
        //btMinus.addActionListener(this);
        btMinus.addActionListener(e -> {
                if (e.getActionCommand().equals("-")) {
                    int n = Integer.parseInt(tfNumber.getText()) - 1;
                    tfNumber.setText(Integer.toString(n));
                }
        });
        tfNumber.addActionListener(e -> {

        });

        JPanel p1 = new JPanel(new BorderLayout());
        p1.add(btMinus, BorderLayout.LINE_START);
        p1.add(tfNumber, BorderLayout.CENTER);
        p1.add(btPlus, BorderLayout.LINE_END);

        setContentPane(p1);
        setTitle(getClass().getName());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250,150);
        setResizable(true);
        setVisible(true);
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+")) {
            int n = Integer.valueOf(tfNumber.getText()) + 1;
            tfNumber.setText(toString());
        }
        if (e.getActionCommand().equals("-")) {
            int n = Integer.valueOf(tfNumber.getText()) - 1;
            tfNumber.setText(n);
        }
    }*/

    public static void main(String[] args) {
        new UICounter();
    }
}

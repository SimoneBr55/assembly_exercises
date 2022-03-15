package PBGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneBookUIDesigner extends JFrame {
    private JPanel mainPanel;
    private JButton btPrev;
    private JButton btNext;
    private JButton btRemove;
    private JButton btInsert;
    private JLabel lbName;
    private JLabel lbSurname;
    private JLabel lbPhone;
    private JLabel lbMail;
    private JTextField tfName;
    private JTextField tfSurname;
    private JTextField tfPhone;
    private JTextField tfMail;

    public PhoneBookUIDesigner() {
        super();

        btPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setTitle("PhoneBook");
        setContentPane(mainPanel);
        setSize(450,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PhoneBookUIDesigner();
    }
}

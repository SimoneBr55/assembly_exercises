package PBGUI;

import javax.swing.*;
import java.awt.*;

public class PhoneBookGUI extends JFrame {
    JButton btNext, btPrev, btInsert, btRemove;
    JTextField tfName, tfSurname, tfPhone, tfMail;
    JLabel lbName, lbSurname, lbPhone, lbMail;
    /*
    JButton btNext;
    JButton btPrev;
    JButton btInsert;
    JButton btRemove;
    JTextField tfName;
    JLabel lbName;
    JTextField tfSurname;
    JLabel lbSurname;
    JTextField tfPhone;
    JLabel lbPhone;
    JTextField tfMail;
    JLabel lbMail;
    */
    public PhoneBookGUI() throws HeadlessException{
        super();
        btNext = new JButton("Next");
        btPrev = new JButton("Previous");
        btInsert = new JButton("Insert");
        btRemove = new JButton("Remove");

        tfName = new JTextField();
        lbName = new JLabel("Name");
        tfSurname = new JTextField();
        lbSurname = new JLabel("Surname");
        tfPhone = new JTextField();
        lbPhone = new JLabel("Phone");
        tfMail = new JTextField();
        lbMail = new JLabel("Mail");

        //LOGIC

        //

        JPanel p1 = new JPanel(new GridLayout(6,2,1,1));
        p1.add(lbName);
        p1.add(tfName);
        p1.add(lbSurname);
        p1.add(tfSurname);
        p1.add(lbPhone);
        p1.add(tfPhone);
        p1.add(lbMail);
        p1.add(tfMail);
        p1.add(btPrev);
        p1.add(btNext);
        p1.add(btRemove);
        p1.add(btInsert);

        setContentPane(p1);
        setTitle(getClass().getName());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,500);
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PhoneBookGUI();
    }
}

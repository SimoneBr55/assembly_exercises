package UIPlane;

import UIPlane.Data.DataManager;
import UIPlane.Data.Plane;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UIPlane extends JFrame {
    private JPanel mainPanel;
    private JButton btPrev;
    private JButton btNext;
    private JButton btRemove;
    private JButton btInsert;
    private JLabel lbWidth;
    private JLabel lbHeight;
    private JLabel lbWingSpan;
    private JLabel lbCode;
    private JTextField tfWidth;
    private JTextField tfHeight;
    private JTextField tfWingSpan;
    private JTextField tfCode;
    private List<Plane> planes;
    private int selectedItem;

    public UIPlane() {
        super();

        JMenuItem open = new JMenuItem("Open...");
        JMenuItem save = new JMenuItem("Save...");
        JMenuItem quit = new JMenuItem("Quit");
        JMenu file = new JMenu("File");
        file.add(open);
        file.add(save);
        file.add(quit);
        JMenuBar menu = new JMenuBar();
        menu.add(file);

        open.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int option = chooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                planes = DataManager.load(chooser.getSelectedFile().toPath().toString());
                selectedItem = 0;
                showItem();
            }
        });

        save.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int option = chooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                DataManager.save(planes, chooser.getSelectedFile().toPath().toString());
            }
        });

        quit.addActionListener(e -> {
            dispose();
        });

        btPrev.addActionListener(e -> {
            selectedItem = Math.max(selectedItem - 1, planes.size());
            showItem();
        });

        btNext.addActionListener(e -> {
            selectedItem = selectedItem + 1;
            showItem();
        });

        btRemove.addActionListener(e -> {
            planes.remove(selectedItem);
            selectedItem = Math.max(selectedItem - 1, 0);
            showItem();
        });

        btInsert.addActionListener(e -> {
            String[] v = JOptionPane.showInputDialog(this, "Insert Plane here (width; height; wingspan; code)").split(";");
            Plane plane = new Plane(Double.parseDouble(v[0]),
                    Double.parseDouble(v[1]),
                    Double.parseDouble(v[2]),
                    v[3]);
            planes.add(plane);
            selectedItem = planes.size() - 1;
            showItem();
        });
        tfWidth.addActionListener(e -> {
            planes.get(selectedItem).setWidth(Double.parseDouble(tfWidth.getText()));
        });
        tfHeight.addActionListener(e -> {
            planes.get(selectedItem).setHeight(Double.parseDouble(tfHeight.getText()));

        });
        tfWingSpan.addActionListener(e -> {
            planes.get(selectedItem).setWingSpan(Double.parseDouble(tfWingSpan.getText()));

        });
        tfCode.addActionListener(e -> {
            planes.get(selectedItem).setCode(tfCode.getText());
        });

        setJMenuBar(menu);
        setTitle("Planes");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,500);
        setResizable(false);
        setVisible(true);
    }

    public void showItem() {
        try {
            tfWidth.setText(Double.toString(planes.get(selectedItem).getWidth()));
            tfHeight.setText(Double.toString(planes.get(selectedItem).getHeight()));
            tfWingSpan.setText(Double.toString(planes.get(selectedItem).getWingSpan()));
            tfCode.setText(planes.get(selectedItem).getCode());
        } catch (IndexOutOfBoundsException e) {
            tfHeight.setText("");
            tfWidth.setText("");
            tfWingSpan.setText("");
            tfCode.setText("");
        }
    }
    public static void main(String[] args) {
        // new UIPlane(); OR
        SwingUtilities.invokeLater(UIPlane::new);
    }
}

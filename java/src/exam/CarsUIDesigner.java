package exam;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsUIDesigner extends JFrame {
    private JPanel mainPanel;
    private JButton btPrevious;
    private JButton btNext;
    private JButton btInsert;
    private JButton btRemove;
    private JTextField tfName;
    private JTextField tfPlate;
    private JTextField tfWeight;
    private JTextField tfWidth;
    private List<Car> cars;
    private int selected;

    public CarsUIDesigner() {
        super();

        initData();

        btPrevious.addActionListener(e -> {
            selected = Math.max(0, selected - 1);
            setData();
        });

        btNext.addActionListener(e -> {
            selected = Math.min(cars.size() - 1, selected + 1);
            setData();
        });

        btInsert.addActionListener(e -> {
            String[] v = JOptionPane.showInputDialog(this, "Insert car (name;plate;weight;width)").split(";");
            Car car = new Car(v[0], v[1], Integer.parseInt(v[2]), Integer.parseInt(v[3]));
            cars.add(selected, car);
            setData();
        });

        btRemove.addActionListener(e -> {
            if (cars.isEmpty()) {
                return;
            }
            cars.remove(selected);
            selected = Math.max(0, selected - 1);
            setData();
        });

        tfName.addActionListener(e -> getSelected().setName(tfName.getText()));

        tfPlate.addActionListener(e -> getSelected().setPlate(tfPlate.getText()));

        tfWeight.addActionListener(e -> getSelected().setWeight(Integer.parseInt(tfWeight.getText())));

        tfWidth.addActionListener(e -> getSelected().setWidth(Integer.parseInt(tfWidth.getText())));

        JMenuBar jmenu = generateMenu();
        setJMenuBar(jmenu);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 250);
        setResizable(false);
        setVisible(true);
    }

    private void initData() {
        cars = new ArrayList<>();
        selected = 0;
    }

    private void initData(List<Car> l) {
        cars = l;
        selected = 0;
    }

    private void setData() {
        Car plane = getSelected();
        if (plane == null) {
            tfName.setText("");
            tfPlate.setText("");
            tfWeight.setText("");
            tfWidth.setText("");
        } else {
            tfName.setText(plane.getName());
            tfPlate.setText(plane.getPlate());
            tfWeight.setText(Integer.toString(plane.getWeight()));
            tfWidth.setText(Integer.toString(plane.getWidth()));
        }
    }

    private Car getSelected() {
        if (!cars.isEmpty()) {
            return cars.get(selected);
        }
        return null;
    }

    private JMenuBar generateMenu() {
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
                try {
                    initData(CarStorage.load(chooser.getSelectedFile().toPath()));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Reading file failed!");
                }
                setData();
            }
        });
        save.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int option = chooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    CarStorage.save(cars, chooser.getSelectedFile().toPath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Writing file failed!");
                }
            }
        });
        quit.addActionListener(e -> dispose());
        return menu;
    }

    public static void main(String[] args) {
        new CarsUIDesigner();
    }
}

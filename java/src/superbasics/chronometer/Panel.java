package superbasics.chronometer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Panel extends JPanel{
    JLabel l_index;
    static JLabel l_time;
    JButton start;
    JButton pause;
    JButton stop;

    static long elapsed;

    long time_start;
    long time_end;
    String time = "00:00.0";

    Panel() {
        setSize(500, 500);
        setLocation(0, 0);
        setBackground(Color.WHITE);
        setLayout(null);

        l_index = new JLabel();
        l_index.setSize(300, 100);
        l_index.setText("Cronometro Minuti - Secondi - Decimi");
        l_index.setLocation(120, 0);
        add(l_index);

        l_time = new JLabel();
        l_time.setSize(200, 200);
        l_time.setLocation(170, 100);
        l_time.setFont(new Font("VERDANA", Font.BOLD, 36));
        l_time.setText(time);
        add(l_time);
        int x_begin = 100;
        int x_spacing = 110;
        start = new JButton();
        start.setSize(100, 20);
        start.setLocation(x_begin, 300);
        start.setText("START");
        add(start);

        pause = new JButton();
        pause.setSize(100, 20);
        pause.setLocation(x_begin + x_spacing, 300);
        pause.setEnabled(false);
        pause.setText("PAUSE");
        add(pause);

        stop = new JButton();
        stop.setSize(100, 20);
        stop.setLocation(x_begin + 2 * x_spacing, 300);
        stop.setEnabled(false);
        stop.setText("STOP");
        add(stop);


        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // chronometer starts
                time_start = System.currentTimeMillis();
                pause.setText("PAUSE");
                start.setEnabled(false);
                pause.setEnabled(true);
                stop.setEnabled(true);
            }
        });

        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("PAUSE".equals(pause.getText())){
                    time_end = System.currentTimeMillis();
                    pause.setText("RESUME");
                    stop.setEnabled(true);
                    pause.setEnabled(true);
                    // print time
                    elapsed += time_end - time_start;
                    System.out.println(elapsed);
                    new_time(elapsed);
                } else {
                    time_start = System.currentTimeMillis();
                    pause.setText("PAUSE");
                    stop.setEnabled(false);
                    pause.setEnabled(true);
                }
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // chronometer resumes
                pause.setEnabled(false);
                start.setEnabled(true);
                stop.setEnabled(false);
                pause.setText("PAUSE");
                new_time(0);
                elapsed = 0;
                time_start = 0;
                time_end = 0;
            }
        });

    }
    public static void new_time(long elapsed) {
        long minutes = elapsed / 60000;
        long seconds = (elapsed - minutes * 60000) / 1000;
        long milliseconds = elapsed - minutes * 60000 - seconds * 1000;

        l_time.setText(String.format("%02d", minutes) + ":" + String.format("%02d", seconds) + "." + Long.toString(milliseconds).charAt(0));
    }
}

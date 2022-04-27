package superbasics.chronometerThreaded;

import javax.swing.*;
import java.util.TimerTask;

public class TimerPanel extends JPanel {
    JLabel l_index;
    JLabel l_time;
    JButton start;
    JButton stop;
    JButton pause;
    TimerLogic t;
    public TimerPanel(){

        t = new TimerLogic();
        l_time = new JLabel("00:00.0", JLabel.CENTER);
        pause = new JButton("PAUSE");
        start = new JButton("START");
        stop = new JButton("STOP");
/*
        start.addActionListener(new starts());
        pause.addActionListener(new starts());
        stop.addActionListener(new starts());
*/
        add(l_time);
        add(start);
        add(pause);
        add(stop);

        java.util.Timer updateTimer = new java.util.Timer();
       /* updateTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                t.update(int_min, int_sec, int_mil);
            }
        },0,100);

        */
    }

    public void update(long minutes, long seconds, long milliseconds) {
       // String sec = Integer.toString();
    }
}

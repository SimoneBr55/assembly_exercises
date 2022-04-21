package superbasics.chronometerThreaded;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import java.sql.Time;
import java.time.format.DateTimeFormatterBuilder;

public class TimerLogic {

    boolean shouldCount = false;
    int int_sec = 0;
    int int_min = 0;
    int int_mil = 0;

    public TimerLogic() {
    }

    public static void main(String[] args) {
        TimerPanel t = new TimerPanel();
        JFrame f = new JFrame("TIMER");
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane().add(new TimerPanel());
        f.setVisible(true);
    }

    public void count(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long now = System.currentTimeMillis();
                while (true){
                    if(shouldCount){
                        if(System.currentTimeMillis() - now >= 100){
                            now = System.currentTimeMillis();
                            int_mil++;
                            if (int_mil > 9) {
                                int_mil = 0;
                                int_sec++;
                                if(int_sec > 60) {
                                    int_sec = 1;
                                    int_min++;
                                }
                            }
                        }
                    }
                }
            }
        });
        thread.start();
    }
}

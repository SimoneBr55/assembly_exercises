package superbasics.chronometerThreadedBotti;

public class Cronometro {
    long start_time, stop_time, elapsed_time;
    boolean is_running = false;

    public void start() {
        if (is_running == false) {
            start_time = System.currentTimeMillis();
            is_running =
                    true;
        }
    }

    public void stop() {
        if (is_running == true) {
            stop_time = System.currentTimeMillis();
            is_running = false;
            elapsed_time += stop_time - start_time;
        }
    }

    public void reset() {
        start_time =
                System.currentTimeMillis(); //is_running = false; elapsed_time = 0; } public String get_number() {
        if (is_running) {
            long current_time = System.currentTimeMillis();
            long current_elapsed_time =
                    current_time - start_time;
            long to_print = elapsed_time + current_elapsed_time;
            return format_time(to_print);
        } else {
            return format_time(elapsed_time);
        }
    }

    private String
    format_time(long time) {
        long cs = time / 10 % 10;
        long ds = time / 100 % 10;
        long sSX = time /
                1000 % 60 / 10;
        long sDX = time / 1000 % 60 % 10;
        long mSX = time / 1000 / 60 % 60 / 10;
        long
                mDX = time / 1000 / 60 % 60 % 10;
        long h = time / 1000 / 60 / 60;
        String formatted = "" + h + ":"
                + mSX + mDX + ":" + sSX + sDX + ":" + ds + cs;
        return formatted;
    }
}
package superbasics.chronometer;

public class Logic {


    public static void Seconds(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++)
            System.out.println(i);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);
    }

    void refresh(){

    }

}

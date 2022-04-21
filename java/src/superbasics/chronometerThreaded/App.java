package superbasics.chronometerThreaded;

public class App implements Runnable {
    public void run(){
        //Here time flows
        System.out.println("Threading");
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        try {
            thread.wait();
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Not Threading");
    }
}

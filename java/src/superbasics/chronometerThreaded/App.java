package superbasics.chronometerThreaded;

public class App extends Thread {
    public void run(){
        //Here time flows
        try {
            this.wait(1000);
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Not threading");
        }
    }
    public static void main(String[] args) {
        App c = new App();
        c.run();

    }
}

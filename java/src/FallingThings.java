import classes.Stone;

public class FallingThings {
    public static void main(String[] args) {
        Stone s = new Stone(100);

        for (double t = 0.0; t < 5.0; t += 0.1){
            System.out.println("Tempo: " + t + " Spazio: " + s.showHeightAfterTime(t));
            if (s.showHeightAfterTime(t) <= 0){
                System.out.println("Sono arrivato a Terra");
                break;
            }
        }
        /*
        System.out.println(s.showHeightAfterTime(100));
        s.refresh(100);
        System.out.println(s.getHeight());
        */

    }
}

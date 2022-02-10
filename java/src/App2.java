import java.util.ArrayList;

import static classes.functions.Lists.copyList;

public class App2 {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        l.add(10);
        l.add(12);
        copyList(l,s);
        System.out.println(l);
        System.out.println(s);
        // versione pythonica del for
        for (int item : l) {
            System.out.println(item);
        }
    }
}

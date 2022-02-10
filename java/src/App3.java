import java.util.ArrayList;

import static classes.functions.Lists.reverse;

public class App3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        //ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            l.add(i);
        }
        //for (int i = 0; i < l.size(); i++) {
        //    s.add(l.get(i));
        //}
        //System.out.println(l);
        //System.out.println(s);
        reverse(l);
        System.out.println(l);
    }
}


package classes.functions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Random {
    public static int generate() {
        RandomGenerator rnd = RandomGeneratorFactory.of("Random").create();
        return rnd.nextInt();
    }

    public static List<Integer> NewRandomList(){
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            l.add(generate());
        }
        return l;
    }

    public static void generateSquare(ArrayList<Integer> l){

        for (int i = 1; i <= 10; i++){
            l.add(i*i);
        }
    }
    public static ArrayList<Integer> copyList(ArrayList<Integer> l) {
        // duplica con costruttore
        ArrayList<Integer> l2 = new ArrayList<>(l);
        //duplica aggiungendo)
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.addAll(l);
        return l3;
        // duplica copiando la collection (bisogna guardare la DOCUMENTAZIONE)
        //ArrayList<Integer> l3 = new ArrayList<>(l.size() + 10);
        //Collections.copy(l,l2);
    }

    //public static void main(String[] args) {
    //    int ran = generate();
    //    System.out.println(ran);
    //}
}

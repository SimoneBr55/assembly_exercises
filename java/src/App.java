import java.util.ArrayList;

import static classes.functions.Lists.replace;
import static classes.functions.Random.*;
//import static classes.functions.Random.generate;
//import pack.Lists;

public class App {
    //public static void replace(List<Integer> list, int value){
    //    list.set(2,value);
    //}
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(8);
        l.add(5);
        l.add(7);
        l.add(17);
        l.add(15);
        System.out.println(l);
        l.set(0,99);
        System.out.println(l);
        replace(l,3);
        System.out.println(l);
        //Lists foo = new Lists();
        //insertFirst()
        //int rand = generate();
        //System.out.println(rand);

        System.out.println(NewRandomList());
        ArrayList<Integer> lista_input= new ArrayList<>(); // e' meglio però creare la lista direttamente dentro la funzione...
        generateSquare(lista_input);
        System.out.println(lista_input);
        ArrayList<Integer> lista_copiata1 = copyList(lista_input);
        System.out.println(lista_copiata1);

    }
}

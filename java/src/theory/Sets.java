package theory;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>(); // caratteristiche hashset: bloodyfast, supporta duplicati, non ho ordine
        Set<String> s2 = new LinkedHashSet<>(); // caratteristiche lhs: ho ordine di inserimento
        Set<String> s3 = new TreeSet<>(); // se voglio che siano ordinate secondo l'ordinamento naturale delle stringhe
        // esiste anche queue<>
        s1.add("Nicola");
        s1.add("Agata");
        //l1.add(0, "Marzia") // error because not ordered
        s1.add("Marzia");
        s1.add("Nicola");
        s1.remove("Nicola");

        System.out.println(s1);
        System.out.println(s1.size());
    }
}

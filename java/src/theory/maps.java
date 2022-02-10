package theory;

import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>(); // mappe associative. I due elementi della coppia vanno assieme
        m.put("Nicola", "131424819821");
        m.put("Agata",  "839183919837");
        m.put("Luigi",  "893812931392");
        m.put("Marzia", "391839839293");
        m.put("Nicola", "838139819383"); // se provo a riaggiungere una chiave già esistente,
                                         // la precedente mi viene sovrascritta... [vd l.24]

        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get("Agata")); // tira fuori solo il valore relativo alla chiave
        // anche l'hashmap (essendo hash) è O(1)
        m.remove("Luigi"); // cancella la coppia con chiave Luigi
        System.out.println(m);
        System.out.println(m.get("Luigi")); // ritorna null
        System.out.println(m.containsKey("Mariottide"));
        System.out.println(m.keySet()); // le chiavi devono essere UNICHE
                                        // i valori non è necessario che lo siano
        System.out.println(m.values());
    }
}

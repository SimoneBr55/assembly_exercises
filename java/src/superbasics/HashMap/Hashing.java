package superbasics.HashMap;

import superbasics.objects_exercises.Persona;

import java.util.HashMap;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        Hashing h = new Hashing();
        h.esegui();
    }

    private void esegui(){
        HashMap<Integer, Persona> map = new HashMap<>();
        // Key -> Integer
        // Value -> Contact
        for (int i = 0; i < 1000000; i++) {
            int key = (int)(Math.random() * 10000);
            Persona p = new Persona("ca");
            map.put(key,p);
        }
        Set key = map.keySet();
        for (Object x : key) {
            if ((int)x <=  5) {
                System.out.println(map.get(x));
            } else {
                System.out.println("Non presente");
                break;
            }
        }
        // System.out.println(map.values());
    }
}

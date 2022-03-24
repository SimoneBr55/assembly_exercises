package objects_exercises;

import java.util.ArrayList;

public class CompitinoVeloce {
    public static void main(String[] args) {
        CompitinoVeloce cv = new CompitinoVeloce();
        cv.esegui();
    }
        void esegui(){
            ArrayList<Persona> na = new ArrayList<>();
            Persona p1 = new Persona("Gianni", 137, 14);
            Persona p2 = new Persona("Francesco");
            Persona p3 = new Persona("Luigi", 175, 29);
            na.add(p1);
            na.add(p2);
            na.add(p3);
            for (Persona pers : na) {
                System.out.println(pers.toString());
            }
    }
}

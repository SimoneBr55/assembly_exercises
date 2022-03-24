package superbasics.Sets;

import superbasics.implementations.AnneList;
import superbasics.objects_exercises.Persona;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        program.esegui();
    }

    void esegui() {
        AnneList<Persona> l = new AnneList<>();

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Inserisci nome:");
            String nome = scan.nextLine();
            System.out.println("Inserisci altezza:");
            int altezza = scan.nextInt();
            System.out.println("Inserisci età:");
            int eta = scan.nextInt();

            Persona p = new Persona(nome, altezza, eta);
            l.addFirst(p);
            //l.add(p);
            //l.addLast(p);

            scan.nextLine();
        }

        for (int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }
    }
}

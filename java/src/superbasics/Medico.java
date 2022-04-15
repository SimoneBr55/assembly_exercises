package superbasics;

import superbasics.objects_exercises.Persona;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Medico {
    LinkedList<Persona> lista = new LinkedList<>();
    int risposta;
    private boolean continua = true;

    public static void main(String[] args) {
        Medico medico = new Medico();
        medico.esegui();
    }


    void esegui() {
        while (continua) {
            stampaAzioni();
            richiediAzione();
            eseguiAzione();
            // if (continua) { stampaLista();}
            stampaLista();
        }
    }

    private void stampaLista() {
        for (Persona p : lista) {
            System.out.println(p);
        }
    }

    private void stampaAzioni(){
        System.out.println("0) Termina");
        System.out.println("1) Aggiungi in coda");
        System.out.println("2) Aggiungi in testa");
        System.out.println("3) Rimuovi in coda");
        System.out.println("4) Rimuovi in testa");
    }

    private void richiediAzione() {
        Scanner sc = new Scanner(System.in);
        try {
            risposta = sc.nextInt();
        } catch (Exception e) {
            risposta = 0;
        }
    }

    private void eseguiAzione() {
        Persona e = null;
        try {
            if (risposta == 0) continua = false;
            if (risposta == 1) {e = richiediPersona(); lista.addLast(e);};       // aggiungi in coda
            if (risposta == 2) {e = richiediPersona(); lista.addFirst(e);};      // aggiungi in testa
            if (risposta == 3) lista.removeLast();                            // rimuovi in coda
            if (risposta == 4) lista.removeFirst();                            //rimuovi in testa
        } catch (NoSuchElementException exc) {
            System.out.println("ERROR: la lista è ancora vuota!");
        }
    }

    private Persona richiediPersona(){
        System.out.println("Definiscimi una persona...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dammi un nome");
        String name = sc.nextLine();
        System.out.println("Dammi un'altezza");
        int height = try_int_read();
        System.out.println("Dammi un'età");
        int age = try_int_read();

        Persona p = new Persona(name, height, age);
        return p;
    }

    private int try_int_read() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

/*switch (risposta) {
            case 1:
                // Aggiungi in coda
                lista.add(e);
                break;
            case 2:
                // Aggiungi in testa
                lista.addFirst(e);
                break;
            case 3:
                // Rimuovi in coda
                break;
            case 4:
                // Rimuovi in testa
                break;
            default:
        }*/
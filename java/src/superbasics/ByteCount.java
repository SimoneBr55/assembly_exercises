package superbasics;

import java.util.Scanner;

public class ByteCount {
    public static void main(String[] args) {
        int [] b = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < b.length; i++){
            try{
                System.out.println("Inserire numero: ");
                b[i] = scanner.nextInt();
            } catch(Exception e) {
                System.err.println("ERRORE DI IMMISSIONE");
                b[i] = 0;
            }
        }
        /*
        for (int i = 0; i < b.length; i++){5
            b[i] = 2*b[i];
        }*/
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        int somma = 0;
        for(int i = 0; i < b.length; i++){
            somma += b[i];
        }
        float media = (float)somma / b.length;
        System.out.println(somma);
        System.out.println(media);

        int prod = 1;
        for (int i = 0; i < b.length; i++){
            prod *= b[i];
        }
        float what = (float)prod / b.length;
        System.out.println(prod);
        System.out.println(what);

        // minimo
        int min = b[0];
        for(int i = 0; i < b.length; i++){
            if (min > b[i]){
                min = b[i];
            }
        }
        System.out.println(min);
    }
}

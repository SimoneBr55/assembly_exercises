import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;

public class Conto {
    int saldo_cents;
    private LinkedList<Integer> lista_movimenti = new LinkedList<>();

    Conto(int saldo) {
        this.saldo_cents = saldo * 100;
    }

    Conto(){this.saldo_cents=0;};

    void versamento(int in) {
        if (in <= 0) {
            System.out.println("Are you really sure?");
            System.out.println("Try Again!");
            return;
        }
        if ( in > 1000 ) { System.out.println("I'm calling the police!"); return; }
        this.saldo_cents += in * 100;
        aggiorna_lista(in);
    }


    void prelievo(int out) {
        if (out <= 0) {
            System.out.println("Are you really sure?");
            System.out.println("Try Again!");
            return;
        }
        if (saldo_cents < out) {
                System.out.println("You don't have enough money!");
                return;
            }
        if (out > 500) {
            System.out.println("You are not allowed to cash out more than 500");
            return;
        }
        if (saldo_cents == out) {
            System.out.println("You'll become cashless!");
        }
        this.saldo_cents -= out * 100;
        aggiorna_lista(-out);
    }


    private void aggiorna_lista(int denaro) {
        if (lista_movimenti.size() == 5) { lista_movimenti.removeFirst(); }
        lista_movimenti.add(denaro*100);
    }
    void saldo() {
        System.out.print("Saldo attuale: ");System.out.println((float)saldo_cents/100);
    }

    void movimenti(){
        System.out.println("");
        System.out.println("Lista degli ultimi 5 movimenti:");
        int i = 1;
        for (Integer item : lista_movimenti) {
            System.out.print(i);
            if (item < 0) {System.out.print(" - Uscita: ");}
            else { System.out.print(" - Entrata: ");}
            System.out.println(Math.abs((float)item/100));
            i += 1;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Conto conto = new Conto(1000);
        conto.saldo();
        conto.prelievo(-100);
        conto.prelievo(1001);
        conto.versamento(-123);
        conto.prelievo(100);
        conto.prelievo(162);
        conto.versamento(128);
        conto.prelievo(15);
        conto.versamento(1666);
        conto.versamento(1262);
        conto.versamento(133);
        conto.versamento(263);
        conto.movimenti();
        conto.saldo();
    }
}

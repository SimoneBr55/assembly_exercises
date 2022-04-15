package operatore;

import java.util.ArrayList;

public class SIM {
    private String number;
    private int credit_cents;
    private int charge_at_minute = 15;

    ArrayList<Telefonata> lista;
    public SIM(String number) {
        this.number = number;
        this.credit_cents = 0;
        lista = new ArrayList<>();
    }

    public SIM(String number, int credit_cents) {
        this.number = number;
        this.credit_cents = credit_cents;
        lista = new ArrayList<>();
    }

    void charge(int money) {
        if (money <= 0 ) {System.out.println("ERROR! VALUE NOT ACCEPTABLE"); return;}
        this.credit_cents += money;
    }

    void new_call(String numero_dest, int durata) {
        if (credit_cents < durata*charge_at_minute){ System.out.println("Non hai abbastanza credito"); return; }
        Telefonata call = new Telefonata(number, numero_dest, durata);
        credit_cents -= 15 * durata;
        lista.add(call);
    }

    void show_list(){
        System.out.print("Elenco chiamate del numero: "); System.out.println(number);
        for (Telefonata call: lista){
            System.out.println(call.toString());
        }
    }

    void sum_calls(){
        int total_minutes = 0;
        for (Telefonata call : lista){
            total_minutes += call.durata;
        }
        System.out.println(total_minutes);
    }

    public float getCredit() {
        return (float) credit_cents /100;
    }
}

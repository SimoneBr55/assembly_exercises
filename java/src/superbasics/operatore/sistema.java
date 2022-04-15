package operatore;

public class sistema {

    public static void main(String[] args) {
        SIM simone = new SIM("3398781354");
        simone.charge(1000);
        System.out.println(simone.getCredit()+" €");
        simone.new_call("3297763335", 10);
        System.out.println(simone.getCredit() + " €");
        simone.new_call("3487573823", 120);
        System.out.println(simone.getCredit() + " €");
        simone.show_list();



    }

}

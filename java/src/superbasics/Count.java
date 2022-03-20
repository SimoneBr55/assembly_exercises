package superbasics;

public class Count {
    public static void main(String[] args) {
        int eta = 71;
        if (eta < 3){
            System.out.println("asilo");
        }
        else if (eta < 6){
            System.out.println("materne");
        }
        else if (eta < 11){
            System.out.println("elementari");
        }
        else if (eta < 19){
            System.out.println("superiori");
        }
        else if (eta < 25){
            System.out.println("uni");
        }
        else if (eta < 70){
            System.out.println("lavoro");
        }
        else {
            System.out.println("pensione");
        }
        System.out.println("fine programma");
    }
}

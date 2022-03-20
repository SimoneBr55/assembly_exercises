package superbasics;

public class Divisibili {
    public static void main(String[] args) {
        int divisibili = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 7 == 0){
                print(i + " è divisibile per 7");
                divisibili++;
            } else {
                // print(i + " non è divisibile per 7");
            }
        }
        print("Da 1 a 100 abbiamo trovato " + divisibili + " numeri divisibili per 7");
    }
    public static void print(String s) {
        System.out.println(s);
    }
}

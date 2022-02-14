package classes;

public class Numbers {

    public static void main(String[] args) {
        Rational number1 = new Rational(10, 5);
        Rational number2 = new Rational(1,3);
        System.out.println(number1.plus(number2));
        System.out.println(number1.times(number2));
    }
}

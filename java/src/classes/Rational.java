package classes;

public class Rational {
    double num;
    double den;

    public Rational(double num, double den) {
        this.num = num;
        this.den = den;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getDen() {
        return den;
    }

    public void setDen(double den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }

    public Rational plus(Rational second){
        double new_den = this.den * second.den;
        double new_num = (new_den / this.den) * this.num + (new_den / second.den) * second.num;
        Rational output = new Rational(new_num, new_den);
        return output;
    }

    public Rational times(Rational second){
        double new_num = this.num * second.num;
        double new_den = this.den * second.den;
        Rational output = new Rational(new_num, new_den);
        return output;
    }
}


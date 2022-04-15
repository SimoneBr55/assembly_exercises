
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Potenza
{
    float base;
    int exp;

    void Pow() {
        float res = 1;
        for (int i=0; i < exp; i++){
            res = res * base;
        }
        System.out.println(res);
    }
    
    void cambioBase(float base){
        this.base = base;
    }

    void cambioEsponente(int exp) {this.exp = exp;}

    public Potenza(float base, int exp) {
        this.exp = exp;
        this.base = base;
    }

    public static void main(String[] args) {
        Potenza number = new Potenza(1.41f,2);
        number.Pow();
        number.cambioBase(10);
        number.Pow();
        number.cambioEsponente(100);
        number.Pow();
    }
}
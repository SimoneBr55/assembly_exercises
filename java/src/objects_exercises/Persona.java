
package objects_exercises;

public class Persona {
    String nome;
    private int eta;
    int altezza;

    void invecchia() {
        eta = eta + 1;
    }

    int getEta() {
        return eta;
    }

    Persona(String nome, int altezza, int eta) {
        this.nome = nome;
        this.altezza = altezza;
        this.eta = eta;
    }

    Persona(String nome) {
        this.nome = nome;
        this.altezza = (int)(Math.random() * 50 +150);
        this.eta = (int)(Math.random() * 100 + 18);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", altezza=" + altezza +
                '}';
    }
}


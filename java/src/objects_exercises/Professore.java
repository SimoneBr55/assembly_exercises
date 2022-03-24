package objects_exercises;

public class Professore extends Persona {
    String istituto;
    String materia;

    //Persona io;

    Professore(String nome, int altezza, int eta, String istituto, String materia) {
        super(nome, altezza, eta);
        this.istituto = istituto;
        this.materia = materia;
    }
}

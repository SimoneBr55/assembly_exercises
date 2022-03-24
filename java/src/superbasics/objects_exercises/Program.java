package superbasics.objects_exercises;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        program.execute();
    }

    void execute() {
        Persona persona = new Persona("Francesco", 150, 22);
        System.out.println(persona.nome);
        System.out.println(persona.getEta());
        persona.invecchia();
        System.out.println(persona.getEta());
    }


}

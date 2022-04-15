package operatore;

public class Telefonata {
    String mittente;
    String destinatario;
    int durata;

    public Telefonata(String mittente, String destinatario, int durata) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.durata = durata;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Telefonata{" +
                "destinatario='" + destinatario + '\'' +
                ", durata=" + durata +
                '}';
    }
}

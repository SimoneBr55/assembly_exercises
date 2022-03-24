package superbasics.implementations;

// it will be implemented with the length attribute
// method addFirst addLast and add

public class AnneList<T> {

    ItemList<T> primo;
    ItemList<T> ultimo;
    int length = 0;

    public void addFirst(T daAggiungere) {
        length++;
        ItemList<T> successore = primo;

        primo = new ItemList<T>(daAggiungere, null, successore);
        if (length == 1){
            ultimo = primo;
        }
    }

    public void addLast(T daAggiungere) {
        length++;
        ItemList<T> precedente = ultimo;
        primo = new ItemList<>(daAggiungere, precedente,null);
        precedente.successore = ultimo;
        if (length == 1){
            primo = ultimo;
        }
    }

    public void add(T daAggiungere) {
        addLast(daAggiungere);
    }

    public int size() {
        int out = 1;
        ItemList<T> inScorrimento = primo;
        while (inScorrimento != null){
            out++;
            inScorrimento = inScorrimento.successore;
        }
        return out;
    }

    public int length() {
        return length;
    }

    public T get(int index) {
        ItemList<T> inScorrimento = primo;
        for (int i = 0; i < index; i++){
            inScorrimento = inScorrimento.successore;
        }
        return inScorrimento.corrente;
    }

}

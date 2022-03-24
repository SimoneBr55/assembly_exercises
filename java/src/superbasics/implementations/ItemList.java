package superbasics.implementations;

public class ItemList<T> {

    T corrente;
    ItemList<T> precedente;
    ItemList<T> successore;


    public ItemList(T daAggiungere, ItemList<T> precedente, ItemList<T> successore) {
        this.corrente = daAggiungere;
        this.successore = successore;
        this.precedente = precedente;
    }
}

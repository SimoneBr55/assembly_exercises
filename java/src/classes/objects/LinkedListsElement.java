package classes.objects;

public class LinkedListsElement {
    protected int data;
    protected LinkedListsElement next;

    public LinkedListsElement(){
        next = null;
        data = 0;
    }

    public LinkedListsElement(int d, LinkedListsElement n ) {
        data = d;
        next = n;
    }

    public void setLinkNext(LinkedListsElement n){
        next = n;
    }

    public LinkedListsElement getLinkNext() {
        return next;
    }

    public void setData(int d) {
        data = d;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        LinkedListsElement ll = new LinkedListsElement();
        ll.setData(2);
        ll.setData(3);
        System.out.println(ll.getData());
    }
}

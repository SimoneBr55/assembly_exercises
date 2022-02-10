package classes.objects;
import theory.LinkedLists;

import java.util.ArrayList;

public class LinkedListsComplete {
    protected LinkedListsElement ll = new LinkedListsElement();
    public LinkedListsComplete() {
    }

    public void put(int data) {
        LinkedListsElement adding = new LinkedListsElement();
        adding.setData(data);
        ll.setLinkNext(adding);

    }



        /*
        LinkedListsElement ll = new LinkedListsElement();
        for (int i = 0; i <= input.size()){
            ll.setData(input.get(i));
            ll.setLinkNext();
        }
        ll.setData();


        if (input.size() == 0){
            LinkedListsElement start = new LinkedListsElement();
            start.setData(input.get(0));
        }
        for (int i=1; i <= input.size(); i++){
            LinkedListsElement start = new LinkedListsElement();


        }*/
    }
}

package classes.functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void replace(List<Integer> list, int value){
        list.set(2,value);
    }

    public static void insertFirst(List<Integer> list, int value){
        list.add(0,value);
    }
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    //this is not useful, but good for saving the syntax
    public static ArrayList<Integer> createListDirectly(String[] args) {
        ArrayList<Integer> src = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        return src;
    }

    public static void copyList(ArrayList<Integer> source, ArrayList<Integer> target){
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> source){
        ArrayList<Integer> list_tmp = new ArrayList<>(source);
        source.clear();
        for (int i = list_tmp.size() - 1; i >= 0; i--){
            source.add(list_tmp.get(i));
        }

    }
}


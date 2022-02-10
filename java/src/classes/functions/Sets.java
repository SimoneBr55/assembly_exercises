package src.classes.functions;

import java.util.*;

public class Sets {
    public static HashSet<Integer> intersection2(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> output = new HashSet<>();
        for (int element : s2) {
            if (s1.contains(element)) {
                output.add(element);
            }
        }
        return output;
    }

    public static Set<Integer> intersection(Set<Integer> source, Set<Integer> target) {
        Set<Integer> tmp = new HashSet<>(source);
        tmp.retainAll(target);
        return tmp;
    }

    public static String firstRecurringChar(String s) {
        Set<Character> seen = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
            } else {
                return Character.toString(c);
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChar(String s) {
        Set<Character> seen = new HashSet<>();
        Set<Character> output = new HashSet<>();
        for (Character c : s.toCharArray()){
            if (!seen.contains(c)){
                seen.add(c);
            } else {
                output.add(c);
            }
        }
        return output;
    }
    public static List<Integer> removeDuplicatesQuick(List<Integer> source) {
        //List<Integer> out = new ArrayList<>();
        //Set<Integer> tmp = new HashSet<>();
        /*
        for (int i = 0; i <= 0; i++) {
            tmp.add(source.get(i));
        }
        */
        /*
        Set<Integer> tmp = new HashSet<>(source);
        List<Integer> out = new ArrayList<>(tmp);
        */
        return new ArrayList<>(new HashSet<>(source));

    } public static List<Integer> removeDuplicatesProlisso(List<Integer> source) {
        Set<Integer> tmp = new HashSet<>(source);
        List<Integer> out = new ArrayList<>(tmp);
        return out;
    }
}

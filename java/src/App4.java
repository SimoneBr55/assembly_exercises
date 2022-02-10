//import classes.functions.Sets;

import java.util.Arrays;

import java.util.HashSet;

import java.util.Set;


import static src.classes.functions.Sets.intersection;
import static src.classes.functions.Sets.firstRecurringChar;;
import static src.classes.functions.Sets.allRecurringChar;;
import static src.classes.functions.Sets.removeDuplicatesQuick;;
import static src.classes.functions.Sets.removeDuplicatesProlisso;

public class App4 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,56,7,8));
        System.out.println(intersection(s1, s2));
        System.out.println(firstRecurringChar("abaco"));
        System.out.println(allRecurringChar("mamma"));
        System.out.println(removeDuplicatesQuick(Arrays.asList(2,6,2,3,3,1,2,3,5,6,7,2,3,5,5)));
        System.out.println(removeDuplicatesProlisso(Arrays.asList(2,6,2,3,3,1,2,3,5,6,7,2,3,5,5)));
    }
}

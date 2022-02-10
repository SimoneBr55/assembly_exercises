import classes.objects.IntegerPointed;
import jdk.dynalink.linker.support.DefaultInternalObjectFilter;

public class TestIntegerPointed {

    public static void main(String[] args) {
        IntegerPointed x;
        IntegerPointed y;

        x = new IntegerPointed();
        x.value = 42;
        System.out.println(x);
        System.out.println(x.value);
        //System.out.println(y);
        System.out.println(classes.objects.IntegerPointed.class);
    }
}

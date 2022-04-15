import java.sql.Array;
import java.util.ArrayList;

public class Zip extends ArrayList {
    public class tuple<T> {
        Iterable<T> first;
        Iterable<T> last;

        public tuple(Iterable first, Iterable last) {
            this.first = first;
            this.last = last;
        }

        public Iterable getFirst() {
            return first;
        }

        public void setFirst(Iterable first) {
            this.first = first;
        }

        public Iterable getLast() {
            return last;
        }

        public void setLast(Iterable last) {
            this.last = last;
        }
    }
    public tuple zip(Iterable obj){
        ArrayList<Object> first = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        int i = 0;
        for (Object item : obj) {
            first.add(item);
            index.add(i);
            i += 1;
        }
        tuple out = new tuple(first,index);
        return out;
    }

    public static void main(String[] args) {
    }
}

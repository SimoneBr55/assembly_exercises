package UIPlane.Data;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    public static List<Plane> load(String filename) {
        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane(10, 10, 8, "XI999"));
        planes.add(new Plane(20, 8, 10, "AF654"));
        planes.add(new Plane(30, 12, 17, "OO876"));
        planes.add(new Plane(40, 10, 21, "NN4322"));
        planes.add(new Plane(50, 15, 8, "PP998"));
        return planes;
    }

    public static void save(List<Plane> planes, String filename) {

    }
}

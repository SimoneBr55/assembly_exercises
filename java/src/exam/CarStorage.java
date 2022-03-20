package exam;

import java.io.*;
import java.nio.file.Files;  // questo dovrebbe essere la libreria per il csv?
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarStorage {

    public static List<Car> load(Path path) throws IOException {
        List<Car> cars = new ArrayList<>();
        /*Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            String[] fields = scanner.nextLine().split(";");
            cars.add(new Car(fields[0],                 // String name
                    fields[1],                          // String plate
                    Integer.parseInt(fields[2]),        // int weight
                    Integer.parseInt(fields[3])         // int width
            ));
        }
        scanner.close();*/
        /*
        cars.add(new Car("Ferrari", "4903njkds", 19, 13));
        cars.add(new Car("Fiat", "reg24", 19, 13));
        cars.add(new Car("Maserati", "3g894", 19, 13));
        cars.add(new Car("Volkswagen", "dsf2342", 19, 13));
        */
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            {
                while (line != null) {
                    String[] content = line.split(",");
                    Car new_car = new Car(content[0],
                            content[1],
                            Integer.parseInt(content[2]),
                            Integer.parseInt(content[3])
                    );
                    cars.add(new_car);
                    line = br.readLine();
                }
            }
        }

        return cars;
    }

    public static void save(List<Car> cars, Path path) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Car car : cars) {
                String out = car.getName()+','+car.getPlate()+','+car.getWidth()+','+car.getWeight()+ "\n";
                writer.write(out);
            }
            writer.close();
        }
    }
}

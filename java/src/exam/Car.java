package exam;

public class Car {
    /*
    * String nome;
    * String targa (plate);
    * int weight;
    * int width;
    * */
    String name;
    String plate;
    int weight;
    int width;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", plate='" + plate + '\'' +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }

    public Car(String name, String plate, int weight, int width) {
        this.name = name;
        this.plate = plate;
        this.weight = weight;
        this.width = width;
    }
}

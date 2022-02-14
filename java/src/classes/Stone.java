package classes;

public class Stone {
    double height;

    public Stone(double height) {
        this.height = height;
    }

    public void refresh(double time){
        double accel = 10;
        double space = 0.5 * accel * Math.pow(time, 2);
        this.height = this.height - space;
        if (this.height < 0) {
            this.height = 0;
            System.out.println("The stone has reached ground");
        }
    }

    public double showHeightAfterTime(double t){
        return height - 5 * t * t;
    }

    public double getHeight() {
        return height;
    }
}

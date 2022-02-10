import classes.objects.Rectangle;

public class RectangleInteract {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,2);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.toString());
    }
}
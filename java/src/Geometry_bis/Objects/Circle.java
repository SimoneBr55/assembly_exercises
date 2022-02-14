package Geometry_bis.Objects;

import Geometry_bis.Interfaces.GeometricObject;
import Geometry_bis.Interfaces.Resizable;
//import Interfaces.Computable;
//import Interfaces.Movable;

import java.awt.*;

public class Circle implements Resizable, GeometricObject {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point centro) {
        this.center = centro;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circ{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public void translate(Point movement){
        center.translate((int)movement.getX(), (int)movement.getY());
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public void resize(double scale) {
        setRadius(getRadius()*scale);
    }
}

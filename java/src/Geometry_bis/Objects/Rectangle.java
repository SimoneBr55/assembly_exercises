package Geometry_bis.Objects;

import Geometry_bis.Interfaces.GeometricObject;
import Geometry_bis.Interfaces.Resizable;
import Interfaces.Computable;
import Interfaces.Movable;

import java.awt.*;

public class Rectangle implements Resizable, GeometricObject {
    Point upperLeft;
    Point lowerRight;

    public Rectangle(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight) {
        this.lowerRight = lowerRight;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "upperLeft=" + upperLeft +
                ", lowerRight=" + lowerRight +
                '}';
    }

    public double getBase(){
        return Math.abs(upperLeft.getX() - lowerRight.getX());
    }

    public double getHeight(){
        return Math.abs(upperLeft.getY() - lowerRight.getY());
    }

    public double getArea(){
        return getBase() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2*getHeight() + 2*getBase();
    }

    public void resize(double scale){
        lowerRight.x = (int) (upperLeft.x + (lowerRight.x - upperLeft.x) * scale);
        lowerRight.y = (int) (upperLeft.y - (upperLeft.y - lowerRight.y) * scale);
    }
    public void translate(Point movement){
        upperLeft.translate((int)movement.getX(), (int)movement.getY());
        lowerRight.translate((int)movement.getX(), (int)movement.getY());
    }
}

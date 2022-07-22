import java.util.*;

public class Location {
    private double xvalue;
    private double yvalue;

    public Location(double x, double y){
        xvalue = x;
        yvalue = y;
    }

    public void changeX(double newX){
        xvalue = newX;
    }
    public void changeY(double newY){
        yvalue = newY;
    }
    public double getY(){
        return yvalue;
    }
    public double getX(){
        return xvalue;
    }
}
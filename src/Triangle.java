import java.lang.Math;

public class Triangle {
    private double side;

    public Triangle(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public double getArea(){
        double area = Math.sqrt(3)/4 * Math.pow(side, 2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = this.side * 3;
        return perimeter;
    }
}

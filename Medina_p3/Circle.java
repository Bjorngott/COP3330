package Medina_p3;

public class Circle extends Shape2D{
    private double radius;
    private String name;

    public Circle(double radius){
        super();
        this.radius = radius;
        this.name = "circle";
    }

    public double getArea(){
        return (Math.PI)*(Math.pow(radius, 2));
    }

    public String getName(){
        return name;
    }
}

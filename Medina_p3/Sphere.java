package Medina_p3;


public class Sphere extends Shape3D{
    private double radius;
    private String name;

    public Sphere(double radius){
        super();
        this.radius = radius;
        this.name = "sphere";
    }

    public String getName(){
        return name;
    }

    public double getArea(){
        return (4*Math.PI*(Math.pow(radius, 2)));
    }

    public double getVolume(){
        return ((1.33333333333)*(Math.PI)*(radius*radius*radius));
    }
}

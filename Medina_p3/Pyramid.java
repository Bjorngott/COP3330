package Medina_p3;

public class Pyramid  extends Shape3D{
    private double length;
    private double width;
    private double height;
    private String name;

    public Pyramid(double length, double width, double height){
        super();
        this.length = length;
        this.width = width;
        this.height = height;

        this.name = "pyramid";
    }

    public double getArea(){

        double resultArea = (length*width) + (length * Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)));
        return (resultArea);
    }

    public String getName(){
        return name;
    }

    public double getVolume(){
        return length*width*height/3;
    }
}

package Medina_p2;

public class BodyMassIndex {
    public BodyMassIndex(double height, double weight) {
        CalcBmi(height, weight);

    }

    //Calc BMI score
    public double CalcBmi(double height, double weight){
        double index = 703 * weight / Math.pow(height, 2);
        
        /*if(index < 18.5){
            System.out.println("Underweight");
        }else if(index >= 18.5 && index <= 24.9){
            System.out.println("Normal Weight");
        }else if(index >= 25 && index <= 29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }*/
        
        return index;
    }
    
}

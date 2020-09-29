package Medina_p2;

public class BodyMassIndex {
    public BodyMassIndex(double height, double weight) {
        CalcBmi(height, weight);

    }

    //Calc BMI score
    public double CalcBmi(double height, double weight){
        double index = 703 * weight / Math.pow(height, 2);

        return index;

    }
}

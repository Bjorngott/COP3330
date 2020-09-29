package Medina_p2;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    //private static Object BodyMassIndex;


    //Takes Y/N to continue program
    private static boolean moreInput() {
        Scanner response = new Scanner(System.in);
        String  n = null, N = null;

        boolean moreInput = true;
        System.out.println("Will there be anymore Calculations?");
        String input = response.nextLine();
        if(input == null){
            System.out.println("Thank you. Good Bye.");
            moreInput = false;
            System.exit(1);
        }
        else
        {
            moreInput = true;
        }

        return moreInput;
    }
    //gets users weight
    private static double getUserWeight() {
        Scanner weightInput = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");
        double weight = weightInput.nextDouble();
        if(weight < 0){
            System.out.println("Error: Negative Weight not possible.");
            System.exit(1);
        }

        return weight;
    }
    //gets users height
    private static double getUserHeight() {
        Scanner heightInput = new Scanner(System.in);

        System.out.println("Please enter your height in inches: ");
        double height = heightInput.nextDouble();
        if(height < 0){
            System.out.println("Error: Negative Height not possible.");
            System.exit(1);
        }

        return height;
    }

    //prints out users BMI/Category using info from BodyMassIndex object
    private static void displayBmiInfo(BodyMassIndex Index) {
        System.out.println("");
        System.out.println("");
    }

    //prints out average BMI score of Data
    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
    }

    public static void main(String[] args){
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while(moreInput()){
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }
        displayBmiStatistics(bmiData);
    }

}

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

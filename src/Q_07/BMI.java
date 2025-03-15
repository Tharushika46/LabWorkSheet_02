package Q_07;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        int weight = scan.nextInt();
        System.out.print("Enter your height in cm: ");
        int height = scan.nextInt();
        double bmi = weight / Math.pow(height / 100.0, 2);
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        if (bmi < 18.5) {
            System.out.println("Your weight is low.");
        } else if (bmi < 25) {
            System.out.println("You are normal.");
        } else if (bmi < 30) {
            System.out.println("Your weight is high.");
        } else {
            System.out.println("You are obese.");
        }
    }
}

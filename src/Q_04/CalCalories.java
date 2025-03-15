package Q_04;
import java.util.Scanner;
public class CalCalories {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Your Weight (pound): ");
        double pound = reader.nextDouble();
        double calories = pound * 19;
        System.out.println("You Need to " + calories + " calories per day.");
    }
}

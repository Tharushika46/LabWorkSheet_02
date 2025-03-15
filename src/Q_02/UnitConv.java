package Q_02;
import java.util.Scanner;
public class UnitConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value in inches : ");
        double inches = scan.nextDouble();
        double cm = inches * 2.54;
        System.out.println(inches + " inches --> " + cm + " cm.");
    }
}

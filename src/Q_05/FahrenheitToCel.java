package Q_05;
import java.util.Scanner;
public class FahrenheitToCel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value in Temperature (°F): ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(String.format("%.2f°F --> %.2f°C", fahrenheit, celsius));
    }
}

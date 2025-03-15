package Q_03;
import java.util.Scanner;
public class TempConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value in Temperature (°C): ");
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + "°C --> " + String.format("%.2f" ,fahrenheit) + "°F");
    }
}

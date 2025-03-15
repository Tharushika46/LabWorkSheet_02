package Q_08;
import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere: ");
        double radius = scan.nextDouble();
        double PI = 3.14;
        double volume = (4.0/3.0) * PI * Math.pow(radius, 3);
        System.out.println("The Volume of the Sphere is: " + String.format("%.2f", volume));
    }
}

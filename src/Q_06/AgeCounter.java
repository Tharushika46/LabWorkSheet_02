package Q_06;
import java.util.Scanner;
import java.time.Year;
public class AgeCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your born Year: ");
        int birthYear = scan.nextInt();
        int CurrentYear = Year.now().getValue();
        int age = CurrentYear - birthYear;
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
    }
}

package Q_10;
import java.util.Scanner;
public class LoanCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Loan Amount: ");
        double loan = scan.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter Loan Period (year): ");
        double period = scan.nextInt();
        double monthInerestRate = rate/100.0/12;
        double noOfPayment = period * 12;
        double monthPayment = (loan * monthInerestRate)/(1-Math.pow(1/(1+monthInerestRate),noOfPayment));
        double totalPayment = monthPayment * noOfPayment;
        System.out.println("Monthly Payment: Rs:" + String.format("%.2f",monthPayment));
        System.out.println("Annual Payment: Rs:" + String.format("%.2f",totalPayment));
    }
}

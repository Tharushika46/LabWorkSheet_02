package Q_09;
import java.util.Scanner;
public class InvestmentGrow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of investment: ");
        double investment = scan.nextDouble();
        System.out.print("Enter the annual interest rate in percentage: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        double InvestmentGrows = investment * Math.pow((1 + rate / 1200), years * 12);
        System.out.println("The Investment value after " + years + " years is: " + String.format("%.2f", InvestmentGrows) + "$");
    }
}

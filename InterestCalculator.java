
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for inputs
        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        int time = input.nextInt();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate Compound Interest
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        // Output results
        System.out.println("\n----- Results -----");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

        input.close();
    }
}
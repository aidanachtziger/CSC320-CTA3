import java.util.Scanner;
public class TaxCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weekly income: ");
        double weeklyIncome = scanner.nextDouble();

        double taxRate;
        if(weeklyIncome < 500) {
            taxRate = 0.10;
        } else if(weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15; 
        } else if(weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20; 
        } else {
            taxRate = 0.30;
        }

        double taxWithheld = weeklyIncome * taxRate;

        System.out.println("Weekly Income: $" + weeklyIncome);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Tax Withheld: $" + taxWithheld);

        scanner.close();
    }
}

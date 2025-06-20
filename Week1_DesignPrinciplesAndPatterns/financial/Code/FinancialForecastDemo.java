package financial.forecasting;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FinancialForecastDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Welcome to Financial Forecasting Tool");

        System.out.print("Enter initial income (in ₹): ");
        double income = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        System.out.println("\nForecasting income over " + years + " years:\n");

        for (int i = 1; i <= years; i++) {
            income += income * (growthRate / 100);
            System.out.println("Year " + i + ": ₹" + df.format(income));
        }

        sc.close();
    }
}

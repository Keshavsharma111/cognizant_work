import java.util.Scanner;

public class FinancialForecast {
public static double predictValue(double currentValue, double[] growthRates, int index) {
     if (index == growthRates.length) {
            return currentValue;
        }

        currentValue = currentValue * (1 + growthRates[index]);
return predictValue(currentValue, growthRates, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double[] growthRates = new double[years];
        System.out.println("Enter Growth Rate for each year:");

        for (int i = 0; i < years; i++) {
            System.out.print("Year " + (i + 1) + ": ");
            growthRates[i] = sc.nextDouble();
        }

        double futureValue = predictValue(presentValue, growthRates, 0);
        System.out.printf("Predicted Future Value = %.2f", futureValue);

       
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vatRate, amount, vatAmount, totalAmount;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the amount: ");
        amount = scan.nextDouble();

        vatRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;

        vatAmount = amount * vatRate;
        System.out.println("VAT amount based on the entered amount: " + vatAmount);

        totalAmount = amount + vatAmount;
        System.out.println("Total payment amount: " + totalAmount);
    }
}
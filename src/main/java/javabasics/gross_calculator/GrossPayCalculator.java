package javabasics.gross_calculator;

import java.util.Scanner;

//name a class to be most descriptive of the task the class has to do.
public class GrossPayCalculator {
    public static void main(String[] args) {
        //   1. Get the number of hours worked.
        int hours = 0;
        System.out.println("How many hours did you work?");
        // Get user input
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //   2. Get the hourly pay rate.
        double payRate = 0;
        System.out.println("What is your payrate?");
        payRate = scanner.nextDouble();

        //   3. Multiply hours by pay rate.
        double grossPay = hours * payRate;

        //   4. Display results.
        System.out.println(grossPay);
    }
}

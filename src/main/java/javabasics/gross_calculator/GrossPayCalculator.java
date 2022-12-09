package javabasics.gross_calculator;

//name a class to be most descriptive of the task the class has to do.
public class GrossPayCalculator {
    public static void main(String[] args) {
        //   1. Get the number of hours worked.
        int hours = 40;

        //   2. Get the hourly pay rate.
        double payRate = 25.50;

        //   3. Multiply hours by pay rate.
        double grossPay = hours * payRate;

        //   4. Display results.
        System.out.println(grossPay);
    }
}

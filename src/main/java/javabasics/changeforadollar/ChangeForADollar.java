package javabasics.changeforadollar;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String[] args){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is 'Change for a Dollar'! " +
                "Enter enough change to make exactly $1.00");

        System.out.println("Enter your amount of pennies:");
        int amountOfPennies = scanner.nextInt();

        System.out.println("Enter your amount of nickels:");
        int amountfNickels = scanner.nextInt();

        System.out.println("Enter your amount of dimes:");
        int amountfDimes = scanner.nextInt();

        System.out.println("Enter your amount of quarters:");
        int amountOfQuarters = scanner.nextInt();

        scanner.close();

        double total = amountOfPennies * penny +
                amountfNickels * nickel +
                amountfDimes * dime +
                amountOfQuarters * quarter;

        if(total < dollar){
            double amountLessThenOneDollar = dollar - total;
            // Print only 2 decimal places
            System.out.println("Game Over! You were short " + String.format("%.2f", amountLessThenOneDollar) + " cents.");
        }
        else if(total > dollar){
            double amountMoreThenOneDollar = total - dollar;
            // Print only 2 decimal places
            System.out.println("Game Over! You were over " + String.format("%.2f", amountMoreThenOneDollar) + " cents.");
        }
        else{
            System.out.println("Achiever! That's exactly $" + dollar + ".00! You win!");
        }
    }
}

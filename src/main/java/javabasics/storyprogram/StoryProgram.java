package javabasics.storyprogram;

import java.util.Scanner;

public class StoryProgram {
    public static void main(String[] args) {
        //   1. Get the adjective.
        System.out.println("ADJECTIVE: bright / hot / snowy / misty / other:... ?");
        // Get user input
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.nextLine();

        //   2. Get the season.
        System.out.println("Name a season: ?");
        String season = scanner.nextLine();

        //   3. Get the number.
        System.out.println("Name a number: ?");
        int amount = scanner.nextInt();

        //   4. Display results.
        System.out.println("On a " + adjective + " " + season +
                "day, I drink a minimum of " + amount + " cups of coffee.");
    }
}
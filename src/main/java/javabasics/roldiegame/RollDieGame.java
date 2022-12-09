package javabasics.roldiegame;

import java.util.Random;

public class RollDieGame {

    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("This is: Roll the Die! Roll for Critical");

// For Loop this
        for (int i = 1; i <= maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a natural %d. ", i, die));

            if (currentSpace == lastSpace) {
                System.out.print("You rolled for Critical " + currentSpace + ". CritRole'd that, Achiever!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.print("OVER THE LINE " + lastSpace + " This isn't 'nam, there are rules here. Game Over!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("Location: square " + currentSpace + ".");
                System.out.println("Game over! You're not throwing rocks tonight. Mark it Dude... You needed  " +
                        lastSpace + "more spaces!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on square " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
    }
}


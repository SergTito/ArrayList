package arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {
    //Create a "Guess the Number" game. The program should generate a random number, and the user
    // should guess it. Each user's attempt is saved in an ArrayList,
    // and after guessing the number, the history of attempts is displayed.

    public static void main(String[] args) {
        System.out.println("the program made a number ");
        int randomNumber = (int) (Math.random() * 50);
        ArrayList<Integer> tryingToGuessNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("write a number from 0 to 50");
        System.out.println("If you want to get out of the game, enter any letter");
        while (scanner.hasNextInt()) {

            int numberUser = scanner.nextInt();
            if (numberUser != randomNumber) {
                System.out.println("You didn't guess it try again ");
            } else {
                System.out.println("Hooray you guessed it!!");
                break;
            }
            tryingToGuessNumber.add(numberUser);


        }

        System.out.println("List of attempt:");
        for (int trying : tryingToGuessNumber) {
            System.out.println(trying);
        }

        System.out.println("The program made a number " + randomNumber);

    }

}

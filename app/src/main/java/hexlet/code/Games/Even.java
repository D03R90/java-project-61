package hexlet.code.Games;

import hexlet.code.Cli;
import java.util.Scanner;
public class Even {
    public static void gameEven() {
        Scanner scAnswer = new Scanner(System.in);
        int howMuchCorrect = 0;
        final int maxAnswers = 3;
        final int borderForRandom = 100;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (howMuchCorrect < maxAnswers) {
            int randNumber = (int) (Math.random() * borderForRandom);
            System.out.println("Question: " + randNumber);
            System.out.print("Your answer: ");
            String answer = scAnswer.nextLine();
            if ((answer.equals("yes") && (randNumber % 2 == 0)) || (answer.equals("no") && (randNumber % 2 != 0))) {
                System.out.println("Correct!");
                howMuchCorrect++;
            }  else {
                if (randNumber % 2 != 0) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                }
                if (randNumber % 2 == 0) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                }
                Cli.sayBye();
                break;
            }
        }
        if (howMuchCorrect == maxAnswers) {
            Cli.winGame();
        }
    }
}

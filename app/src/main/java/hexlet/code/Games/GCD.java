package hexlet.code.Games;

import hexlet.code.Cli;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Scanner scAnswer = new Scanner(System.in);
        String wrongAnswer = "' is wrong answer ;(. Correct answer was '";
        int howMuchCorrect = 0;
        final int maxAnswers = 3;
        final int borderForRandom = 100;
        System.out.println("Find the greatest common divisor of given numbers.");
        while (howMuchCorrect < maxAnswers) {
            int minDel = 0;
            int firstNum = (int) (Math.random() * borderForRandom);
            int secondNum = (int) (Math.random() * borderForRandom);
            System.out.println("Question: " + firstNum + " " + secondNum);
            System.out.print("Your answer: ");
            while (secondNum != 0) {
                minDel = secondNum;
                secondNum = firstNum % secondNum;
                firstNum = minDel;
            }
            int answer = scAnswer.nextInt();
            if (answer == minDel) {
                System.out.println("Correct!");
                howMuchCorrect++;
            } else {
                System.out.println("'" + answer + wrongAnswer + minDel + "'.");
                Cli.sayBye();
                break;
            }
        }
        if (howMuchCorrect == maxAnswers) {
            Cli.winGame();
        }
    }
}

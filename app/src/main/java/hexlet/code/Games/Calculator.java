package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void gameCalc() {
        Scanner scAnswer = new Scanner(System.in);
        String wrongAnswer = "' is wrong answer ;(. Correct answer was '";
        int howMuchCorrect = 0;
        final int maxAnswers = 3;
        final int borderForRandom = 100;
        final int endCircle = 4;
        char[] operation = {'+', '-', '*'};
        System.out.println("What is the result of the expression?");
        while (howMuchCorrect < maxAnswers) {
            int firstValue = (int) (Math.random() * borderForRandom);
            int secondValue = (int) (Math.random() * borderForRandom);
            char randomOperation = operation[new Random().nextInt(operation.length)];
            System.out.println("Question: " + firstValue + " " + randomOperation + " " + secondValue);
            System.out.print("Your answer: ");
            int answer = scAnswer.nextInt();
            switch (randomOperation) {
                case '*':
                    int correctAnswerIncr = firstValue * secondValue;
                    if (answer == correctAnswerIncr) {
                        System.out.println("Correct!");
                        howMuchCorrect++;
                    } else {
                        System.out.println("'" + answer + wrongAnswer + correctAnswerIncr + "'.");
                        Cli.sayBye();
                        howMuchCorrect = endCircle;
                    }
                    break;
                case '+':
                    int correctAnswerSum = firstValue + secondValue;
                    if (answer == correctAnswerSum) {
                        System.out.println("Correct!");
                        howMuchCorrect++;
                    } else {
                        System.out.println("'" + answer + "'" + wrongAnswer + correctAnswerSum + "'.");
                        Cli.sayBye();
                        howMuchCorrect = endCircle;
                    }
                    break;
                case '-':
                    int correctAnswerMinus = firstValue - secondValue;
                    if (answer == correctAnswerMinus) {
                        System.out.println("Correct!");
                        howMuchCorrect++;
                    } else {
                        System.out.println("'" + answer + "'" + wrongAnswer + correctAnswerMinus + "'.");
                        Cli.sayBye();
                        howMuchCorrect = endCircle;
                    }
                    break;
                default:
                    howMuchCorrect = endCircle;
                    break;
            }
        }
        if (howMuchCorrect == maxAnswers) {
            Cli.winGame();
        }
    }
}

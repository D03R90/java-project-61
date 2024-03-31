package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static String getQuestion() {
        return RULES;
    }       //Find the greatest common divisor of given numbers

    public static void game() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            int firstNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int secondNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            number[0] = firstNumber + " " + secondNumber;
            number[1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.game(numbers, getQuestion());
    }
}

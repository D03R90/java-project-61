package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String getQuestion() {
        return RULES;
    }
    public static Boolean isPrime(int number) {
        if (number <= 1) {
            return Boolean.FALSE;
        }
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
    public static void game() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            number[0] = String.valueOf(Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE));
            number[1] = isPrime(Integer.parseInt(number[0])) ? "yes" : "no";
        }
        Engine.game(numbers, getQuestion());
    }
}

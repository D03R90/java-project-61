package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String getQuestion() {
        return RULES;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static void game() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            int randomNum = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            number[0] = String.valueOf(randomNum);
            number[1] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.game(numbers, getQuestion());
    }
}

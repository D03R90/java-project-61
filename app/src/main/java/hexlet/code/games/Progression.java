package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_PROGRESS_LENGTH = 6;
    private static final int MAX_PROGRESS_LENGTH = 15;
    private static final String RULES = "What number is missing in the progression?";
    
    public static String getQuestion() {
        return RULES;
    }
    
    public static String[] generateProgression(int firstNumber, int length, int step) {
        String[] progression = new String[length];
        progression[0] = String.valueOf(firstNumber);
        
        for (int j = 1; j < length; j++) {
            progression[j] = String.valueOf(Integer.parseInt(progression[j - 1]) + step);
        }
        
        return progression;
    }
    
    public static void game() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            int length = Utils.randomNumber(MIN_PROGRESS_LENGTH, MAX_PROGRESS_LENGTH);
            int firstNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int progressionNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            
            String[] progression = generateProgression(firstNumber, length, progressionNumber);
            int numberMissed = Utils.randomNumber(0, length - 1);
            int correctNumber = Integer.parseInt(progression[numberMissed]);
            progression[numberMissed] = "..";
            
            number[0] = String.join(", ", progression);
            number[0] = number[0].replace(",", "").replace("..", "?");
            number[1] = String.valueOf(correctNumber);
        }
        Engine.game(numbers, getQuestion());
    }
}

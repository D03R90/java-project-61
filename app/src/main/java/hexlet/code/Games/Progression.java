package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_PROGRESS_LENGTH = 6;
    private static final int MAX_PROGRESS_LENGTH = 15;


    public static String playGame() {
        return "What number is missing in the progression?";
    }
    public static void gameProgression() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {

            int[] progression = new int[Utils.getRandom(MIN_PROGRESS_LENGTH,
                    MAX_PROGRESS_LENGTH)];
            int firstNumber = Utils.getRandom(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int progressionNumber = Utils.getRandom(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            progression[0] = firstNumber;

            for (var j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + progressionNumber;
            }

            int numberMissed = Utils.getRandom(0, progression.length - 1);
            int correctNumber = progression[numberMissed];
            String[] progressionString = new String[progression.length];

            for (int l = 0; l < progressionString.length; l++) {
                progressionString[l] = String.valueOf(progression[l]);
            }

            progressionString[numberMissed] = "..";
            String progressionOutput = String.join(", ", progressionString);
            progressionOutput = progressionOutput.replace(",", "");
            number[0] = progressionOutput;
            number[1] = Integer.toString(correctNumber);
        }
        Engine.runGame(playGame(), numbers);
    }
}

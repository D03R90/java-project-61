package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Even {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final String ANSWER_YES = "yes";
    public static final String ANSWER_NO = "no";

    public static void playGame() {
        Engine.runGame(RULES, getGameData());
    }

    private static String[][] getGameData() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        return gameData;
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        String trueAnswer;
        if (isEven(number)) {
            trueAnswer = ANSWER_YES;
        } else {
            trueAnswer = ANSWER_NO;
        }
        roundData[0] = Integer.toString(number);
        roundData[1] = trueAnswer;
        return roundData;
    }

    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

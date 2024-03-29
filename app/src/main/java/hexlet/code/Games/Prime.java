package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        roundData[0] = Integer.toString(number);
        if (isPrime(number)) {
            roundData[1] = ANSWER_YES;
        } else {
            roundData[1] = ANSWER_NO;
        }
        return roundData;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

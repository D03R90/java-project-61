package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String RULES = "What is the result of the expression?";
    private static final char[] operationArray = {'+', '-', '*'};

    public static void playGame() {
        Engine.runGame(RULES, getGameData());
    }

    private static char getOperation() {
        return operationArray[Utils.getRandom(Utils.RANGE_LIMIT_0, operationArray.length -  1)];
    }

    private static int calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unsupported operation: " + operation);
        };
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
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        int number2 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        char operation = getOperation();
        int trueAnswer = calculate(number1, number2, operation);
        roundData[0] = Integer.toString(number1) + ' ' + operation + ' ' + number2;
        roundData[1] = Integer.toString(trueAnswer);
        return roundData;
    }
}

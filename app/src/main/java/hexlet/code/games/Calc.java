package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";  //
    private static final int GAME_LENGTH = 3;
    
    public static int calcResult(int firstNumber, int secondNumber, char operation) {
        int result;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            default -> throw new IllegalArgumentException("Unknown operator: " + operation);
        }
        return result;
    }
    
    public static String getQuestion() {
        return RULES;
    }
    
    public static void game() {
        String[][] numbers = new String[GAME_LENGTH][2];
        final char[] operators = {'+', '-', '*'};
        for (int i = 0; i < GAME_LENGTH; i++) {
            int operationIndex = Utils.randomNumber(0, operators.length);
            char operator = operators[operationIndex];
            int firstNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int secondNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            numbers[i][0] = firstNumber + " " + operator + " " + secondNumber;
            numbers[i][1] = Integer.toString(calcResult(firstNumber, secondNumber, operators[operationIndex]));
        }
        Engine.game(numbers, getQuestion());
    }
}

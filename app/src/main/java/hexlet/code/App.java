package hexlet.code;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1; //
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;


    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int numberGame = game.nextInt();
        System.out.println("Your choice: " + numberGame);
        switch (numberGame) {
            case GREET:
                System.out.println("Welcome to the Brain Games!");
                Cli.cli(); break;
            case EVEN:
                Even.game(); break;
            case CALC:
                Calc.game(); break;
            case GCD:
                Gcd.game(); break;
            case PROGRESSION:
                Progression.game(); break;
            case PRIME:
                Prime.game(); break;
            case 0:
                break;
            default:
                throw new RuntimeException("Unknown input: " + numberGame);
        }
    }
}

package hexlet.code;

import hexlet.code.Games.Even;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        StringBuilder allGames = new StringBuilder();
        System.out.println("Please enter the game number and press Enter.");
        allGames.append("1 - Greet");
        allGames.append("\n" + "2 - Even");
        allGames.append("\n" + "0 - Exit");
        System.out.println(allGames.toString());
        System.out.print("Your choice: ");
        Scanner scStart = new Scanner(System.in);
        int gameNumber = scStart.nextInt();
        switch (gameNumber) {
            case 0:
                break;
            case 1:
                Cli.sayHello();
                break;
            case 2:
                Cli.sayHello();
                Even.gameEven();
            default:
                break;
        }
    }
}

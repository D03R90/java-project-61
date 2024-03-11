package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;
    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public static void sayBye() {
        System.out.println("Let's try again, " + name + "!");
    }
    public static void winGame() {
        System.out.println("Congratulations, " + name + "!");
    }
}

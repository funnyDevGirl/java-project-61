package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("""
        Please enter the game number and press Enter.
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> Even.checkParity();
            case "3" -> Calc.evaluateExpression();
            case "4" -> GCD.findGCD();
            case "5" -> Progression.formProgression();
            case "6" -> Prime.checkSimplicity();
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Incorrect command input. Goodbye.");
        }
    }
}

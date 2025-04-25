import Utility.SceneManager;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;


public class DeathOfASalesmanScene1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            SceneManager.clearConsole();
            System.out.println("=== Death of a Salesman: Scene 1 — Willy Comes Home ===");
            System.out.println("1. Watch Scene");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                playScene();
                System.out.println("\n(Press Enter to return to menu)");
                scanner.nextLine();
            } else if (choice.equals("2")) {
                break;
            } else {
                System.out.println("Invalid choice.");
                TimeUnit.SECONDS.sleep(1);
            }
        }

        System.out.println("Goodbye.");
        scanner.close();
    }

    private static void playScene() throws InterruptedException {
        sceneTransition("Evening falls. A tired man approaches his home...");
        showWilly();
        SceneManager.pause("Willy: (murmuring) Another day... and nothing sold.", 5);

        sceneTransition("Linda appears at the door, concern in her eyes.");
        showLinda();
        SceneManager.pause("Linda: You’re home early, Willy.", 2);

        showWilly();
        SceneManager.pause("Willy: I couldn’t keep my eyes open. I nearly drove off the road.", 3);

        showLinda();
        SceneManager.pause("Linda: You need rest, dear. Come inside.", 2);

        sceneTransition("Fade to black.");
    }

    private static void sceneTransition(String text) throws InterruptedException {
        SceneManager.clearConsole();
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(300);
        }
        SceneManager.clearConsole();
        System.out.println(text);
        TimeUnit.SECONDS.sleep(2);
        SceneManager.clearConsole();
    }

    private static void showWilly() {
        System.out.println("      __");
        System.out.println("     /  \\");
        System.out.println("    | oo|     (Willy Loman)");
        System.out.println("    |___|");
        System.out.println("    |___|   A tired figure in a rumpled coat.");
    }

    private static void showLinda() {
        System.out.println("     \\||/");
        System.out.println("     (•_•)    (Linda)");
        System.out.println("     /|\\");
        System.out.println("     / \\    Graceful, with deep concern.");
    }


}


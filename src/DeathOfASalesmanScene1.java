import Utility.Images;
import Utility.SceneManager;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;


public class DeathOfASalesmanScene1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            SceneManager.clearConsole();
            Images.showWilly();
            System.out.println("=== Death of a Salesman===");
            System.out.println("1. Watch Scene");
            System.out.println("2. Exit");
            System.out.println("3. Test");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.println("\nWilly: \"He could be anything in this world, Biff.\"\n");
                    break;
                case "2":
                    System.out.println("\nWilly: \"The man who makes an appearance in the business world... is the man who gets ahead.\"\n");
                    break;
                case "3":
                    System.out.println("\nLinda: \"Attention, attention must be finally paid to such a person.\"\n");
                    SceneManager.print("Testing this line", 4, 50);
                    SceneManager.print("......", 1, 500);
                    break;
                case "4":
                    System.out.println("Goodbye, Willy.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

/*
            if (choice.contains("1")) {
                playScene();
                System.out.println("\n(Press Enter to return to menu)");
                scanner.nextLine();
            } else if (choice.equals("2")) {
                break;
            } else {
                System.out.println("Invalid choice.");
                TimeUnit.SECONDS.sleep(1);
            }

 */
            System.out.println("Goodbye Willy");
        }


    }

    private static void playScene() throws InterruptedException {
        SceneManager.sceneTransition("Evening falls. A tired man approaches his home...");
        Images.showWilly();
        //SceneManager.pause("Willy: (murmuring) Another day... and nothing sold.", 5);

        SceneManager.sceneTransition("Linda appears at the door, concern in her eyes.");
        //SceneManager.pause("Linda: You’re home early, Willy.", 2);

        Images.showWilly();
        //SceneManager.pause("Willy: I couldn’t keep my eyes open. I nearly drove off the road.", 3);

       // SceneManager.pause("Linda: You need rest, dear. Come inside.", 2);

        SceneManager.sceneTransition("Fade to black.");
    }

}


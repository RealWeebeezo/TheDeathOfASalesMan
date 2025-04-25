import Utility.Images;
import Utility.SceneManager;


import java.util.Scanner;


public class DeathOfASalesmanScene1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            SceneManager.clearConsole();
            Images.showWilly();
            SceneManager.print("",3,0);
            System.out.println("=== Death of a Salesman===");
            System.out.println("1. Watch A Scene");
            System.out.println("2. Diary");
            System.out.println("3. Essay");
            System.out.println("4. Exit");
            System.out.println("5. Test");
            System.out.print("Choose an option: \n\n");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    playScene();
                    break;
                case "2":
                    System.out.println("\nWilly: \"The man who makes an appearance in the business world... is the man who gets ahead.\"\n");
                    break;
                case "3":
                    System.out.println("\nLinda: \"Attention, attention must be finally paid to such a person.\"\n");
                    break;
                case "4":
                    System.out.println("Goodbye, Willy.");
                    loop = false;
                    break;
                case "5":
                    SceneManager.print("Testing this line", 4, 50);
                    SceneManager.print("......", 1, 500);
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        }


    }

    private static void playScene() throws InterruptedException {
        SceneManager.print("(Willy):",0,0);
        SceneManager.print("The American Dream",0,100);
        SceneManager.print("...",3,500);
    }

}


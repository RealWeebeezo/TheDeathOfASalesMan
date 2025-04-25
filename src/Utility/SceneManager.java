package Utility;

import java.util.concurrent.TimeUnit;

public class SceneManager {

    public SceneManager() {

    }

    public static void print(String line, int pause, int timeToPrint) throws InterruptedException {
        System.out.println("\n");
        for (int i  = 0; i < line.length(); i++){
            System.out.print(line.charAt(i));
            TimeUnit.MILLISECONDS.sleep(timeToPrint);
        }
        TimeUnit.SECONDS.sleep(pause);
        clearConsole();
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sceneTransition(String text) throws InterruptedException {
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
}

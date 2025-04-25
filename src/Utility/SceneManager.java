package Utility;

import java.util.concurrent.TimeUnit;

public class SceneManager {

    public SceneManager() {

    }

    public static void pause(String line, int seconds) throws InterruptedException {
        System.out.println("\n" + line);
        TimeUnit.SECONDS.sleep(seconds);
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

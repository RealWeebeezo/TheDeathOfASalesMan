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
}

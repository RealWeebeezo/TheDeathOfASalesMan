package Utility;

public class SceneLines {

    public SceneLines(){

    }

    public static String essay(){
        return """
                At the beginning of Death of a Salesman, Biff Loman dreams of success in a way his father would be proud of: wealth, popularity, and a stable career.\s
                Earlier in life, Biff was a star athlete with several scholarship offers, and his father, Willy, constantly reminded him he was destined for greatness. \s
                This dream isn’t Biff’s, though; it’s a dream handed down to him by his father. However, the dream falls apart when Biff discovers Willy’s affair while visiting Boston.\s
                Seeing this utterly shatters the image Biff had of his father and the values he was raised with.\s
                Because of this, Biff drifts from job to job, unable to live the life his father wanted for him.\s
                Eventually, Biff discovers a passion for working outdoors, on ranches and farms.\s
                Biff no longer tries to pursue a life of material gain, but rather a life where he can live true to himself.\s
                This creates tension between him and Willy, who refuses to accept that his son no longer shares his vision.\s
                Biff’s struggle to claim his identity away from his father's expectations is central to the play’s conflict.\s
                By the end of the play, Biff is the only character who sees their life clearly; his dream goes from an illusion shaped by his father to a life that he can live honestly.
                Biff’s dream of living a simple, honest life does not fully come true within the story, but he does reach a sense of clarity and closure.\s
                By the end of the story, Biff no longer thinks he’s destined for greatness in the way his father intended.\s
                Unlike Willy and Happy, Biff no longer finds himself trapped in a false version of the American dream.\s
                He accepts that he is “a dime a dozen,” something his father could not do, and finds strength in that realization.\s
                Biff doesn’t want to chase material success in business the way his father wanted him to, he simply wants to live a life that’s authentic to him.\s
                Biff shares this newly discovered truth with his family, especially Willy, but it leads to conflict.\s
                Willy can’t accept that his son isn’t who he wanted him to be, and this denial ultimately leads to Willy’s suicide.\s
                Despite this tragedy, Biff doesn’t let it change his beliefs.\s
                At Willy’s funeral, he makes it clear that he has no plans to settle into a corporate life.\s
                So while his dream hasn’t yet been fulfilled, he has found closure.\s
                He knows what he wants and who he is, so in a play filled with delusion and denial, Biff’s honesty is a rare victory.
                Biff’s dream in Death of a Salesman is central to the play’s exploration of the American Dream and identity.\s
                Throughout the play, Biff’s evolving dream represents the juxtaposition between illusion and reality.\s
                In the beginning, he believes in the American Dream: success through popularity, wealth, and status, values projected onto him by his father.\s
                This dream is based on the idea that being successful and well-liked in business is the key to happiness, but this dream is empty to Biff.\s
                His realization that he is “a dime a dozen” shows his rejection of this illusion and a turning point in his self-understanding.\s
                Biff’s journey toward an honest life represents a break from the false ideals that bind both Willy and Happy.\s
                While Willy continues to search for an unattainable version of success, Biff seeks simplicity and authenticity.\s
                By embracing his true self, Biff offers a stark contrast to the delusions that trap his father, revealing to him that an honest life is more fulfilling than chasing hollow success.\s
                Biff’s dream contributes to the play’s broader critique of the American Dream, demonstrating how it can distort personal identity and destroy familial relationships.\s
                In a society where many simply chase materialistic success, Biff’s eventual clarity emphasizes the importance of self-acceptance and the clear dangers of living for others’ expectations.
               \s""";
    }

    public static void diary() throws InterruptedException {
        SceneManager.sceneTransition("Opening Willy Loman's diary...");

        // Entry 1 — Early Fatigue
        SceneManager.print("March 28th, 1948", 1, 40, true);
        SceneManager.print("The road was long today.", 1, 30, true);
        SceneManager.print("I stopped in Hartford, but I couldn’t make a sale.", 1, 30, true);
        SceneManager.print("The man didn’t even remember me.", 1, 35, true);
        SceneManager.print("I laughed like I meant it.", 2, 28, true);

        // Entry 2 — Linda’s Worry
        SceneManager.print("March 30th, 1948", 1, 40, true);
        SceneManager.print("Linda asked if I was okay.", 1, 30, true);
        SceneManager.print("She said I talk to myself more often now.", 1, 30, true);
        SceneManager.print("I told her I was practicing speeches.", 1, 25, true);
        SceneManager.print("But truth is, I’m just trying to hear a voice that believes in me.", 2, 26, true);

        // Entry 3 — Remembering Biff
        SceneManager.sceneTransition("A memory flickers between the pages...");
        SceneManager.print("April 1st, 1948", 1, 38, true);
        SceneManager.print("I saw Biff outside with his old football.", 1, 32, true);
        SceneManager.print("He used to shine. Everyone saw it.", 1, 28, true);
        SceneManager.print("They all said: 'He’s going places, that boy.'", 1, 30, true);
        SceneManager.print("Now he avoids my eyes. Like he knows something I don't.", 2, 30, true);

        // Entry 4 — Hope
        SceneManager.print("April 3rd, 1948", 1, 38, true);
        SceneManager.print("Howard might give me a local job.", 1, 30, true);
        SceneManager.print("Just in the city. No driving. No swerving off the road.", 1, 25, true);
        SceneManager.print("I’ll wear my best tie. I’ll smile. I’ll make him see me again.", 2, 28, true);

        // Entry 5 — The Dream Cracks
        SceneManager.sceneTransition("Later that day...");
        SceneManager.print("April 3rd, 1948 — Evening", 1, 40, true);
        SceneManager.print("Howard told me I talk too much.", 1, 25, true);
        SceneManager.print("He played a wire recording of his son and didn’t even look at me.", 1, 30, true);
        SceneManager.print("I begged him.", 1, 28, true);
        SceneManager.print("I told him about Dave Singleman — the man who died with green slippers and clients mourning him in every city.", 1, 25, true);
        SceneManager.print("But Howard just nodded and said it was time to let go.", 2, 28, true);

        // Final Entry — Collapse
        SceneManager.sceneTransition("The ink on the page runs like tears...");
        SceneManager.print("April 4th, 1948", 1, 40, true);
        SceneManager.print("I sat in the kitchen, and the refrigerator made a noise I’ve never heard before.", 1, 30, true);
        SceneManager.print("Linda sewed in the corner. She didn’t ask how the meeting went.", 1, 30, true);
        SceneManager.print("She already knew.", 1, 25, true);

        SceneManager.print("Am I still someone?", 2, 35, true);
        SceneManager.print("Or just the echo of what I wanted to be?", 3, 30, true);

        SceneManager.sceneTransition("The diary closes. Silence remains.");
    }
}

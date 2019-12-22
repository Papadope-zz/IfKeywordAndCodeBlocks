package ifkeywordandcodeblocks;

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        boolean gameOver1 = true;
        int score1 = 10000;
        int levelCompleted1 = 8;
        int bonus1 = 200;

        //example 1
        if (score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        }

        //example 2
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }
        System.out.println("This was executed");

        //example 3
        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");

        }
        //example 4
        if (score <= 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");

        }
        //example 5
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less that 1000");

        } else {
            System.out.println("Got here");

        }
        //example 6
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was :" + finalScore);
        }

//        int savedFinalScore = finalScore; //<-- cant do this out of the code block
        // Challenge
        if (gameOver1 == true) {
            int finalScore = score1 + (levelCompleted1 * bonus1);
            System.out.println("Your final1 score was :" + finalScore);

        }

        //Challenge Solution 2
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was :" + finalScore);
        }

    }

}

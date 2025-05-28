import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args){
        // Welcome message
        System.out.println("*****************************************");
        System.out.println("Welcome to the Attack on Titan Quiz Game!");
        System.out.println("*****************************************");

        // declare variables like total and scanner stuff
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        // array of questions
        String[] Questions = {
                "Finish the line: On your feet ___.",
                "Who inherited the Colossal titan after Bertholdt?",
                "When does Eren first realize the future of the rest of the world?",
                "How long do Titan shifters live for?",
                "Eren is a slave to..."
        };

        // array of answers
        int[] answers = {
                4, 1, 2, 2, 3
        };

        // 2d array of options
        String[][] options = {
                {"1. father", "2. Eren", "3. daddy", "4. dad"},
                {"1. Armin", "2. Reiner", "3. Levi", "4. Eren"},
                {"1. The first episode.", "2. When kissing Historia's hand.", "3. At the end.", "4. He never did."},
                {"1. 2 years", "2. 13 years", "3. 14 years", "4. 16 years"},
                {"1. titans.", "2. his dad.", "3. freedom.", "4. life."}
        };

        // for loop that goes through each question
        int j = 0;
        for (String question : Questions){
            System.out.println(question);
            System.out.println();
            for (int i = 0; i < 4; i++){
                System.out.println(options[j][i]);
            }
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            // if answer right add to the total
            if (guess == answers[j]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                total += 1;
            }
            // if answer wrong tell the right answers
            else{
                System.out.println("******");
                System.out.println("WRONG!");
                System.out.println("******");
                System.out.println("The right answer was: " + answers[j]);
                System.out.println();
            }

            j += 1;
        }
        // print final score
        System.out.println("*******************************");
        System.out.println("Your final score is: " + total + " out of 5");
        System.out.println("*******************************");

        // Close scanner
        scanner.close();
    }
}

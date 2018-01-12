import java.util.Scanner;
import java.util.Random;

public class QuizProgram {





    public  static void main(String[] Args) {
        Random rand = new Random();
        int score = 0;


        for (int z = 0; z < 10; z++) {
            int n = rand.nextInt(100);
            int m = rand.nextInt(n);
            Boolean p = rand.nextBoolean();


            System.out.println("What is the correct answer to: " + n + "+" + m);

            Scanner input = new Scanner(System.in);

            int a = input.nextInt();

           // if (p = true) {
            //

//            }
            if (a != (n + m)) {
                System.out.println("False");


            } else if (a == (n + m)) {
                System.out.println("True");
                score++;
            } else {

                System.out.println("Invalid answer");
            }

            //System.out.println(a);


        }
        System.out.println("You scored " + ((score)*10) + "on the quiz!");

    }
}

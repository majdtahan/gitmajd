import java.util.Scanner;


public class QuizProgram {

    public  static void main(String[] Args) {
        int score = 0;

        for (int z = 0; z < 10; z++) {
            int n = (int) (Math.random() * 100);
            int m = (int) (Math.random() * n);
            int rando = (int) (Math.round(Math.random()));
            int a;

            if (rando == 0) {
                System.out.println("What is the correct answer to: " + n + "+" + m);
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                if (a != (n + m)) {
                    System.out.println("False! The correct answer is: "+ (n+m));


                } else{
                    System.out.println("Correct! ");
                    score++;
                }

            }
            else if(rando==1){

                System.out.println("What is the correct answer to: " + n + "-" + m);
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                if (a==(n-m)){
                        System.out.println("Correct! ");
                        score++;
                    }

                 else{
                        System.out.println("False! The correct answer is: "+(n-m));

                    }
                }
            }
        System.out.println("You scored " + ((score)*10) + "% on the quiz!");
        }

        }





 //use math.random

public class HistogramProgram {

    public static void main(String[] Args){


        String score ="";
        String score1="";
        String score2="";
        String score3="";
        String score4="";
        String score5="";
        String score6="";
        String score7="";
        String score8="";
        String score9="";


        for(int i=0;i<100;i++){
            byte n = (byte)(Math.random()*100);


            if(n==0){
                score+="*";
            }
            if(n==1){
                score1+="*";

            }
            if(n==2){
                score2+="*";

            }
            if(n==3){
                score3+="*";

            }
            if(n==4){
                score4+="*";

            }
            if(n==5){
                score5+="*";
            }
            if(n==6){
                score6+="*";
            }
            if(n==7){
                score7+="*";
            }
            if(n==8){
                score8+="*";
            }
            if(n==9){
                score9+="*";
            }





        }
        System.out.println("score 0: "+score);
        System.out.println("score 1: "+score1);
        System.out.println("score 2: "+score2);
        System.out.println("score 3: "+score3);
        System.out.println("score 4: "+score4);
        System.out.println("score 5: "+score5);
        System.out.println("score 6: "+score6);
        System.out.println("score 7: "+score7);
        System.out.println("score 8; "+score8);
        System.out.println("score 9: "+score9);

    }





}

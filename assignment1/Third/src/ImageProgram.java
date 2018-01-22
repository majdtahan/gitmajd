//Majd El-Tahan
//101037041

public class ImageProgram {

    public static void main(String[] args) {

            boolean x= false;
            boolean bool[][] = new boolean[10][10];
            int maxV =0, maxH =0;
            int currV =0 , currH =0;
            //Declares a value true or false

            for (int k = 0; k < bool.length; k++) {
                for (int p = 0; p < bool[k].length; p++) {
                    int rando = (int) (Math.round(Math.random()));   // creating a boolean value without importing random
                    if (rando < .5) {
                        x = true;
                        System.out.print('O');          // if it's true it inserts a string "O"

                        }else if (rando > .5) {
                        x = false;
                        System.out.print('.');              //if it's false it inserts a "." string
                    }
                        bool[k][p] = x;                         // populating the grid with the values
                }
                System.out.println("");                             // indenting after 10 values to create the grid
            }

            for(int i = 0;i<10;i++){                                    //double looping to get through entire grid, finding the longest vertical streak of trues
                for(int u=0;u<10;u++){
                    if(bool[u][i]==true){
                        currV++;
                        if(currV>maxV){                                 // if the streak is larger than the previous, it sets it equal to a new variable (to save high scores)
                            maxV=currV;

                        }
                    }else{
                        currV = 0;
                    }
                }currV=0;
            }


            for(int f=0;f<10;f++){                                      //same concept as the vertical but now applying to horizontal (switching the values in if statement)
                for(int t=0;t<10;t++){
                    if(bool[f][t]==true){
                        currH++;
                        if(currH>maxH){
                            maxH=currH;
                        }
                    }else{
                        currH=0;
                    }
                }currH=0;
            }

            System.out.println("The longest vertical sequence is: "+maxV );
            System.out.println("The longest horizontal sequence is: " +maxH);
            }
        }







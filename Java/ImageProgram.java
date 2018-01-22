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
                    int rando = (int) (Math.round(Math.random()));
                    if (rando < .5) {
                        x = true;
                        System.out.print('O');
                        for(int i =0; i<bool.length;i++){
                            if(bool[k][p]=true){
                                currH++;
                            }

                            else if(bool[k][p]!=true){
                                currH=maxH;
                                currH=0;
                            }
                            for(int u =0; u<bool[k].length;u++){
                                if(bool[k][p]=true){
                                    currV++;
                                }
                                else if(bool[k][p]!=true){
                                    currV =maxV;
                                    currV=0;
                                }
                            }
                        }
                        }
                     else if (rando > .5) {
                        x = false;
                        System.out.print('.');
                    }
                        bool[k][p] = x;
                }
                System.out.println("");
            }



            System.out.println("max h: "+maxH + " maxv: "+maxV);
            }


        }



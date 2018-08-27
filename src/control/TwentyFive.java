package control;

import java.util.Random;

public class TwentyFive {
    public static void main(String[] args){
        int x = 0;

        while (1 < 2){

            Random rand = new Random();
            int i  = rand.nextInt(100);
            System.out.println(i);
            if (i < x){
                System.out.println("Меньше");
            }
            else if (i > x){
                System.out.println("Больше");
            }
            else{
                System.out.println("Равно");
            }
            x = i;
        }
    }
}

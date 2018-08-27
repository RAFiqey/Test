package operators;

import java.util.Random;

public class Spot {
    public static void main(String[] args) {
        int x;
        Random rand = new Random();
        x = rand.nextInt(2);
           if (x != 0) {
               System.out.println("Орел");
           } else {
               System.out.println("Решка!");
           }
    }
}

// Имитация броска монетки. Проще говоря: игры "Орел, решка".
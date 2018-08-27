package com.rafity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean bool = true;
        int Number;
        String yes = "yes";
        String no = "no";

        Matem.date();

        System.out.println("Please, enter number less of 10");

        while (bool) {
            Scanner scanner = new Scanner(System.in);
            Number = scanner.nextInt();

            if (Number <= 10) {
                System.out.println("Victory!");
                break;
            }
            System.out.println("You number not less 10! Try again!");
        }

        People Ilya = new People();
        Ilya.mean("Ilya", 27, 185);
        Ilya.sayHello();

        }
    }

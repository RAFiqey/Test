package Lesson1.StaticTest;

public class Incrementable {

    static void increment(){
        StaticTest.x++;
        System.out.println(StaticTest.x);
    }

    public static void main(String[] args){
        increment();
    }
}

// Выводим инкремент числа на экран. Задание №7

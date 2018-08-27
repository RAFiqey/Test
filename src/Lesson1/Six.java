package Lesson1;

public class Six {

    static  int storage(String s){
        return s.length() * 2;
    }

    public static void main(String[] args){
        System.out.println(storage("BOY"));
    }
}

// Программка считает число букв в слове, умножает число на 2 и выводит это значение на экран
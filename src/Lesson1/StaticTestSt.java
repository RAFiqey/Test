package Lesson1;

class StaticTestSt {

   int i = 47;


    public static void main(String[] args){
        StaticTestSt st1 = new StaticTestSt();
        StaticTestSt st2 = new StaticTestSt();
        StaticTestSt st3 = new StaticTestSt();

        System.out.println("st1 = " + st1.i);
        System.out.println("st2 = " + st2.i);
        System.out.println("st3 = " + st3.i);

    }
}

// Задание №8. Но использование статик не совсем такое как написано в книге.
// Если делать статическим методом переменную i, тогда нельзя обращаться к объектам класса и наоборот.
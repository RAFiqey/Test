package operators;

public class Assignment {
    float i;

    public static void main(String[] args){
        Assignment ass1 = new Assignment();
        Assignment ass2 = new Assignment();

        ass1.i = 3.123f;
        ass2.i = 2.331f;

        System.out.println("ass1 = " + ass1.i + ". ass2 = " + ass2.i);
        ass1 = ass2;
        System.out.println("ass1 = " + ass1.i + ". ass2 = " + ass2.i);
        ass1.i = 8.11f;
        System.out.println("ass1 = " + ass1.i + ". ass2 = " + ass2.i);
    }
}
// Задание со страницы 98. (Создать класс с полем типа float. Использовать его для демонстрации совмещения имен
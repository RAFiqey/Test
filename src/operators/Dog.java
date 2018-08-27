package operators;

public class Dog {
    String name;
    String says;

    public static void main(String[] args){
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        Dog test = new Dog();

        spot.name = "Spot";
        spot.says = "I am Spot!";

        scruffy.name = "Scruffy";
        scruffy.says = "I am Scruffy!";

        System.out.println(spot.name + " " + spot.says);
        System.out.println(scruffy.name + " " + scruffy.says);

        test.says = "ssd";
        test.name = "test";
        spot = test;

        System.out.println(test.name + " " + test.says);
        System.out.println("__________________");
        System.out.println(spot == test);
        System.out.println(spot.equals(test));
        System.out.println("__________________");
        System.out.println(spot.name + " " + spot.says);
        System.out.println(test.name + " " + test.says);


    }
}



// СТраница 104. Упражнения 5 и 6.

package unit09.inheritance.day36.polumorphicvariables;

public class Fruit {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Grape grape=new Grape();
        Apple apple = new Apple();
        RedGrapes redGrapes=new RedGrapes();
        Fruit fruit1= new Grape();
        Fruit polyapple = new Apple();
        Fruit polyGrape = new Grape();
        Apple polymorphicApple = new Apple();

        Fruit[]fruits = new Fruit[5];
        fruits[0] = new Fruit();
        fruits[1]=new Apple();
        fruits[2]=new Grape();
        fruits[3]=new RedGrapes();
        fruits[4]=new Fruit();

        for (Fruit fruita: fruits
             ) {
            System.out.println(fruita.getClass().getSimpleName());

        }

        Grape []grapes=new Grape[4];
        grapes[0]= new Grape();



    }
}

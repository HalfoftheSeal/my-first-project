package lv.acodemy.classroom;

import lv.acodemy.classroom.Cat;

public class ObjectExample {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);
        barsik.setAge(4);
        System.out.println(barsik.getAge());
        barsik.setWeight(5.4);
        System.out.println(barsik.getWeight());

        barsik.speak();
        barsik.feed();

        Cat mark = new Cat("Mark", "brown", 4, 5.4, "Persian", "male", true);
        System.out.printf("My cat name is: " + mark.getName() + ". He is " + mark.getColor() + " and " + mark.getAge() + " years old. He weights " + mark.getWeight() + " kg. He is a " + mark.getBreed() + " cat. He is a " + mark.getGender() + ".\n");
        mark.walk();
        System.out.println(mark.getEnergy());
        mark.feed();
        System.out.println(mark.getEnergy());
    }
}

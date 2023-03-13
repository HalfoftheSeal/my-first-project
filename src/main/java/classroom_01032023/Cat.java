package classroom_01032023;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cat {
    private String name;
    private String color;
    @Setter
    private int age;
    @Setter
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;
    private final int MAX_ENERGY = 5;
    private int energy = 5;
    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, String color, int age, double weight, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }



    public void speak() {
        System.out.println("Meow!");
    }
    public void feed() {
        if (energy == MAX_ENERGY) {
            System.out.println("I'm not hungry!");
        } else
        energy++;
        System.out.println("Om-nom-nom!");
    }
    public void walk() {
        if (energy <= 0) {
            System.out.println("I don't have enough energy to walk!");
        } else {
        System.out.println("Walkie-walkie!");
        energy--;
    }}




}

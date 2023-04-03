package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {
        byte myCurrentAge = 20;
        System.out.println(myCurrentAge);
        short mySalary = 12000;
        System.out.println(mySalary);
        int dateOfBirth = 160902;
        System.out.println(dateOfBirth);
        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);
        float lapTime = 32.30F;
        System.out.println(lapTime);
        double weight  = 69.4;
        System.out.println(weight);
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApple = true;
        String name = "Max";
        String surName = "Shilov";
        String fullName = name + " " + surName;
        System.out.println(fullName);
        String fullNameWithAge = fullName + " " + myCurrentAge;
        System.out.println(fullNameWithAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
    }
}
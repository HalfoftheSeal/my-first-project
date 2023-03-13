package lv.acodemy.homework01032023;

public class VariablesHomework {
    public static void main(String[] args) {
        byte numberOfStudentsPerClass = 30;
        byte numberOfTeachersPerClass = 3;
        System.out.println(numberOfStudentsPerClass);
        System.out.println(numberOfTeachersPerClass);

        short teachersAnnualSalary = 24000;
        short teachersMonthSalary = 2000;
        System.out.println(teachersAnnualSalary);
        System.out.println(teachersMonthSalary);

        int studiesCode = 2475634;
        int schoolPhone = 21111115;
        System.out.println(studiesCode);
        System.out.println(schoolPhone);

        long schoolBudget = 32000000;
        long cityPopulation = 14000000;
        System.out.println(schoolBudget);
        System.out.println(cityPopulation);

        float classTemperature = 22.5F;
        float hallTemperature = 20.5F;
        System.out.println(classTemperature);
        System.out.println(hallTemperature);

        double breakfastPrice = 2.25;
        double lunchPrice = 2.75;
        System.out.println(breakfastPrice);
        System.out.println(lunchPrice);

        boolean hasFootballField = true;
        boolean hasPool = false;
        System.out.println(hasFootballField);
        System.out.println(hasPool);

        String name = "Max";
        String surName = "Shilov";
        String fullName = name + " " + surName;
        String hobbies = "music, boardgames, video games, books and movies";
        System.out.printf("Hey! My name is %s. I love %s.\n", fullName, hobbies);

        int x = 4;
        int y = 26;
        int z = (x - 3) * (x - 3) + (y - 5) * (y - 5);
        System.out.println(z);
    }
}


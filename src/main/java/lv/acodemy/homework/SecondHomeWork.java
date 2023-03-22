package lv.acodemy.homework;

import java.util.Scanner;
import java.util.Arrays;

public class SecondHomeWork {
    public static void main(String[] args) {
        String[] countries = {"Austria", "Germany", "France", "Latvia", "Estonia", "Lithuania", "Belgium", "Netherlands", "Spain", "Denmark"};
        System.out.println(Arrays.toString(countries));
        for (String country: countries) {
            if ("Latvia".equals(country)) {
                System.out.println("Latvia is my motherland.");
            }
        }

        String[] sentence = {"Sometimes", " it", " pays", " to", " stay", " in", " bed", " on", " Monday,", " rather", " than", " spending", " the", " rest", " of", " the", " week", " debugging", " Monday’s", " code."};
        for (String s : sentence) {
            System.out.printf(s);
        }

        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nsalary = ");
        salary = sc.nextDouble();
        if (salary <= 5000) {
            System.out.println("Your salary is low.");
        } else if (5000 < salary && salary <= 10000) {
            System.out.println("Your salary is average.");
        } else if (salary > 10000) {
            System.out.println("Your salary is high.");
        }

        int number;
        System.out.print("number = ");
        number = sc.nextInt();
        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        }
    }
}

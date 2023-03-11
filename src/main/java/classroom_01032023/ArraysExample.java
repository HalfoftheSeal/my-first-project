package classroom_01032023;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers[4]);

        int apples = numbers[6];
        System.out.println("I have " + apples + " apples");
        System.out.println("Number array contains of: " + numbers.length + " numbers.");

        numbers[0] = 90;
        numbers[9] = 50;
        System.out.println(Arrays.toString(numbers));

        int[] euribor = new int[10];
        euribor[0] = 1;
        euribor[1] = 3;
        System.out.println(Arrays.toString(euribor));

        String[] names = {"John", "Anna", "Maria", "Mike", "Andrew"};
        System.out.println(names.length);
        System.out.println("My name is " + names[3]);

        names[1] = "Mark";
        System.out.println(Arrays.toString(names));


    }
}

package classroom_01032023;

public class IfElse {
    public static void main(String[] args) {
// boolean x = 5 > 2;
// System.out.println(x);
//
// if(x) {
//     System.out.println("Yes, 5 is more than 2");
//
// }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even.");
        } else {
            System.out.println("Number: " + number + " is not even number.");
        }

        boolean isEvenNumber = 30 % 2 == 0;
        System.out.println(isEvenNumber);

        int age = 17;
        if (age <= 17) {
            System.out.println("You are not allowed to shop here!");
        } else if (age <= 0) {
            System.out.println("Who are you?");
        } else {
            System.out.println("Welcome to our shop!");
        }

        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Summer months: June, July, August");
        }

        String name = "Max";
        if (name.equals("John")) {
            System.out.println("Hello John");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }

        int currentMonths = 1;
        if (currentMonths == 12 || currentMonths == 1 || currentMonths == 2) {
            System.out.println("This is winter");
        } else if (currentMonths == 3 || currentMonths == 4 || currentMonths == 5) {
            System.out.println("This is spring");
        } else if (currentMonths == 6 || currentMonths == 7 || currentMonths == 8) {
            System.out.println("This is summer");
        } else if (currentMonths == 9 || currentMonths == 10 || currentMonths == 11) {
            System.out.println("This is autumn");
        } else {
            throw new IllegalStateException("Unexpected value: " + currentMonths);
        }

        String student1 = "Anna";
        String student2 = "Max";
        if (student1.equals("John") || student2.equals("Max")) ;
        {
            System.out.println("They will work together");
        }
    }
}

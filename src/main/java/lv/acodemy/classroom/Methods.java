package lv.acodemy.classroom;

public class Methods {
    public static void main(String[] args) {
        printText("My name is Max", 5);
        printText("Hello World");
        String maxStory = myStory("Max", "Shilov", 20);
        System.out.println(myStory("John", "Doe", 10));
        System.out.println(maxStory);
    }
    public static void printText(String text, int loopCount) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }
    public static void printText(String text) {
        for (int i = 0; i < 10; i++) {
            System.out.println(text);
        }
    }
    public static String myStory(String name, String lastName, int age) {
        String result = "My name is " + name + " " + lastName + "I am " + age + " years old";
        return result;
    }
}

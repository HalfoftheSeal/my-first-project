package lv.acodemy.homework;

public class Object {
    public static void main(String[] args) {
        PezDispenser woody = new PezDispenser("Woody", "blue", "Toy Story");
        System.out.println(woody.getName());
        System.out.println(woody.getColor());
        System.out.println(woody.getSeriesName());
        woody.eatCandy();
        System.out.println(woody.getCandyCount());
        woody.eatCandies(8);
        System.out.println(woody.getCandyCount());
        woody.eatCandies(8);
        System.out.println(woody.getCandyCount());
        woody.eatCandies(-3);
        System.out.println(woody.getCandyCount());
        woody.addCandy();
        System.out.println(woody.getCandyCount());
        woody.addCandies(4);
        System.out.println(woody.getCandyCount());
        woody.addCandies(-8);
        System.out.println(woody.getCandyCount());
        woody.fill();
        System.out.println(woody.getCandyCount());
        woody.addCandy();
        System.out.println(woody.getCandyCount());
        woody.addCandies(2);
        System.out.println(woody.getCandyCount());
    }
}

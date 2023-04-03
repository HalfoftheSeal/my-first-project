package lv.acodemy.homework;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PezDispenser {
    private String name;
    private String color;
    private String seriesName;
    private int candyCount;
    private final int MAX_CANDY = 12;

    public PezDispenser(String name, String color, String seriesName) {
        this.name = name;
        this.color = color;
        this.seriesName = seriesName;
        this.candyCount = MAX_CANDY;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getCandyCount() {
        return candyCount;
    }
    public void eatCandy() {
        if (candyCount>0) {
            candyCount--;
            System.out.println("You've eaten a candy! Yum!");
        } else {
            System.out.println("You don't have any candies!");
        }
    }
    public void eatCandies(int candyAmount) {
        if (candyAmount>candyCount) {
            System.out.println("You don't have that many candies!");
        } else if (candyAmount <= 0) {
            System.out.println("You don't eat candies like that...");
        } else {
            candyCount = candyCount - candyAmount;
            System.out.printf("You've eaten %d candies! Yum!\n", candyAmount);
        }
    }
    public void fill() {
        candyCount = MAX_CANDY;
        System.out.println("You've filled your pez dispenser! Yay!");
    }
    public void addCandy() {
        if (candyCount == MAX_CANDY) {
            System.out.println("Your pez dispenser is full!");
        } else {
            candyCount++;
            System.out.println("You've added a candy to your pez dispenser. Neat!");
        }
    }
    public void addCandies(int candyAmount) {
        if (candyAmount > MAX_CANDY) {
            System.out.println("You don't have space for all these candies!");
        } else if (candyAmount <= 0) {
            System.out.println("You can't add candies like that.");
        } else {
            candyCount = candyAmount + candyCount;
            if (candyCount > MAX_CANDY) {
                candyCount = candyCount - candyAmount;
                System.out.println("You don't have space for all these candies!");
            } else {
                System.out.printf("You've added %d candies to your pez dispenser. Nice!\n", candyAmount);
            }
        }
    }
}

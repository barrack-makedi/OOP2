import java.util.*;
public class diceRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int roll3 = random.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + roll1 + ", " + roll2 + ", " + roll3);

        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled a triple!");
            total += 6;
        } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled a double!");
            total += 2;
        }

        System.out.println("Total: " + total);
        if (total > 15) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}

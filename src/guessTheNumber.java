import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int randomNumber = rand.nextInt();
    }

    public static int gamePlay(int userNumber, int randomNumber) {
        int count = 0;
        while (randomNumber != userNumber) {
            count++;
            System.out.println("guess the number again: " + userNumber);
        }
        System.out.println("you win!");
        return gameConditions(userNumber, randomNumber);

    }
    public static int gameConditions(int userNumber, int randomNumber) {
        if (userNumber < randomNumber) {
            System.out.println("You are too low!");
        } else if (userNumber > randomNumber) {
            System.out.println("You are too high!");

        }
        return randomNumber;
    }
}

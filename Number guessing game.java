import java.util.Scanner;
import java.util.Random;

    class Game1 {
        int userNumber;
        int computerNumber;
        int count = 0;
        int score;

        public Game1() {
            System.out.println("The computer has chosen its number.");
            Random r = new Random();
            computerNumber = r.nextInt(100) + 1;
            score = (int) (Math.log(100) / Math.log(2)) + 1; // Minimum guesses based on binary search complexity
            System.out.println("Starting score (minimum number of attempts): " + score);
        }

        public void takeUserInput() {
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            userNumber = sc.nextInt();
        }

        public boolean isCorrectNumber() {
            count++;
            score--; // Reduce score with each attempt
            if (userNumber < computerNumber) {
                System.out.println("Choose a greater number.");
                return false;
            } else if (userNumber > computerNumber) {
                System.out.println("Choose a smaller number.");
                return false;
            } else {
                System.out.println("You have guessed the correct number!");
                System.out.println("Computer's number was: " + computerNumber);
                return true;
            }
        }

        public int getNoOfGuesses() {
            return count;
        }

        public int getScore() {
            return score;
        }
    }

    public class number_guessinggame {
        public static void main(String[] args) {
            Game1 g = new Game1();
            boolean isCorrect = false;
            while (!isCorrect) {
                g.takeUserInput();
                isCorrect = g.isCorrectNumber();
            }
            System.out.println("Total guesses to find the correct number: " + g.getNoOfGuesses());
            System.out.println("Your final score: " + g.getScore());
        }
    }



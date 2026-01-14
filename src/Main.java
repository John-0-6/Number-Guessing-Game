import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("""
          ~~~~~~~~~~~~~~~~~~~~~
          Number Guessing Game
          ~~~~~~~~~~~~~~~~~~~~~""");

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    boolean running = true;

    while (running) {

      int random = rand.nextInt(1, 101); // NEW number each round

      while (true) {
        System.out.print("Guess the Number: ");
        int guess = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        if (guess > random) {
          System.out.println("LOWER");
        } else if (guess < random) {
          System.out.println("HIGHER");
        } else {
          System.out.println("YOU WIN!");
          break;
        }
      }

      System.out.print("PLAY AGAIN (YES / NO)? ");
      String playAgain = scanner.nextLine().toUpperCase();

      if (!playAgain.equals("YES")) {
        System.out.println("THANK YOU FOR PLAYING!");
        running = false;
      }
    }

    scanner.close();
  }
}

/*

A number-guessing game.

*/

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Game {
  public static void main(String[] args){
    System.out.println("Hello Friend! What's your name?");
    System.out.println("(type in your name)");

    Scanner input = new Scanner(System.in);

    String name = input.nextLine();

    System.out.println(name + " I'm thinking of a number between 1 and 100.");
    System.out.println("Can you guess what the number is?");


    Random rand = new Random();
    int number = rand.nextInt(100);
    int tries = 0;

    System.out.println("The number is"+number);

    System.out.println(name + "I'm thinking of a number between 1 and 100.");
    System.out.println("Can you guess what the number is?");

    while (true) {
      int guess;
      try {
        guess = input.nextInt();
      } catch(InputMismatchException e) {
        String bad_input = input.next();
        System.out.println("That's not an integer, try again");
        continue;
      }

      if (guess < 1 || guess > 100){
        System.out.println(guess + " is not a valid number, try again");
        continue;
      }

      tries = tries + 1;

      if (guess < number) {
        System.out.println("Your guess is too low, try again.");

      } else if (guess > number) {
        System.out.println("Your guess is too high, try again.");

      } else {
        System.out.println("Well done " + name);
        System.out.println("You found my number in " + tries + " tries!");
        break;
      }

    }

  }

}

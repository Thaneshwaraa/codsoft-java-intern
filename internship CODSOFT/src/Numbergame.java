import java.util.*;

public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("welcome to number guessing game!!!");

        int score = 0;
        boolean playagain = true;

        while(playagain){
            int targetnum = rd.nextInt(100)+1;
            int attempts = 0;
            int maxattempts =10;
            System.out.println("I have selected a number between 1 and 100 \nCan you guess it?");

            while (attempts < maxattempts){
                System.out.println("enter the guess:");
                int userguess = sc.nextInt();
                sc.nextLine();
                attempts++;
                if(userguess == targetnum){
                    System.out.println("You guessed the number " + targetnum + " in " + attempts + " attempts.");
                    score ++;
                    break;
                } else if (userguess < targetnum) {
                    System.out.println("too low try again");
                }
                else{
                    System.out.println("too high! try again");
                }
                if (attempts >= maxattempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + targetnum + ".");
                }
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainInput = sc.nextLine();
                playagain = playAgainInput.equalsIgnoreCase("yes");
            }
            }
        System.out.println("Game over! Your score: " + score);
        sc.close();
        }
    }


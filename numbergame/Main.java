import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;

        int score = 100;

        for(int attempt=10; attempt>0; attempt--){
            System.out.println("===============================================");
            System.out.println("Attemp left: "+attempt);
            System.out.print("Enter your guess: ");
            int userGuess = scan.nextInt();
            int diff = randomNumber - userGuess;
            if(diff==0){
                System.out.println("Your guess is correct");
                System.out.println("Random number = "+randomNumber);
                System.out.println("Score = "+score);
                break;
            }else if(diff<0){
                System.out.println("Your guess is too high");
            }else{
                System.out.println("Your guess is too low");
            }
            score-=10;
            System.out.println("Try again!");
        }
        if(score==0){
            System.out.println("You loose!");
        }
        scan.close();
    }
}
import java.util.Scanner;
import java.lang.Math;
public class numberGame{
    public static void numberGuessingGame()
    {
        Scanner sc= new Scanner(System.in);    //Scanner class to take input

        int n1 = 1+ (int)(100*Math.random());


        int A=5;

        int i, guess;

    
        System.out.println("A number between 1 to 100. "+"Guess the number");

        for (i=0; i<A; i++){

            System.out.println("Guess one number:");

            guess = sc.nextInt();

            if (guess==n1){
                System.out.println("O wow! you guessed correct number");
                break;

            }
            else if (n1>guess && i != A-1){
                System.out.println("The number you Guessed is greater than "+guess);
            }
            else if (n1<guess && i != A-1){
                System.out.println("The number you guessed is less than "+guess);
            }
        }
        if(i==A){
            System.out.println("Game over");
            System.out.println("The number was "+n1);

        }
    }
    public static void main(String arg[]){
        numberGuessingGame();

    }
}
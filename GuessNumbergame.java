import java.util.Scanner;
import java.util.Random;

//Number Guessing game
public class GuessNumbergame {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      Random r=new Random();
        int Maxattempt = 5;
        int score = 0;
        String playAgain;

        do{
           int GuessNo=r.nextInt(100)+1;
            int attemp=0;
            boolean won=false;

       System.out.println("Enter guess number between 1 to 100. You have maximum "+Maxattempt+" attempts!");
            while (attemp<=Maxattempt) {
                System.out.println("enter guess no:");
                int userGuess=sc.nextInt();
                 attemp++;

                if(userGuess == GuessNo){
                    won=true;
                    score++;
                    System.out.println("Congratulations! you guess currect number!");
                    break;
                }else if(userGuess<GuessNo){
                    System.out.println("too low !try again!");
                }else{
                     System.out.println("too high !try again!");
                }

            }

            if(!won){
                System.out.println("Sorry! you have used all your attempts! the currect number was: "+ GuessNo);
            }

            System.out.println("want to Play Again?(yes/no)");
            playAgain=sc.next();  //taking sting as input


        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("your final score:" + score);
        System.out.println("Thank you for playing this Game....!!");

        sc.close();
        
    }
}

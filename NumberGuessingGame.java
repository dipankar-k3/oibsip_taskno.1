import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int TotalRounds = 4;
        int RoundNumber = 1;
        int HighestScore = 0;


        while (RoundNumber <= TotalRounds) {
            int NumberToGuess = random.nextInt(100) + 1;
            int NumberOfGuesses = 0;
            int RoundScore = 100;

            System.out.println("Round " + RoundNumber);
            System.out.println("Guess a number between 1 and 100");
            System.out.print("Enter a valid number:");

            while (true) {
                int guess = sc.nextInt();
                NumberOfGuesses++;

                if (guess == NumberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + NumberOfGuesses + " tries.");
                    System.out.println("Round Score: " + RoundScore);

                    if(NumberOfGuesses <= 5){
                        System.out.println("You are very lucky!!");
                    } else if(NumberOfGuesses==1){
                        System.out.println("Boom!! Your luck is MindBlowing");
                    } else if(NumberOfGuesses==9){
                        System.out.println(" ");
                        System.out.println("You've been by the edges!!");
                    } else {
                        System.out.println(" ");
                        System.out.println("Your luck is struglling!!");
                        System.out.println("Best of luck for the next Round");
                        System.out.println(" ");
                    }

                    if(RoundScore > HighestScore){
                       HighestScore = RoundScore;
                    }

                    break;
                } else if (guess < NumberToGuess) {
                    System.out.println("Hint:-Your guess is too low...Try again.");
                    System.out.print("Enter a valid number:");

                    RoundScore -= 1;
                } else {
                    System.out.println("Hint:-Your guess is too high...Try again.");
                    System.out.print("Enter a valid number:");
                    RoundScore -= 1;
                }

                if(NumberOfGuesses==10){
                    System.out.println("Sorry You've failed to guess the number in 10 traials!!");
                    System.out.println("Try Again!!");
                } 
                
            }

            RoundNumber++;
        }

        System.out.println("Game Over!!");
        System.out.println("Your Highest Score is:" + HighestScore);
        
    }
}

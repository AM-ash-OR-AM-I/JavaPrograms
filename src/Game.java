import java.util.Scanner;

class GuessNumber {
    private int noOfGuesses, userGuess;
    private final int actualNumber;

    GuessNumber(int maxVal) {
        actualNumber = (int) (maxVal * Math.random() + 1);
        System.out.println("Guess a number between 1 - "+maxVal);
    }

    public void setUserInput(int n) {
        userGuess = n;
    }

    int getNoOfGuesses() {
        return noOfGuesses;
    }

    boolean isCorrectNumber() {
        if (userGuess == actualNumber){
            return true;
        }
        else {
            noOfGuesses += 1;
            System.out.println("Actual number is " +((actualNumber > userGuess)?"bigger":"smaller")
                    +" than guessed number.");
            return false;
        }

    }
}

class AdvancedGuessNumber extends GuessNumber{
    int newGuess;

    public AdvancedGuessNumber(int maxVal) {
        super(maxVal);
        setUserInput(12);

    }
}

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessNumber game = new GuessNumber(10);
        do {
            game.setUserInput(input.nextInt());
        } while (!game.isCorrectNumber());
        System.out.println("Congratulations! You're correct :)");
        System.out.println("You took " + game.getNoOfGuesses() + " guesses to get to answer.");
    }
}

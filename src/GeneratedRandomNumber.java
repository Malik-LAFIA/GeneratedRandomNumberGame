import java.util.Random;
import java.util.Scanner;

public class GeneratedRandomNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String mainMessage = "Welcome to the random generated number game !";
        System.out.println(mainMessage);
        System.out.println("Enter your name.");
        String name = scanner.next();
        System.out.println("Hello " + name + ".");

        int startGame;

        do{
            System.out.println("Would you like to start the game ?");
            System.out.println("Enter 1 for Yes and 2 for NO : ");
            startGame = scanner.nextInt();

            if(startGame == 2) {
                System.out.println("Good bye !");
                System.exit(0);
            }else {
                System.out.println("We can start the game.");

                Random random = new Random();
                int number = random.nextInt(51);
                int chosenNumber = -1;

                System.out.println("The number is already chosen.");

                int numberOfTry = 0;

                do {
                    System.out.println("Chose a number between 0 and 50");
                    chosenNumber = scanner.nextInt();
                    numberOfTry++;

                    if(numberOfTry == 5) {
                        System.out.println("Sorry your number of try is over !");
                        break;
                    }

                    if(chosenNumber == number) {
                        System.out.println("Congratulations, you find the good number !!!");
                        break;
                    }
                    else if (chosenNumber < number) {
                        System.out.println("The right number is higher than " + chosenNumber + ".");
                    }
                    else {
                        System.out.println("The right number is lower than " + chosenNumber + ".");
                    }

                }while(chosenNumber != number);
            }
        }while(startGame == 0);

    }
}

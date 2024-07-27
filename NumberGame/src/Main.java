import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Number Guessing Game ");

        int score = 0;
        int count1 = 0;
        boolean menu = true;

        while (menu) {
            System.out.println("----Main Menu----");
            System.out.println(" 1-Enter the game \n 2-view Score \n 3-Quit");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    boolean playagain = true;
                    while (playagain) {
                        int answer;
                        int rand = random.nextInt(100) + 1;
                        System.out.println("Enter number of attempts ");
                        int attempts = scanner.nextInt();

                        int count = attempts;
                        

                        for (int i = 0; i < attempts; i++) {
                            
                            System.out.println("Guess a number between 1 and 100");
                            answer = scanner.nextInt();
                            if (answer < rand) {
                                System.out.println("Too Low! Try again ");
                                count--;
                                System.out.println("You still have " + count + " left");
                            } else if (answer > rand) {
                                System.out.println("Too High ! try again");
                                count--;
                                System.out.println("You still have " + count + " left");
                            } else {
                                System.out.println("correct the number is " + rand);
                                System.out.println("You guessed the number in " + count + " attempts");
                                score += 20;
                                count1++;
                                System.out.println("Do you want to continue ? Y for yes N for no ");
                                String cont = scanner.next();

                                if (cont.charAt(0) == 'Y' || cont.charAt(0) == 'y') {
                                    playagain = true;
                                    
                                    break;
                                } else if (cont.charAt(0) == 'N' || cont.charAt(0) == 'n') {
                                    playagain = false;
                                    break;
                                }
                            }
                            if (count == 0) {
                                System.out.println("you didnt guess the number ");
                                System.out.println("the number is :" + rand);
                                System.out.println("Do you want to try again  ? Y for yes N for no ");
                                String cont = scanner.next();
                                switch (cont.charAt(0)) {
                                    case 'Y':
                                    case 'y':
                                        playagain = true;
                                        
                                        
                                        break;
                                    case 'N':
                                    case 'n':
                                        playagain = false;
                                        break;
                                    default:
                                        System.out.println("invalid option . y for yes , N for no ");
                                        cont = scanner.next();
                                        if (cont.charAt(0) == 'Y' || cont.charAt(0) == 'y') {
                                            playagain = true;
                                            
                                            break;
                                        } else if (cont.charAt(0) == 'N' || cont.charAt(0) == 'n') {
                                            playagain = false;
                                            break;
                                        }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("-------Score-------");
                    System.out.println("your Score is : " + score);
                    System.out.println("Number of wins :" + count1);
                    break;
                case 3:
                    System.out.println("Are you sure you want to Quit ? \n y for Yes , n for No");
                    String quit = scanner.next();
                    if (quit.charAt(0) == 'y' || quit.charAt(0) == 'Y') {
                        menu = false;
                        System.out.println("Thank you for playing the game ! see you again");
                    } else if (quit.charAt(0) == 'n' || quit.charAt(0) == 'N') {
                        menu = true;
                    }
                    break;
                default:
                    System.out.println("Invalid option , try again");
            }
        }
    }
}
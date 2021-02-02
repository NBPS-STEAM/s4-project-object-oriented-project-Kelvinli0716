import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //Instance Variables
        int guessNum;
        int tries = 0;
        boolean valid = false;
        boolean start = false;
        int correctNum = (int) (Math.random() * 9) + 1;
        //(int) (Math.random() * (max - min)) + min;
        //Max: 10 
        //Min:1
        //Max-Min = 10-1 = 9
        
        //Compare object
        boolean win = false;
        String code = "I am not a robot!";System.out.println("Please type 'I am not a robot!' to verify that you are human being.");
        Scanner input2 = new Scanner(System.in);
        String inputCode = input2.nextLine();
        if (code.equals(inputCode)){
          start = true;
          System.out.println("You can start the game now!");
        }
        else{
          System.out.println("Error!");
        }
        
        while (win == false && start == true) {
            System.out.print("Guess a number between 1 to 10: ");
            Scanner input = new Scanner(System.in);
            guessNum = input.nextInt();
            tries++;
            
            //Check if the number is between 1 to 10, inclusive
            for (int i = 1; i < 11; i++) {
                if (i == guessNum) {
                    valid = true;
                    break;
                }
            }
            

            //Compares the guess number and the correct number
            if ((valid == true) && (win == false)) {
                if (guessNum == correctNum) {
                    win = true;
                } else if (guessNum <= correctNum) {
                    System.out.println("Your guess is too low! Guess another one!");
                } else if (guessNum >= correctNum) {
                    System.out.println("Your guess is too high! Guess another one!");
                }
            } 
            else {
                System.out.println("Reminder: Please type a number between 1 to 10!");
            }

            //Prints a hint if the user has tried already 5 times
            if (tries == 5) {
                if (correctNum % 2.0 == 0) {
                    System.out.println("Hint: It's an even number!");
                } else {
                    System.out.println("Hint: It's an odd number!");
                }
            }
            valid = false;
        }
        
        if(win == true){
        //End Game Statements
        System.out.println("You Win!");
        System.out.println("The number was " + correctNum + ".");
        System.out.println("It took you " + tries + " tries.");
        
        //Draw Christmas Tree
        int n = 10;
        for(int i=0; i<10; i++){
            for(int k=0; k<n; k++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
                System.out.println();
          n--;
        }
        //Reference: https://codescracker.com/java/java-nested-loops.htm
        System.out.println("Merry Christmas!");
        }
    }   
}

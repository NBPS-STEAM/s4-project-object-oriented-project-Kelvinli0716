import java.util.Scanner;
public class Main
{   
    public static void main(String[] args)
    {
        //reference: https://www.geeksforgeeks.org/arrays-in-java/
        //https://beginnersbook.com/2013/12/how-to-convert-string-to-int-in-java/

        //list of monsters
        Monster[] listOfMonsters = new Monster[3];
        listOfMonsters[0] = new Monster("Monster Dybbuk");
        listOfMonsters[1] = new Monster("Monster Azazel");
        listOfMonsters[2] = new Monster("Monster Polyphemos");        

        //list of questions
        Question[] listOfQuestions = new Question[5];
        listOfQuestions[0] = new Question("What is a odd prime number that is less that 5?", "3");
        listOfQuestions[1] = new Question("What 4 mod 3?", "1");
        listOfQuestions[2] = new Question("What is ln(e)?", "1");
        listOfQuestions[3] = new Question("What is 2 to the 3rd power?", "8");
        listOfQuestions[4] = new Question("What is 0! (!=factorial)?", "1");

        //list of user's answers
        Answer[] listOfUserAnswers = new Answer[5];
        //user input
        Scanner input = new Scanner(System.in);
        //user selects a character
        System.out.println("Please type a number to select your monster character: 1. Dybbuk 2. Azazel 3. Polyphemos");
        String userCharacter = input.nextLine();

        //welcome message
        System.out.println("Hello " + listOfMonsters[(Integer.valueOf(userCharacter)-1)].getName() + ". Welcome to the Number Guessing Game!");        
        //prints out instructions
        System.out.println("There will be 5 questions. All answers are one-digit integers. Press any key to start!");
        //user can press any key to start the game
        String start = input.nextLine();
        
        //play (true): the user is still playing the game
        //play (false): the user is no longer playing the game
        boolean play = true;

        //count: number of games the user played 
        int count = 0;

        //while loop: while the user is still playing the game
        while (play){
            //+1 to the total count to the number of games the user played
            count++;
            //sets the score to 0 for each round
            Score.setScore(0);
            //ask the user all the questions in the list
            for(int i = 0; i < listOfQuestions.length; i++){
                //prints user a question to answer
                System.out.println("Question " + (i+1) + ": " + listOfQuestions[i].getQuestion());
                //retrieves user's input of the answer to the question given in the previous line
                String userInput = input.nextLine();
                //stores the user's input of the answer to a list of user's answer
                listOfUserAnswers[i] = new Answer(userInput);
                //compares the answer with the user's input for the answer
                if(listOfQuestions[i].getAnswer().equals(userInput)){
                    //if it was answered correctly, score will be added.
                    Score.addScore();
                }
            }
            //once the user finishes playing a round, the score will be compared to their best score
            Score.compareScore();
            //play (false): the user is no longer playing the game
            play = false;   
            //prints out messages about the results to this game
            System.out.println("\nCongrats! You have finished all " + listOfQuestions.length + " questions! Your score for this game is: " + Score.getScore() + "/" + listOfQuestions.length);
            System.out.println("The best score of all games you played is: " + Score.getBestScore() + "/" + listOfQuestions.length);
            System.out.println("You have played this game " + count + " times.");
            //gives user comments on their score they received
            Score.comment();
            //asks the user if they want to see the answer key, try again, or exit the program
            Question.confirmation();
            //retreives user's answer to the question above
            String userChoice1 = input.nextLine();

            if (userChoice1.equals("1")){
                for(int i = 0; i < listOfQuestions.length; i++){
                    //question
                    String question = listOfQuestions[i].getQuestion();
                    //correct answer
                    String answerKey = listOfQuestions[i].getAnswer();
                    //user's answer
                    String userAnswer = listOfUserAnswers[i].getUserAnswer();

                    //prints out message about the question, correct answers, and user's answer
                    System.out.println("\nQuestion " + (i+1) + ": " + question);
                    System.out.println("Answer: " + answerKey);     
                    System.out.println("You Answered: " + userAnswer);

                    //compares the answer key with the user's answer
                    if(answerKey.equals(userAnswer)){
                        //If the answer key matches with the user's answer, then the user answered that particular question correctly.
                        System.out.println("Correct."); 
                    }
                    else{
                        //Oppositely, if the answer key doesn't match with the user's answer, then the user answered that particular question incorrectly.
                        System.out.println("Incorrect."); 
                    }
                }
                //user have the option to try again or exit the program.
                System.out.println("\nPress 2 --> Try Again");
                System.out.println("Press any other key --> Exit Program");
                //retrieves user input for the question above
                String userChoice2 = input.nextLine();
                //2 represents try again
                if(userChoice2.equals("2")){
                    //the game will continue to run, if the user choses to play again.
                    //play (true): the user is still playing the game
                    play = true;
                }
            }
            //2 represents try again
            else if (userChoice1.equals("2")){
                //the game will continue to run, if the user choses to play again.
                //play (true): the user is still playing the game
                play = true;
            }
        }
    }
}
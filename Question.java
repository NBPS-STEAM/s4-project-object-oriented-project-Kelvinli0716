public class Question{
    //question: stores the questions and the answers to the test of the game
    
    //instance variables
    //question: stores the the questions of the game
    private String question;
    //answer: stores the answer of the game
    private String answer;

    //constructors
    public Question(){
        this.question = " ";
        this.answer = " ";
    }
    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    } 

    //methods 
    //confirmation: the user can choose if they want to see the answer key, try again, or stop playing at the end of the game.
    public static void  confirmation(){
        System.out.println("\nPress 1 --> Answer Key");
        System.out.println("Press 2 --> Try Again");
        System.out.println("Press any other key --> Exit Program");
    }

    //accessors
    public String getQuestion(){
        return this.question;   
    }    
    public String getAnswer(){
        return this.answer;   
    }    

    //mutators
    public void setQuestion (String question)
    {
        this.question = question; 
    }
    public void setAnswer (String answer)
    {
        this.answer = answer; 
    }

}
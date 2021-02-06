public class Answer{
    //answer: stores user's answer
    
    //instance variables
    //userAnswer: user's answer
    private String userAnswer;
    
    //constructors
    public Answer(){
        this.userAnswer = "";        
    }
    public Answer(String userAnswer){
        this.userAnswer = userAnswer;
    } 

    //methods 
    //accessors
    public String getUserAnswer(){
        return this.userAnswer;   
    }

    //mutators
    public void setUserAnswer (String userAnswer)
    {
        this.userAnswer = userAnswer; 
    }
}
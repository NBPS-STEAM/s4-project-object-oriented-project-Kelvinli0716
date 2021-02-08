public class Score{
    //Score: allow user to see how well they did on the game
    //right answer = +1
    //wrong answer = +0

    //instance variables
    //score: scores will be updated for every question the user completed
    private static int score = 0;
    //best score: user's will know if the score they received on this try is their best score
    private static int bestScore = 0;

    //methods
    //addScore: score will be increment by 1 if the user answered the question correctly
    public static void addScore(){
        score ++;
    }
    //compareScore: updates the best score, if the user scored a higher score
    public static void compareScore(){
        if (score > bestScore){
            bestScore = score;
        }     
    }
    //comment: gives user a comment on their performance at the end of each try
    public static void comment(){
        if(score < 4){
            //comments to the score that are less than 4
            System.out.println("No, worries. You can still give another try or view the answer key!");
        }
        else if(score == 4){
            //comments to the scores that are 4
            System.out.println("Wow! You almost got a 100%!");
        }
        else{
            //comments to scores that are higher than 4
            System.out.println("Amazing, 100%!");
        }
    }

    //accessors
    public static int getScore(){
        return score;
    }

    public static int getBestScore(){
        return bestScore;
    }

    //mutators
    public static void setScore(int num){
        score = num;
    }

    public static void setBestScore(int num){
        bestScore = num;
    }

}


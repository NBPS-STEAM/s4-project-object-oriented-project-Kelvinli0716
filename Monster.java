public class Monster{
    //Monster: monsters are the characters user's can chose when the game started
    
    //instance variables
    //name: monster's name
    private String name;

    //constructors
    public Monster(){
        this.name = "N/A";        
    }

    public Monster(String name){
        this.name = name;
    } 

    //methods 
    //accessors
    public String getName(){
        return this.name;   
    }

    //mutators
    public void setName (String name)
    {
        this.name = name; 
    }
}
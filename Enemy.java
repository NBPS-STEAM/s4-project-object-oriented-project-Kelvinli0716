public class Enemy{
  /**
 * This class allows the user to create an enemy with health, attack, weapon, and name
 */
 
  // instance variables
  // This holds the health of the enemy created. 
  private int health;
  // This holds the attack of the enemy created. 
  private int attack;
  //This holds the name of the weapon of the enemy created. 
  private String weapon;
  // This holds the name of the enemy created. 
  private String name; 
  
  //constructor
  //Constructor for Enemy class that initialize the default value of health and attack of an enemy as 1 and initialize the default name of the enemy as "sample".
  public Enemy(){
    health = 1; 
    attack = 1; 
    name = "Tim";
    weapon = "Gun";
  }

  /*
     * Constructor for Enemy class that initialize the health, attack, name, and weapon with the parameter inputted. 
     * health accepts int for the initialization of the health of the enemy
     * name accepts String for the initialization of the name of the enemy
     * attack accepts int for the initialization of the attack of the enemy
     * weapon accepts String for the initialization of the weapon of the enemy
    */
    
  public Enemy(int health, String name, int attack, String weapon){
    this.health = health;
    this.name = name; 
    this.attack = attack;
    this.weapon = weapon;     
  }
  
  // method
    // accessor
    /*
     * This accessor allow the user to access the private variable health.
     * @return Sends back an int that is the health of the enemy. 
     */
    public int getHealth (){
        return this.health; 
    }
    /*
     * This accessor allow the user to access the private variable attack.
     * @return Sends back an int that is the attack of the enemy. 
     */
    public int getAttack (){
        return this.attack; 
    }
    /*
     * This accessor allow the user to access the private variable name.
     * @return Sends back a String that is the name of the enemy. 
     */
    public String getName (){
        return this.name; 
    }
    /*
     * This accessor allow the user to access the private variable weapon.
     * @return Sends back a String that is the weapon of the enemy. 
     */
    public String getWeapon (){
        return this.weapon; 
    }

    //mutator
    /*
     * This mutator allow the user to change the private variable health.
     * @param health accepts int for the current health of the enemy.
     */
    public void setHealth(int health){
        this.health = health;
    }
    /*
     * This mutator allow the user to change the private variable attack.
     * @param attack accepts int for the current attack of the enemy.
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /*
     * This mutator allow the user to change the private variable name.
     * @param name accepts String for the current name of the enemy.
     */
    public void setName(String name){
        this.name = name;
    }

    /*
     * This mutator allow the user to change the private variable weapon.
     * @param name accepts String for the current weapon of the enemy.
     */
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
}
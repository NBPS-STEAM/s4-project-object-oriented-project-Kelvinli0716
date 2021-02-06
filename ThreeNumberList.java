public class ThreeNumberList{
 /**
  * This class allows the user to create a list with three numbers
  */ 
  //instance variables
  private int number1; 
  private int number2; 
  private int number3; 
  public static int numOfList = 0; 
  //private Enemy[] hord = new Enemy[3];

  //constructor 
  //Constructor for ThreeNumberList class that initialize the default value of all three number in the ThreeNumberList to 0.
  public ThreeNumberList(){


      number1 = 0;
      number2 = 0;
      number3 = 0; 
  }

/*
     * Constructor for ThreeNumberList class that initialize the number1, number2, and number3 with the parameter inputted. 
     number1 accepts int for the initialization of the number1 of the ThreeNumberList
     number2 accepts int for the initialization of the number2 of the ThreeNumberList
     number3 accepts int for the initialization of the number3 of the ThreeNumberList
     
    */
  public ThreeNumberList(int number1, int number2, int number3){
    this.number1 = number1;
    this.number2 = number2; 
    this.number3 = number3;
    numOfList = numOfList+1; 
  }

  // method
    // accessor
    /*
     * This accessor allow the user to access the private variable number1.
     * @return Sends back an int that is the number1 of the ThreeNumberList. 
     */
    public int getNumber1 (){
        return this.number1; 
    }
    /*
     * This accessor allow the user to access the private variable number2.
     * @return Sends back an int that is the number2 of the ThreeNumberList. 
     */
    public int getNumber2 (){
        return this.number2; 
    }
    /*
     * This accessor allow the user to access the private variable number3.
     * @return Sends back an int that is the number3 of the ThreeNumberList. 
     */
    public int getNumber3 (){
        return this.number3; 
    }
    /*
     * This accessor allow the user to access the private variable numOfList.
     * @return Sends back an int that is the total number of list created. 
     */
    public static int getnumOfList (){
        return numOfList; 
    }

    //mutator
    /*
     * This mutator allow the user to change the private variable number1.
     * @param number1 accepts int for the current number1 of the ThreeNumberList.
     */
    public void setNumber1(int number1){
        this.number1 = number1;
    }
    /*
     * This mutator allow the user to change the private variable number2.
     * @param number2 accepts int for the current number2 of the ThreeNumberList.
     */
    public void setNumber2(int number2){
        this.number2 = number2;
    }

    /*
     * This mutator allow the user to change the private variable number3.
     * @param number3 accepts int for the current number3 of the ThreeNumberList.
     */
    public void setNumber3(int number3){
        this.number3 = number3;
    }


}
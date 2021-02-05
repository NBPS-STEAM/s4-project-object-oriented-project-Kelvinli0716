public class Main {
    public static void main(String[] args) {
    Enemy monster1 = new Enemy(20, "Kelvin Li",  1, "sword");
    System.out.println("The name of Monster 1 is " + monster1.getName() + ".");

    System.out.println();
    System.out.println("Current number of list is " + ThreeNumberList.getnumOfList() + "."); 
    ThreeNumberList list1 = new ThreeNumberList(250, 38, 0); 
    System.out.println("The new list created with number "+ list1.getNumber1() + " " + list1.getNumber2() + " " + list1.getNumber3() );
    System.out.println("Right now, the number of list is " + ThreeNumberList.getnumOfList() + ".");
    }
}
// Base class : Player
class Player {
    String name;
    int age;

    //Constructor for player class
    Player(String name,int age){
        this.name = name;
        this.age = age;
    }

    //Method to display player details
    void Display_Info(){
        System.out.println("Player Name : " + name);
        System.out.println("Age : " + age); 
    }
}

class Cricket_Player extends Player {
   String role; // e.g. Batsman , Bowler

   Cricket_Player(String name, int age, String role){
    super(name,age); // Call to parent constructor
    this.role = role;
   }

   // Overridden method
   void Display_Info(){
    super.Display_Info();
    System.out.println("Sport : Cricket");
    System.out.println("Role : " + role);
    System.out.println("\n");
   }
}

// Derived class Football_Player
class Football_Player extends Player {
   String position; // e.g., Goalkeeper, Striker

   Football_Player(String name, int age , String position){
      super(name, age);
      this.position=position;
   }

   // Overridden method
   void Display_Info(){
     super.Display_Info();
     System.out.println("Sport : Football");
     System.out.println("Position : " + position);
   }
}

public class PlayerTest {
    public static void main(String[] args){
         Cricket_Player cp = new Cricket_Player("Aakash", 20,  "Batsman");
         Football_Player fp = new Football_Player("Shubham", 20,  "GoalKeeper");

         System.out.println("==Cricket Player Info ==");
         cp.Display_Info();

         System.out.println("== Football Player Info == ");
         fp.Display_Info();
    }
}
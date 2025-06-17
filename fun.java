import java.util.*;
public class fun {
    public static void main(String[] args) {
    String name;
    int choice = 0;
    String sport;
    
    System.out.println("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.println("Hello " + name + ", welcome to the fun program!");
    System.out.println("Please choose an option:");
    System.out.println("1. Play Tennis");
    System.out.println("2. Play Football");
    System.out.println("3. Play Cricket");
    System.out.println("4. Play Badminton");
    System.out.println("5. Play Hockey");
    choice = sc.nextInt();
    if(choice == 1){
        sport = "Tennis";
        System.out.println("You chose to play " + sport + ".");
    }
    else if(choice == 2){
        sport = "Football";
        System.out.println("You chose to play " + sport + ".");
    }
    else if(choice == 3){
        sport = "Cricket";
        System.out.println("You chose to play " + sport + ".");
    }
    else if(choice == 4){
        sport = "Badminton";
        System.out.println("You chose to play " + sport + ".");
    }
    else if(choice == 5){
        sport = "Hockey";
        System.out.println("You chose to play " + sport + ".");
    }
    else{
        System.out.println("Invalid choice. Please try again.");
    }
    
    sc.close();
    }
}


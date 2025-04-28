/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barra
 */
import java.util.Scanner;
public class imports {
    Scanner scanner = new Scanner(System.in);
    public void readNameAndAge(){
        String name;
        int age; //in years
        System.out.print("Name? ");
        name = scanner.next();
        
        System.out.println("Age?");
        age = scanner.nextInt();
        
        System.out.println("Hello " +name+". you are "+age+ " springs young");
       
    }
    public static void main(String[]args){
        (new  imports()).readNameAndAge();
    }
}

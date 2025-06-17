import java.util.Random;
public class OrderIdGenerator {
  public static void main(String[]args){
//create an instance
 Random thing = new Random();
 String[] orderIDs = new String[5];

 // loop
 for(int i = 0; i < orderIDs.length; i++){

//generate a random uppercase letter between A and E
char prefix = (char)(thing.nextInt(5) + 'A');

// generate a random number from 1 to 999 and format it with leading zeros

int number = thing.nextInt(999) + 1;
String suffix = String.format("%03d", number);

//Combine prefix and suffix to form the OrderID
orderIDs[i] = prefix + suffix;

 }
 // Print all generated  OrderIDs
 for (String orderID : orderIDs){
    System.out.println(orderID);
 }

}
   
}

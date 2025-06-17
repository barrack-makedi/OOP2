import java.util.*;
public class discount {
   public static void main(String[] args) {
    Random random = new Random();
    int daysUntilExpiration = random.nextInt(12) ; // Random number of days until expiration (1-30)
    int discountPercentage = 0;   

  if(daysUntilExpiration == 1)
    {
        discountPercentage = 20;
    }
   if(daysUntilExpiration <= 5)
    {
        discountPercentage = 10;
    }

    if(daysUntilExpiration < 1)
    {
        System.out.println("Your subscription has expired. No discount available.");
    }
    else if(daysUntilExpiration == 1)
    {
        System.out.println("Your subscription expires within a day. Renew now and save " + discountPercentage + "%!");
    }
    else if(daysUntilExpiration <= 5)
    {
        System.out.println("Your subscription expires in " + daysUntilExpiration + " days. Renew now and save " + discountPercentage + "%!");
    }
    else if (daysUntilExpiration <= 10)
    {
        System.out.println("Your subscription expires in: " + daysUntilExpiration + " days. Your subscription will expire soon. Renew now!");
    }
}
 
}

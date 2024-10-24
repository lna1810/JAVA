package javaprograms;

import java.util.*;

public class CreditsNotSufficientException extends Exception {



public CreditsNotSufficientException(String message) {



     super(message);  

 }



}



public class CreditsinsufficientException {





 public static void checkCredits(int credits) throws CreditsNotSufficientException {



     if (credits < 50) {



         throw new CreditsNotSufficientException("Credits are insufficient. You need at least 50 credits.");



     }



 }





 public static void performOperation(int credits) throws CreditsNotSufficientException {



     



     checkCredits(credits);



     



     



     System.out.println("Operation performed successfully with " + credits + " credits.");



 }







 public static void main(String[] args) {



	 Scanner scanner = new Scanner(System.in);



	 System.out.print("Enter your credits: ");



     int userCredits = scanner.nextInt(); 



   



     try {



         



         performOperation(userCredits);



     } catch (CreditsNotSufficientException e) {



         



         System.out.println(e.getMessage());  



     }



 }



}
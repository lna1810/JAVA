package javaProject;



import java.util.Scanner;



class PinMisMatchException extends Exception {

	    public PinMisMatchException(String message) {

	    super(message);

	    }}





public class ATM_PIN_Validator {

	    private static final int CORRECT_PIN = 1234;



	    public static void main(String[] args) {



	        Scanner scanner = new Scanner(System.in);



	        System.out.println("Enter Account Holder Name: ");



	        String accountHolderName = scanner.nextLine();



	        int attempts = 0;



	        boolean isPinValid = false;



	        while (attempts < 3) {



	            System.out.println("Enter PIN: ");



	            int enteredPin = scanner.nextInt();



	            if (enteredPin == CORRECT_PIN) {



	                isPinValid = true;



	                break;



	            } 



	            else {



	                attempts++;



	                System.out.println("Incorrect PIN. Attempt " + attempts + " of 3.");



	            }}







	        try {



	            if (!isPinValid) {



	                throw new PinMisMatchException("Sorry..Your Account Has been Locked");



	            } else {



	                System.out.println("Welcome, " + accountHolderName + "! Access Granted.");



	            }



	        }catch (PinMisMatchException e) {



	            System.out.println(e.getMessage());



	        } finally {



	            scanner.close();



	        }



	    }



	}


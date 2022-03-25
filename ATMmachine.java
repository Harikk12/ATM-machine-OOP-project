package oopProject;

import java.util.Scanner;
public class ATMmachine {
	Scanner in = new Scanner(System.in);
  
    public float balance = 0; // initial balance to 0 for everyone
    private int anotherTransaction;
    private int transaction;
  
    
    public int setat(int anotherTransaction) {
		return anotherTransaction;
	}
	public void getat(int anotherTransaction) {
		this.anotherTransaction = anotherTransaction;
	}
	
	public int sett(int transaction) {
		return transaction;
	}
	public void gett(int transaction) {
		this.transaction = transaction;
	}
	
	void transaction() {
        // here is where most of the work is
		System.out.println("                     ***********                           ");
		
		System.out.println("------------- WELCOME TO MEEZAN ATM MACHINE ---------------");
		
		System.out.println("                     ***********                           ");
		
	
		
        
        
		System.out.println("Please enter debit card number: ");
    	int card_number = in.nextInt();
    	
    	
    	System.out.println("Please enter pin-code: ");
    	int password = in.nextInt();
    	
    	//creating object of user class
        UserAccount u = new UserAccount();
        
        //calling the user class method
        System.out.println(u.askuser("hyderabad", "Ahmed"));
    	
		int choice;
        System.out.println("Please select an option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        choice = in .nextInt();
        switch (choice) {
            case 1:
            	
            	
                float amount;
                
                System.out.println("Please enter amount to withdraw: ");
                
                amount = in .nextFloat();
                if (amount > balance || amount == 0) {
                    System.out.println("You have insufficient funds\n\n");
                    anotherTransaction(); // ask if they want another transaction
                } else {
                    
                    // update balance
                    balance = balance - amount;
                    System.out.println("You have withdrawn: " + amount + " \n your new balance is: " + balance + "\n");
                    anotherTransaction();
                }
                break;
            case 2:
            	
            	
            	
                // option number 2 is depositing
                float deposit;
                System.out.println("Please enter amount to deposit: ");
                deposit = in .nextFloat();
                
                // update balance
                balance = deposit + balance;
                System.out.println("You have deposited: " + deposit + " \n Your new balance is " + balance + "\n");
                anotherTransaction();
                break;
                
            case 3:
                // this option is to check balance
                System.out.println("Your balance is: " + balance + "\n");
                anotherTransaction();
                break;
            default:
                System.out.println("Invalid option:\n\n");
                anotherTransaction();
                break;
        }
    }
     
     void anotherTransaction() {
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction.\npress 2 To exit");
        anotherTransaction = in .nextInt();
        if (anotherTransaction == 1) {
            transaction(); 
        } else if (anotherTransaction == 2) {
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}

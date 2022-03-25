package oopProject;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
     // call our transaction method here
        ATMmachine at = new ATMmachine();
        
        
        at.transaction();
       
        
    }

}

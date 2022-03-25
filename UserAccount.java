package oopProject;

public class UserAccount extends ATMmachine {               //inheritance apply here
	
	private int debit_card;          //encapsulation apply here
	private int atm_password;
	
	//creating setter getter 
	public int setpass(int atm_password) {
		return atm_password;
	}
	public void getpass(int atm_password) {
		this.atm_password = atm_password;
	}
	
	public int setcard(int debit_card) {
		return debit_card;
	}
	public void getcard(int debit_card) {
		this.debit_card = debit_card;
	}
	
	//creating methods
	public String askuser(String name) {                //polymorphasim apply
		System.out.println("welcome to user:");
		return name;
		
	}
	public String askuser(String address, String name) {
		System.out.println("welcome to user:");
		return "Name: "+ name +"\n"+ "Address: "+ address ;
		
	}
	
	
	
	
	
	

}

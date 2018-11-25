package BankManagement;

import java.util.Scanner;

public class Account {
	
	public Scanner scn = new Scanner(System.in);
	public String name = new String();
	public int acc_no;
	public String branch = new String();
	
	public int camount =0;
	
	int createAccount() {
	System.out.println("Enter your beautiful name: ");
	name=scn.nextLine(); 
	System.out.println("Enter your beautiful account number cause we don't provide it: ");
	acc_no = scn.nextInt(); 
	System.out.println("Enter your branch : ");
	branch = scn.next();
	return acc_no;
	}	
}

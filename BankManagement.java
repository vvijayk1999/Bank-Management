package BankManagement;

import java.util.Scanner;

public class BankManagement {
	
	static int i=0,g=0,h=0,k=0,id=0;
	static boolean x=true;
	static int IDs[] = new int[5];
	static int IDc[] = new int[5];
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Credit[] obj = new Credit[5];
		Savings[] obj1 = new Savings[5];
		
		while(i<5) {
			
		System.out.println("press 1 for savings account \npress 2 for credits account");
		int a=scn.nextInt();
		x=true;
		
		switch(a) {
		case 1 : 
				 while(x) {
					 
					 System.out.println("press 1 to create account \npress 2 for depositing \npress 3 for withdrawal \npress 4 for \"Minnie\" statement \npress 5 to return back to main menu");
					 int b=scn.nextInt();
				 
					 switch(b) {
				 		case 1 : g=i;
				 				 obj1[i] = new Savings();
				 				 IDs[g]=obj1[i].createAccount();
				 				 i++;break;
				 		case 2 : if(gatherSAccountInfo())
					      	 	obj1[g].deposit();break;
				 		case 3 : if(gatherSAccountInfo()) {
					 		 		obj1[g].interest();
					 		 		obj1[g].withdrawal();
				 				 }break;
				 		case 4 :  if(gatherSAccountInfo())
		 		  		  			obj1[g].display();break;
				 		case 5 : x=false;break;	 
				 		default : System.out.println("clearly you haven't been to school");
					 }
				}
				 break;
		case 2: 
			 	while(x) {
			 		
			 		System.out.println("\npress 1 to create account \npress 2 to credit money with the interest rate 8% \npress 3 for deposit \npress 4 for cash withradawal \npress 5 for \"Minnie\" statement \npress 6 to return back to main menu");
			 		int b=scn.nextInt();
			 		
			 		switch(b) {
			 			case 1 : h=k;
			 					 obj[k] = new Credit();
			 					 IDc[h]=obj[k].createAccount();
			 					 k++;break;
			 			case 2 : if(gatherCAccountInfo())
			 					 obj[h].add();break;
			 			case 3 : obj[h].interest();
			 					 if(gatherCAccountInfo())
			 						 obj[h].deposit();break;
			 			case 4 : if(gatherCAccountInfo())
			 						obj[h].withdrawal();break;
			 			case 5 : if(gatherCAccountInfo())
			 						obj[h].display();break;
			 			case 6 : x=false;break;	 
			 			default : System.out.println("clearly you haven't been to school");
			 		}
			 	}
			 break;
			
		default:  System.out.println("clearly you haven't been to school");
			
		}
		
	}
}
	
	static boolean gatherSAccountInfo() {
		System.out.println("Enter your Account ID");
        id = scn.nextInt();
        for(int j=0;j<5;j++) {
	       if(id==IDs[j])
	        {
	 	        g=j;
	 	        return true;
	        }
		}
	   System.out.println("Account not found");
        return false;
	
	
}
	static boolean gatherCAccountInfo() {
		System.out.println("Enter your Account ID");
        id = scn.nextInt();
        for(int j=0;j<5;j++) {
	       if(id==IDc[j])
	        {
	 	        h=j;
	 	        return true;
	        }
		}
	   System.out.println("Account not found");
        return false;
	
	
}
}


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


public class Credit extends Account {
	
	int amt,amnt,interest;
	void add(){
		System.out.println("enter the amount to be credited  : " );
		amnt=scn.nextInt();
		camount += amnt;
	}
	void deposit() {
		System.out.println("the interest amount to be deposited for the amount"+camount+"is "+interest);
		System.out.print("Enter the amount to be deposited : ");
		amt=scn.nextInt();
		System.out.println("the amount "+amt+" has been deposited you are due with "+((camount+interest)-amt));
		camount += amt;
	}
	void withdrawal() {
		System.out.print("Enter the amount to be withdrawn : ");
		amt=scn.nextInt();
		if(camount>=0 && amt<=camount) {
			camount -= amt;
			System.out.println("the amount "+amt+" has been withdrawn and balance is "+camount);
	}
	else System.out.println("KAAS ILLA MAMA !!!!!! you beggar");		
	}
	void display() {
		System.out.println("\nName : " + name);
		System.out.println("Account no : " + acc_no);
		System.out.println("Branch : " + branch);
		System.out.println("Your savings account balance is : " + camount);
		System.out.println("the interest accounts to " +interest+"\n");
	}
	void interest() {
	interest=((8*amnt)/100);	
	}
}



package BankManagement;

public class Savings extends Account{
	
	int amt;
	public int samount =0;
	void deposit() {
		System.out.print("Enter the amount to be deposited : ");
		amt=scn.nextInt();
		samount += amt;
		System.out.println("the amount "+amt+" has been deposited.");
	}
	 
	void withdrawal() {
		System.out.println("your balance is  : "+samount);
		System.out.print("Enter the amount to be withdrawn : ");
		amt=scn.nextInt();
		if(samount>=0 && amt<=samount) {
				samount -= amt;
				System.out.print("the amount "+amt+" has been withdrawn.");
		}
		else System.out.println("KAAS ILLA MAMA !!!!!! you beggar");
	}
	
	void interest() {
		samount=samount+((4*samount)/100);	
	}
	void display() {
		System.out.println("Name      					    : " + name);
		System.out.println("Account no 					    : " + acc_no);
		System.out.println("Branch      				    : " + branch);
		System.out.println("Your savings account balance is : " + samount);
		
	}
	

}

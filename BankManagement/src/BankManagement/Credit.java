package BankManagement;

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
		System.out.println("Name      					    : " + name);
		System.out.println("Account no 					    : " + acc_no);
		System.out.println("Branch      				    : " + branch);
		System.out.println("Your savings account balance is : " + camount);
		System.out.println("the interest accounts to " +interest);
	}
	void interest() {
	interest=((8*amnt)/100);	
	}
	

}

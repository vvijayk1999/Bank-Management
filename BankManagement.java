import java.util.Scanner;

public class BankManagement {
	
	static int i=0,g=0,h=0,k=0,id=0;
	static boolean x=true;
	static int IDs[] = new int[5];
	static int IDc[] = new int[5];
	static Scanner scn = new Scanner(System.in);
	
	
	public static void main(String[] args) throws InterruptedException {
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
		 		  		  			display(obj1[g].toString());break;
				 		case 5 : x=false;break;	 
				 		default : System.out.println("clearly you haven't been to school");
					 }
				}
				 break;
		case 2: 
			 	while(x) {
			 		
			 		System.out.println("press 1 to create account \npress 2 to credit money with the interest rate 8% \npress 3 for deposit \npress 4 for cash withradawal \npress 5 for \"Minnie\" statement \npress 6 to return back to main menu");
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
			 						display(obj[h].toString());break;
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
	static void display(String temp) {
		System.out.println(temp);
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
	int temp;
	int amt,required_amount,interest;
	void add(){
		System.out.println("enter the amount to be credited  : " );
		required_amount=scn.nextInt();
		camount += required_amount;
	}
	void deposit() {
		System.out.println("the interest amount to be deposited for the amount"+camount+"is "+interest);
		System.out.print("Enter the amount to be deposited : ");
		amt=scn.nextInt();
		System.out.println("the amount "+amt+" has been deposited you are due with "+((camount+interest)-amt));
		camount += amt;
		if(camount>=temp)
		{
			camount= camount -temp;
			System.out.println("You have succesfullly repayed your loan");
		}
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
	public String toString() {
     return "name="+name+"\n"+"Account no="+acc_no+"\n"+"Branch="+branch+"Balance="+camount;
	}
	void interest()  {
	temp=required_amount + ((8*required_amount)/100);	
	}
}


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
	public String toString() {
	     return "name="+name+"\n"+"Account no="+acc_no+"\n"+"Branch="+branch+"\n"+"Balance="+samount;
		}
	

}






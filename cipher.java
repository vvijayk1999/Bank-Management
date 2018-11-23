import java.util.Scanner;


public class Cipher {

	public static void main(String[] args) {

		System.out.println("Enter the String to be encrypted or decrypted :");
		Scanner scan = new Scanner(System.in);
		String arr = new String(); 
		arr=scan.nextLine();
		char[] a=arr.toCharArray();
		System.out.println("Press 1 to Encrypt \n Press 2 to Decrypt ");
		int choice=scan.nextInt();
		switch(choice) {
		case 1 : Encoding str = new Encoding();
				 str.encode(a);
				 break;
		case 2 : Decoding str2 = new Decoding();
				 str2.decode(a); 
				 break;
		default :System.out.println("Stop pannification");
		
		}
	}

}
public class Encoding {
	
	public  void encode(char a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			int ch = (int) a[i];
			if(ch>=65&&ch<=77)
		a[i]=(char) (ch+45);
		else
		if(ch>=78&&ch<=90)
			a[i]=(char) (ch+19);
		else
		if(ch>=97&&ch<=109)
			a[i]=(char) (ch-19);
		else
		if(ch>=110&&ch<=122)
		  a[i]=(char) (ch-45);
		}
		String temp = new String(a);
		System.out.println("the encoded string is : "+ temp);
		
	}

}
public class Decoding {

	public  void decode(char a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			int ch = (int) a[i];
			if(ch>=110&&ch<=122)
			  a[i]=(char)(ch-45);
			else
			if(ch>=97&&ch<109)
				a[i]=(char)(ch-19);
			else
			if(ch>=78&&ch<=90)
				a[i]=(char)(ch+19);
			else
			if(ch>=65&&ch<=77)
			  a[i]=(char)(ch+45);
	
		}
		String temp = new String(a);
		System.out.println("the decoded string is : "+ temp);
		
	}

}


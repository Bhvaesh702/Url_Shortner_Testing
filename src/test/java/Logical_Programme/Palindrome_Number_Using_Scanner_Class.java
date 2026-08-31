package Logical_Programme;


public class Palindrome_Number_Using_Scanner_Class {

	public static void main(String[] args) {

		
		int Num=121212;
		int OrgNum=Num;
		int rev=0;
		while(Num!=0)
		{
		rev= rev *10+ Num%10;
		Num=Num/10;

		}
		if(OrgNum==rev)
		{
		System.out.println("This is Palindrome Number: "+ OrgNum);
		}
		else{
		System.out.println("This is NOT Palindrome Number: "+ OrgNum);
		}
	
	
	
	
	
	
	}
	}
	

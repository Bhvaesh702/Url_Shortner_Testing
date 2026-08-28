package Java_Programming;




public class Practise {

	public static void main(String[] args) 
	{

		String str= "Bhavesh";

int Upper=0;
  int Lower=0;
  
  int Len=str.length();
  
  for(int i=0;i<Len;i++) 
  {
	  char ch=str.charAt(i);
	  if(ch>=65 && ch<=90)
	  {
		  Upper++;
	  }
	  else
	  {
		  Lower++;
	  }
	  
	  
  }
  System.out.println(Upper);
  System.out.println(Lower);



	}

}

package Logical_Programme;

public class Reverse_String_Character_Of_Sentence {

	public static void main(String[] args) {
		String str="I am working Right Now";
		int Len=str.length();
        String rev="";
        for(int i=Len-1;i>=0;i--)
        {
        	
      rev= rev+ str.charAt(i);

}
      System.out.println(rev);  
	
	}}

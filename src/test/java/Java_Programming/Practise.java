package Java_Programming;

import java.util.HashMap;
import java.util.Map;

public class Practise {

	public static void main(String[] args) 
	{

	
	String str= "Hii im Bhavesh Mandlik";
	char[] ch=str.toCharArray();	
	Map<Character,Integer> DuplicateChar= new HashMap<>();
	for(char Keys:ch)
	{
		if(Character.isAlphabetic(Keys))
		{
			if(DuplicateChar.containsKey(Keys))
			{
				DuplicateChar.put(Keys, DuplicateChar.get(Keys)+1);
				
			}
			else {
				
				DuplicateChar.put(Keys, 1);
			}
		}
		
	}
	DuplicateChar.entrySet().removeIf(i -> i.getValue()==1);
	System.out.println(DuplicateChar);
	
	
	
	
	}
	}



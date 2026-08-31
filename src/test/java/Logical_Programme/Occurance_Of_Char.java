package Logical_Programme;

import java.util.HashMap;
import java.util.Map;

public class Occurance_Of_Char {

	public static void main(String[] args) {
		String str= " Hii This is Sparta";
		char[] ch=str.toCharArray();	
		Map<Character,Integer> DuplicateChar= new HashMap<>();
		for(char Key:ch)
		{
			if(Character.isAlphabetic(Key)) {  /// To remove the spaces Count
			if(DuplicateChar.containsKey(Key))
			{
				
				DuplicateChar.put(Key, DuplicateChar.get(Key)+1);
			}
			else {
				
				DuplicateChar.put(Key,1);
			}
			
		}}
		DuplicateChar.entrySet().removeIf(i -> i.getValue()==1);  /// to remove the count of char which is 1
		System.out.println(DuplicateChar);

	}

}

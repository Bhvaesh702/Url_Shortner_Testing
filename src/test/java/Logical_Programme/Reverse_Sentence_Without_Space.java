package Logical_Programme;

public class Reverse_Sentence_Without_Space {

	public static void main(String[] args) {
		String str= "Im Working in Infosys";
		String [] words= str.split(" ");
		for (int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+ " ");
			
		}
	}

}

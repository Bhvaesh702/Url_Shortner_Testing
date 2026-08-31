package Logical_Programme;

public class StringDemo {


	/*
	 * String is Non Primitive Data Type Whose value is not Fixed.
	 * String is Sequence of Character ( Array of Character)
	 * String Objects are Immutable
	 * Parent class is Object
	 * There are Three classed of String- String, String Builder and StringBuffer
	 * 
	 */
	public static void main(String[] args) {
		// What is Difference Between String S1= new String() and String S2="Bhavesh";?

		String S1= new String("Pune");
		// ==> When Object created this way this Object create two memory in Heap Area and String Constant pool area
		//==> One Object created for future reference means it creates two memory allocation. it make execution slow and
		// ==> Occupy more memory

		System.out.println(S1);
		String S2="Bhavesh";
		String S3= "Bhavesh";
		//==>S2 and S3 Point to the same object creates One memory under SCP. it occupies low space. 

//============================================================================================================================================================================
		// Why String Object are immutable?
		String S= new String("Mumbai");
		S.concat("Java");
		System.out.println(S);
		//==> Here if we try to change previous Object value then it will not change O/p will be Mumbai Java
		S.concat("Python");
		System.out.println(S);
		/*==> Here if we try to change previous Object value then it will not change O/p will be Mumbai Python.
		 String Objects are immutable means we cannot change the value of Object.
		 because one Object shared with multiple value if we try to change it then there will be conflict thats why objects are immutable.
		 */ 
//============================================================================================================================================================================
		// Why String Final in Java?
		/*==> Final is keyword it used upon class, Method and variable. Like final class Demo, final void Test();, final int a;
		==> When class is final we cannot extend it.if method is final we cannot do overriding.
		==> Reason for making Sting as final class in java because of- Synchronization, immutability, concatination, Security,Memory Management.
		==> also it prevent the breaking assumption of other classes
	
		For Example: If we do String class as Final class*/ 
	    final String S5= new String("Test");
	  S5.concat("Testing");
	    System.out.println(S5);// O/P= Test
		   String S6 = S5.concat("Testing");
		   System.out.println(S6);// With ref Variable we can change it O/P= TestTesting.
 //===========================================================================================================================================================================
		    
        // Difference Between == and equal();
	    //==> (==) Operator is used to reference comparison, it checks whether Object is pointing to same memory location or not where equal() is used to content Comparison
		//==> For Example
		   String S7= new String("A");
		   String S8= new String("A");
		   String S9= new String("C");
		   String S10= new String("D");
		   String S11= "Bhavesh";
		   String S12= "Bhavesh";
		   System.out.println(S7==S8); // O/P=> false ( Check both Object point to same Location or not)
		   System.out.println(S11==S12); // O/P=> true ( Check both Object point to same Location or not)
		   System.out.println(S7.equals(S8));// O/P=> true ( Check Content Comparison)
		   System.out.println(S7.equals(S9));// O/P=> false ( Check Content Comparison)
//==============================================================================================================================================================================
		
		// Methods of String Class
		   /*
		    * equals();
		    * equalIngonreCase();
		    * trim();
		    * length();
		    * compareTo();
		    * compareToIgnoreCase();
		    * concat();
		    * isEmpty();
		    */	
	
	
	
	
	
	
	}

}

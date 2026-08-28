package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo 
{

	public static void main(String[] args) {
		/*Duplicated are allowed
		 * Allowed n Numbers of null Values
		 * Storage Type is Index
		 * Order of Insertion is Maintained
		 * Data Structure is Resizable
		 * Storage Capacity = Current Capacity *3/2+1
		 * Best Choice- Retrival Operation
		 */
		ArrayList al= new ArrayList();
		al.add("BHAVESH");
		al.add("Pune");
		al.add("Maharashtra");
		al.add('A');
		al.add(0.90f);
		al.add(86);
		al.add(null);
		System.out.println("==========PRINTING ARRAY LIST=========");
		System.out.println("ArrayList Before Right Shift: " + al);
		al.add(4,"RAMESH");
		System.out.println("==========Right Shift Operation=======");
		System.out.println("ArrayList After Right Shift: " + al);
		al.remove(4);
		System.out.println("==========Left Shift Operation=======");
		System.out.println("ArrayList After Left Shift: " + al);

		System.out.println("======================================");
		//Retrival Operation Using Iterator 
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println("ArrayList using Iterator : " +itr.next());
		}
		//Retrival Operation Using List Iterator
		System.out.println("======================================");
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println("ArrayList using List Iterator :"+ li.next() );
		}
		System.out.println("======================================");
		//Retrival Operation Using ForEach loop
		 for(Object data:al)
		 {
			 System.out.println(data);
		 }
	}

}

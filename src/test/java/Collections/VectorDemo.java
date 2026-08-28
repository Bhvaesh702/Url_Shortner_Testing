package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		/*
		 * Duplicated are allowed
		 * Allowed N Numbers of null value
		 * Storage Type is index
		 * Order of Insertion is Maintained.
		 * Capacity = Current capacity *2
		 * Data Structure is  Doubly
		 * Best Choice- Retrival Operation
		 *  we can iterate the groups of object by using Enumerator
		 */

		Vector v= new Vector();
		v.add("BHAVESH");
		v.add("Pune");
		v.add("Maharashtra");
		v.add('A');
		v.add(0.90f);
		v.add(86);
		v.add(null);
		System.out.println("==========PRINTING Vector=========");
		System.out.println("Vector Before Right Shift: " + v);
		v.add(4,"RAMESH");
		System.out.println("==========Right Shift Operation=======");
		System.out.println("Vector After Right Shift: " + v);
		v.remove(4);
		System.out.println("==========Left Shift Operation=======");
		System.out.println("Vector After Left Shift: " +v);
		System.out.println("======================================");
		
		//Retrival Operation Using Iterator
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println("Vector using Iterator : " +itr.next());
		}
		//Retrival Operation Using List Iterator 
		System.out.println("======================================");
		ListIterator li = v.listIterator();
		while(li.hasNext())
		{

			System.out.println("Vector using List Iterator :"+ li.next() );
		}
		System.out.println("======================================");
		//Retrival Operation Using Enumerator 

		Enumeration  enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println("Vector using Enumerator  :"+ enu.nextElement() );
		}





	}

}

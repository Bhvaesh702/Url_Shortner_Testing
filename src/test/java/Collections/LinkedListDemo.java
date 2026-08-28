package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add("BHAVESH");
		ll.add("Pune");
		ll.add("Maharashtra");
		ll.add('A');
		ll.add(0.90f);
		ll.add(86);
		ll.add(null);
		System.out.println("==========PRINTING LinkedList =========");
		System.out.println("LinkedList Before Right Shift: " + ll);
		ll.add(4,"RAMESH");
		System.out.println("==========Right Shift Operation=======");
		System.out.println("LinkedList After Right Shift: " + ll);
		ll.remove(4);
		System.out.println("==========Left Shift Operation=======");
		System.out.println("LinkedList After Left Shift: " + ll);

		System.out.println("======================================");
		//Retrival Operation Using Iterator 
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println("LinkedList using Iterator : " +itr.next());
		}
		//Retrival Operation Using List Iterator
		System.out.println("======================================");
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println("LinkedList using List Iterator :"+ li.next() );
		}
		System.out.println("======================================");
		//Retrival Operation Using ForEach loop
		 for(Object data:ll)
		 {
			 System.out.println(data);
		 }

	}

}

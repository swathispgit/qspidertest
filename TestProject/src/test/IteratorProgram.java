package test;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorProgram {

	
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		a.add(20);
		a.add(10);
		a.add(30);
	
		
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(itr.hasPrevious())
		{
			System.out.println(itr.Previous());
		}

	}

}

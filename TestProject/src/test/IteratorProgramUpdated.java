package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorProgramUpdated{

	
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		a.add(20);
		a.add(10);
		a.add(30);
	
		ListIterator ltr=a.listIterator();
		
		while(ltr.hasNext())
		{
			ltr.next();
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}

	}

}

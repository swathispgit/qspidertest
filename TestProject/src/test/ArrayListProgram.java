package test;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(100);
		a.add("Tiya");
	
		System.out.println("Array list elements are shown");
	for(Object o:a)
	{
		
		System.out.println(o + "\n");
	}
	System.out.println("the size of the arraylist is: "+ a.size());
	System.out.println("Index of 0th number is:" +a.get(0));
	
          a.set(1, 10);
	System.out.println(a);
	
	System.out.println(a.contains("Tiya"));
	System.out.println(a.contains("Tiyaaa"));
	
	a.remove("Tiya");
	System.out.println(a);
	
	System.out.println(a.isEmpty());
	
	a.clear();
	System.out.println(a.isEmpty());
	
	}
}

package test;

import java.util.ArrayList;

public class collectionMethod {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(89.99);
		al.add("ganesha");
		al.add(89);
		al.add(99);
		al.add("sheela");
		System.out.println(al);
		
		al.add(2, "Gowri");
		System.out.println(al);
		
		ArrayList a= new ArrayList();
		
		a.add("laxmi");
		a.add('D');
		a.add(90);
		a.add("ranga");
		a.add('K');
		
		System.out.println(a);
		
		a.addAll(al);
		System.out.println(a);
		
		System.out.println(a.containsAll(al));
		System.out.println(al.containsAll(a));
		
		System.out.println(a.removeAll(al));
		System.out.println(a);
		System.out.println(al);
		
		
		
		
		

	}

}

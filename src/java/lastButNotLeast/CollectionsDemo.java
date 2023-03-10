package java.lastButNotLeast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayList();
		linkedList();
		stack();
		hashSet();
		linkedHashSet();
		treeSet();
		hashMap();
		treeMap();
	}

	static void arrayList()
	{
		try
		{
			System.out.println("****ArrayList Program****");
			ArrayList<String> a = new ArrayList<String>();
			
			a.add("apple");
			a.add("banana");
			a.add("orange");
			a.add("mango");
			a.add("grapes");
			
			System.out.println(a);
			/*
			 * for(int i=0;i<a.size();i++) { System.out.println(a.get(i)); }
			 * System.out.println();
			 */
			
			a.add("pineapple");
			
			System.out.println(a);
			a.add(4 , "");
			a.add(0,"apple");
			a.add(7,"banana");
			System.out.println(a);
			a.remove(2);
			System.out.println(a);
			a.remove("orange");
			System.out.println(a);
			
			Iterator<String> ite= a.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
			a.removeAll(a);
			System.out.println(a);
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void linkedList()
	{
		try
		{
			System.out.println("****LinkedList Program****");
			LinkedList<Integer> l =new LinkedList<Integer>();
			l.add(100);
			l.add(200);
			l.add(0, 300);
			System.out.println(l);
			
			l.remove();
			System.out.println(l); 
			l.add(400);
			l.add(500);
			System.out.println(l);
			l.remove(2);
			System.out.println(l);
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void stack()
	{
		try
		{
			System.out.println("****Stack Program****");
			Stack<Integer> s=new Stack<Integer>();
			s.push(100);
			s.push(200);
			s.push(300);
			s.push(400);
			System.out.println(s);
			s.pop();
			System.out.println(s);
			System.out.println("*****************************************************");  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void hashSet()
	{
		try
		{
			System.out.println("****HashSet Program****");
			HashSet<Integer> h=new HashSet<Integer>();
			h.add(20);
			h.add(10);
			h.add(30);
			h.add(40);
			h.add(50);
			h.add(60);
			h.add(50);
			h.add(60);
			System.out.println(h);
			
			h.remove(20);
			System.out.println(h);
			Iterator<Integer> ite= h.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
			
			h.removeAll(h);
			System.out.println(h);
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void linkedHashSet()
	{
		try
		{
			System.out.println("****LinkedHashSet Program****");
			LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
			h.add(20);
			h.add(10);
			h.add(30);
			h.add(40);
			h.add(50);
			h.add(60);
			h.add(50);
			h.add(60);
			System.out.println(h);
			
			h.remove(20);
			System.out.println(h);
			Iterator<Integer> ite= h.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
			
			h.removeAll(h);
			System.out.println(h);
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void treeSet()
	{
		try
		{
			System.out.println("****TreeSet Program****");
			TreeSet<Integer> h=new TreeSet<Integer>();
			h.add(20);
			h.add(10);
			h.add(30);
			h.add(40);
			h.add(50);
			h.add(60);
			h.add(50);
			h.add(60);
			System.out.println(h);
			
			h.remove(20);
			System.out.println(h);
			Iterator<Integer> ite= h.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
			
			h.removeAll(h);
			System.out.println(h);
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void hashMap()
	{
		try
		{
			System.out.println("****HashMap Program****");
			HashMap<Integer,String> h=new HashMap<Integer,String>();
			h.put(10, "10 is a Black color code");
			h.put(20, "20 is a Red color code");
			h.put(30, "30 is a Blue color code");
			h.put(40, "40 is a Brown color code");
			
			h.forEach((k,v)-> System.out.println(k+" and "+v));
			System.out.println(  );
			
			h.remove(20);
			
			h.forEach((k,v)-> System.out.println(k+" and "+v));
			
			h.clear();
			System.out.println(h);
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void treeMap()
	{
		try
		{
			System.out.println("****TreeMap Program****");
			TreeMap<Integer, String> t=new TreeMap<Integer,String>();
			t.put(10, "10 is Red color");
			t.put(20, "20 is a Green color");
			t.put(30, "30 is a Black color");
			t.forEach((k,v)-> System.out.println("Key is : "+k+", Value is : "+v));
			System.out.println();
			Set<?> st=t.entrySet();
			Iterator<?> ite=st.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
			System.out.println("*****************************************************");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

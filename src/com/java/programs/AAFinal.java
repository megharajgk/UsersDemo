package com.java.programs;

import java.util.Arrays;

public class AAFinal {

	
	public static void main(String[] args) 
	{
		String s="Java is a Programming language";
		
		alternativeCaps(s);
		everyWordCaps(s);
		anagramString();
		armgstrongNumber();
		automorphicNumber();
		binarySearch();
		bubbleSort();
		compare2Arrays();
		convertLowerToUpperViceversa();
	}
	public static void alternativeCaps(String s)
	{
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i+=2)
		{
			ch[i]=Character.toUpperCase(ch[i]);
		}
		String str=new String(ch);
		System.out.println(str);
		System.out.println("Display Alternate capital letters");
	}
	
	public static void everyWordCaps(String s)
	{
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]==' ')&&(ch[i+1]!=' '))
			{
				ch[0]=Character.toUpperCase(ch[0]);
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		String str=new String(ch);
		System.out.println(str);
	}
	
	public static void anagramString()
	{
		String s1="listen";
		String s2="silent";
		
		if(s1.length()==s2.length())
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			String str1=new String(ch1);
			String str2=new String(ch2);
			
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println(s1+" and "+s2+" are Anagram strings" );
			}
			else
			{
				System.out.println(s1+" and "+s2+" are NOT anagram strings" );
			}
		}
		else
		{
			System.out.println(s1+" and "+s2+" are NOT anagram strings" );
		}
	}
	
	public static void armgstrongNumber()
	{
		int num=153;
		int sameNum=num;
		int armNum=0;
		int dupliNum=num;
		int rem=0;
		int count=0;
		
		while(sameNum>0)
		{
			sameNum=sameNum/10;
			count++;
		}
		
		while(dupliNum>0)
		{
			rem=dupliNum%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			armNum=armNum+mul;
			dupliNum=dupliNum/10;
		}
		if(num==armNum) {
			System.out.println(num+" is Armstrong number");
		}
		else {
			System.out.println(num+" is NOT Armstrong number");
		}
	}
	
	public static void automorphicNumber()
	{
		int num=76;
		int square=num*num;
		int rem=0;
		int rev=0;
		int rev1=0;
		int count=0;
		int sameNum=num;
		
		while(sameNum>0)
		{
			sameNum=sameNum/10;
			count++;
		}

		for(int i=0;i<count;i++)
		{
			rem=square%10;
			rev=rev*10+rem;
			square=square/10;
		}
		
		while(rev>0)
		{
			int rem1=rev%10;
			rev1=rev1*10+rem1;
			rev=rev/10;
		}
		
		if(num==rev1)
		{
			System.out.println(num+" is Automorphic number");
		}
		else
		{
			System.out.println(num+" is NOT Automorphic number");
		}
	}
	public static void binarySearch()
	{
		int a[]= {90,10,30,40,80,20,60,50,70};
		int key=80;
		
		int li=0;
		int mi;
		int hi=a.length-1;
		Arrays.sort(a);
		if(li>hi) {
			System.out.println("Element not found !!!");
		}
		while(li<=hi)
		{
			mi=(li+hi)/2;
			if(a[mi]==key)
			{
				System.out.println(key+" found at "+mi+"th index");
				break;
			}
			else if(a[mi]<key)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
		}
	}
	
	public static void bubbleSort()
	{
		int a[]= {90,50,10,40,60,30,20,70,80};
		int len=a.length-1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void compare2Arrays()
	{
		int a[]= {50,60,20,10,30,40};
		int b[]= {50,60,20,10,30,40};
		
		if((Arrays.equals(a, b))==true)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
		
		// OR
		
		boolean res=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					res=false;
				}
			}
		}
		else
		{
			System.out.println("Not same");
		}
		
		if(res==true)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
	}
	
	public static void convertLowerToUpperViceversa()
	{
		String s="this IS a jAVA pROGRAM";
		String temp="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				temp=temp+(char)(s.charAt(i)+32);
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				temp=temp+(char)(s.charAt(i)-32);
			}
			else
			{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);
	}

}

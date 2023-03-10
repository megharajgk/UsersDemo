package com.java.programs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class AllInOneJava {

	public static void main(String[] args) {
			
//		alternateCaps();
//		everyWordCaps();
//		wordCount();
//		anagramStrings();
//		armstrongNumber();
//		vowelAndConsonants();
//		automorphicNumber();
//		binaraySearch();
//		bubbleSort();
//		compare2Arrays();
//		convertLowerToUpperAndViceversa();
//		countCharsAndDigits();
//		dateDemo();
//		removeDupliChars();
//		extractEvenAndOddFromArray();
//		extractCharsAndDigitsFromString();
//		factorialNumber();
//		fibonacciNumber();
//		findDupliElementInArray();
//		findDupliElementInStringArray();
//		randomEmails();
//		randomNumber();
		largestNumber();
		
	}
	
	public static void alternateCaps()
	{	
		String s="Get a Job as soon as Possible!!!!!";
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i+=2)
		{
			ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}
	
	public static void everyWordCaps()
	{
		String s="Get a Job as soon as Possible!!!!!";
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]==' ')&&(ch[0]!=' '))
			{
				ch[0]=Character.toUpperCase(ch[0]);
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		System.out.println(new String(ch));
	}
	
	public static void wordCount()
	{
		String s="Get a Job as soon as Possible!!!!!";
		String str[]=s.split(" ");
		System.out.println("No. of words in a string is : "+str.length);
	}
	
	public static void anagramStrings()
	{
		String s1="silent";
		String s2="listen";
		
		if(s1.length()==s2.length())
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			String str1=new String(ch1);
			String str2=new String(ch2);
			
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println(s1+" and "+s2+" are Anagram strings");
			}
			else
			{
				System.out.println(s1+" and "+s2+" are Not Anagram strings");
			}
		}
		else
		{
			System.out.println(s1+" and "+s2+" are Not Anagram strings");
		}	
	}
	
	public static void armstrongNumber()
	{
		int num=153; // 370, 371, 407, 1634
		int sameNum=num;
		int dupliNum=num;
		int rem=0;
		int armNum=0;
		int count=0;
		
		// Number of digits
		while(sameNum>0)
		{
			sameNum=sameNum/10;
			count++;
		}
		while(dupliNum>0)
		{
			rem=dupliNum%10;
			int mul=1;
			for(int i=0;i<count;i++)
			{
				mul=mul*rem;
			}
			armNum=armNum+mul;
			dupliNum=dupliNum/10;
		}
		if(num==armNum)
		{
			System.out.println(num+" is a Armstrong number");
			
		}
		else
		{
			System.out.println(num+" is a Not Armstrong number");

		}
	}

	public static boolean isVowel(char ch)
	{
		ch=Character.toUpperCase(ch);
		return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' );
	}
	public static void vowelAndConsonants()
	{	
		String s="Virat      Kholi";
		System.out.println(s);
		s=s.replaceAll("\\s", "");
		System.out.println(s);
		int vowelCount=0;
		int consonantCount=0;
		List<Character> vowels= new ArrayList<Character>();
		List <Character>consonants = new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			if(isVowel(s.charAt(i)))
			{
				vowels.add(s.charAt(i));
				vowelCount++;
			}
			else
			{
				consonants.add(s.charAt(i));
				consonantCount++;
			}	
		}
		System.out.println("No of Vowels : "+vowelCount);
		System.out.println("No of Consonants : "+consonantCount);
		System.out.println("Vowels in a string are : "+vowels);
		System.out.println("Consonants in a String are : "+consonants);
	}
	
	public static void automorphicNumber()
	{
		int num=76;
		int dupliNum=num;
		int square=num*num;
		int count=0;
		int rem=0;
		int rem1=0;
		int rev=0;
		int rev1=0;
		
		while(dupliNum>0)
		{
			dupliNum=dupliNum/10;
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
			rem1=rev%10;
			rev1=rev1*10+rem1;
			rev=rev/10;
		}
		
		if(num==rev1)
		{
			System.out.println(num+" is an Automorphic number");
		}
		else
		{
			System.out.println(num+" is Not Automorphic number");
		}	
	}
	
	public static void binaraySearch()
	{
		int a[]= {10,90,20,80,50,40};
		int key=80;
		System.out.println("Given array is : ");
		for(int kk:a)
		{
			System.out.print(kk+" ");
		}
		System.out.println();
		System.out.println();
		Arrays.sort(a);
		System.out.println("After sorting array is : ");
		for(int kk:a)
		{
			System.out.print(kk+" ");
		}
		System.out.println();
		
		int li=0;
		int hi=a.length-1;
		int mi=0;
		
		if(li>hi)
		{
			System.out.println(key+" not found");
		}
		
		while(li<=hi)
		{
			mi=(li+hi)/2;
			if(a[mi]==key)
			{
				System.out.println(key+" found at "+mi+"th position");
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
		int a[]= {90,10,80,50,20,30,40};
		System.out.println("Before sort : "+Arrays.toString(a));
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
		System.out.println("After sort : "+Arrays.toString(a));
	}

	public static void compare2Arrays()
	{
		int a[]= {10,20,50,30,40,60,80,70};
		int b[]= {10,20,50,30,40,60,80,70};
		int c[]= {10,20,50,30,40,60,80,80};
		
		// approach-1
		if(Arrays.equals(a, b)==true)
		{
			System.out.println("Both arrays a & b are equal");
		}
		else
		{
			System.out.println("Both arrays a & b are not equal");
		}
		
		if(Arrays.equals(a, c)==true)
		{
			System.out.println("Both arrays a & c are equal");
		}
		else
		{
			System.out.println("Both arrays a & c are not equal");
		}
		
		// approach-2
		
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
			res=false;
		}
		if(res==true)
		{
			System.out.println("Both arrays a & b are equal");
		}
		else
		{
			System.out.println("Both arrays a & b are not equal");
		
		}
	}
	
	public static void convertLowerToUpperAndViceversa()
	{
		String s="JAVA is A PRogrAMMINg LaNGuage 12345 @#$%";
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65)&&(s.charAt(i)<=90))
			{
				temp=temp+(char)(s.charAt(i)+32);
			}
			else if((s.charAt(i)>=97)&&(s.charAt(i)<=122))
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
	
	public static void countCharsAndDigits()
	{
		String s="Jav12a i12s 23a34 la345ng67uag123e  !@#$";
		int charCount=0;
		int digitCount=0;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))==true)
			{
				digitCount++;
				temp=temp+s.charAt(i);
			}
			else
			{
				if(s.charAt(i)!=' ')
				{
					charCount++;
					System.out.print(s.charAt(i));
				}
			}
		}
		System.out.println();
		System.out.println(temp);
		System.out.println("Characters count is : "+charCount);
		System.out.println("Digits count is : "+digitCount);
	}
	
	public static void dateDemo()
	{
		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String date=sdf.format(d);
		System.out.println(date);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		String time=sdf1.format(d);
		System.out.println(time);
	}
	
	public static void removeDupliChars()
	{
		String s="Java is a Programming Language";
		System.out.println(s);
		s.chars().distinct().forEach(kk->System.out.print((char)kk));
	}
	
	public static void extractEvenAndOddFromArray()
	{
		int a[]= {1,2,4,6,3,5,7,8,9,10,11,14,13,12,15};
		System.out.println("Given array is : "+Arrays.toString(a));
		
		System.out.println("Even number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd number : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void extractCharsAndDigitsFromString()
	{
		String s="ASd456qwert123!@#$%sdfg23A!@#ERdfg";
		String temp=s;
		
		// To extract chars
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
		// To extract digits
		temp=temp.replaceAll("[^0-9]", "");
		System.out.println(temp);
	}
	
	public static void factorialNumber()
	{
		int n=5;
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void fibonacciNumber()
	{
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=10;i++)
		{
			int t=f+s;
			f=s;
			s=t;
			System.out.println(s);
		}
	}
	
	public static void findDupliElementInArray()
	{
		int a[]= {10,20,10,40,50,30,40,20};
		int count=0;
		System.out.println("Duplicate elements are : ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length-1;j++)
			{
				if(a[i]==a[j+1])
				{
					count++;
					System.out.println(a[i]);
				}
			}
		}
		if(count==0)
		{
			System.out.println("Duplicate not found !!!!");
		}
	}
	
	public static void findDupliElementInStringArray()
	{
		String s[]= {"core","java","core","selenium","manual","api","java"};
		int len=s.length-1;
		int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(s[i]==s[j+1])
				{
					count++;
					System.out.println("Duplicate element is : "+s[i]);
				}
			}
		}
		
		if(count==0)
		{
			System.out.println("No duplicate records found !!!!");
		}
	}
	
	public static void randomEmails()
	{
		Random r=new Random();
		int n=r.nextInt(100);
		
		String s=RandomStringUtils.randomAlphabetic(10);
		String email=s+n+"@gmail.com";
		System.out.println(email);
		
		// email in lower case
		System.out.println(email.toLowerCase());
	}
	
	public static void randomNumber()
	{
		Random r=new Random();
		
		// for int we have to provide the range
		int n=r.nextInt(100);
		System.out.println(n);
		
		// always range is from 0.1 to 0.9
		float f=r.nextFloat();
		System.out.println(f);
	}
	
	public static void largestNumber()
	{
		int a=100;
		int b=101;
		int c=20;
		
		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		System.out.println(largest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
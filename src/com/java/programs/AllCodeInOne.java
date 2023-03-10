package com.java.programs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;

public class AllCodeInOne {

	public static void main(String[] args) {
		alternateCaps();
		everyWordCaps();
		anagramStrings();
		armstrongNumber();
		// atmCode();
		automorphicNumber();
		binarySearch();
		bubbleSort();
		compare2Arrays();
		convertLowerToUpperAndViceversa();
		countCharsAndDigits();
		dateDemo();
		removeDuplicateChars();
		evenAndOddFromArray();
		extractNumberAndString();
		factorialNumber();
		fibonacciNumber();
		findDuplicateElementsInArray();
		findDuplicateElementsInString();
		generateRandomEmails();
		generateRandomNumber();
		largestNumber();
		leapYear();
		linearSearch();
		maxAndMinElementInArray();
		missingNumber();
		noOfEvenAndOddDigits();
		palindromeNumber();
		palindromeString();
		perfectNumber();
		getPrime();
		asciiValue();
		// getASCII();
		removeDuplicateInt();
		removeDupliString();
		removeExtraSpace();
		removeJunkChars();
		removeWhiteSpaces();
		reverseNumber();
		reverseString();
		rotateArrayLeft();
		sortInBuilt();
		squareRoot();
		sumOfArrayValues();
		sumOfDigits();
		swapDigit();
		swapString();
		wordCount();
		duplicateCharsAndCountOfChars1();
		convert1DInto2D();
		convert2DInto1D();
		working();

	}

	public static void alternateCaps() {
		System.out.println("**Alternate Capital Letters**");
		String s = "Java Is a Programming Language";
		System.out.println("Given String is : " + s);

		s = s.toLowerCase();
		System.out.println("Given String in Lowercase is :" + s);

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i += 2) {
			ch[i] = Character.toUpperCase(ch[i]);
		}

		String str = new String(ch);
		System.out.println("Altenate Capital Letter String is : " + str);

		System.out.println("********************************************");
	}

	public static void everyWordCaps() {
		System.out.println("**Every Word Capital Letter**");
		String s = "Java Is a programming language";
		System.out.println("Given String is : " + s);

		s = s.toLowerCase();
		System.out.println("Given String in Lowercase is :" + s);

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] == ' ') && (ch[i + 1] != ' ')) {
				ch[0] = Character.toUpperCase(ch[0]);
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
			}
		}

		String str = new String(ch);
		System.out.println("Every Word Capital Letter String is : " + str);
		System.out.println("********************************************");
	}

	public static void anagramStrings() {
		System.out.println("**Anagram Strings**");

		String s1 = "silent";
		String s2 = "listen";

		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			Arrays.sort(ch1);

			char ch2[] = s2.toCharArray();
			Arrays.sort(ch2);

			String str1 = Arrays.toString(ch1);
			String str2 = Arrays.toString(ch2);

			if (str1.equalsIgnoreCase(str2)) {
				System.out.println("'" + s1 + "' and '" + s2 + "' are Anagram Strings");
			} else {
				System.out.println("'" + s1 + "' and '" + s2 + "' are Not Anagram Strings");
			}
		} else {
			System.out.println("'" + s1 + "' and '" + s2 + "' are Not Anagram Strings");
		}
		System.out.println("********************************************");
	}

	public static void armstrongNumber() {
		System.out.println("**Armstrong Number**");

		int num = 153;

		int sameNum = num;
		int dupliNum = num;
		int count = 0;
		int armNum = 0;
		int rem = 0;

		while (sameNum > 0) {
			sameNum = sameNum / 10;
			count++;
		}

		while (dupliNum > 0) {
			rem = dupliNum % 10;

			int mul = 1;
			for (int i = 0; i < count; i++) {
				mul = mul * rem;
			}
			armNum = armNum + mul;
			dupliNum = dupliNum / 10;
		}
		if (num == armNum) {
			System.out.println(num + " is Armstrong number");
		} else {
			System.out.println(num + " is Not Armstrong number");
		}
		System.out.println("********************************************");
	}

	public static void atmCode() {
		System.out.println("**ATM Program**");

		System.out.println("Welcome To Bank ATM");

		Scanner scn = new Scanner(System.in);

		int balance = 100000;

		System.out.println("Press 1 : To Check Account Balance");
		System.out.println("Press 2 : To Deposite Amount");
		System.out.println("Press 3 : To Withdraw Amount");
		System.out.println("Press 4 : To Exit");

		int n = scn.nextInt();

		if (n > 4) {
			System.out.println("Please enter valid number");
		} else {
			switch (n) {
			case 1:
				System.out.println("Account Balance is : " + balance);
				break;

			case 2:
				System.out.println("Enter the amount to be deposite");
				int deposite = scn.nextInt();
				balance = balance + deposite;
				System.out.println("Account Balance is : " + balance);

				break;

			case 3:
				System.out.println("Enter the amount to be withdrawn");
				int withdraw = scn.nextInt();
				if (withdraw > balance) {
					System.out.println("Insufficient Balance");
					System.out.println("Account Balance is : " + balance);

				} else {
					balance = balance - withdraw;
					System.out.println("Account Balance is : " + balance);

				}
				break;

			case 4:
				System.out.println("Thank You !!!!");
				System.exit(0);
			}
		}
		scn.close();
		System.out.println("********************************************");
	}

	public static void automorphicNumber() {
		System.out.println("**Automorphic Number**");
		int num = 76;
		int sameNum = num;
		int square = num * num;
		int dupliSquare = square;
		int rem = 0;
		int rem1 = 0;
		int rev = 0;
		int rev1 = 0;
		int count = 0;

		while (sameNum > 0) {
			sameNum = sameNum / 10;
			count++;
		}

		for (int i = 0; i < count; i++) {
			rem = dupliSquare % 10;
			rev = rev * 10 + rem;
			dupliSquare = dupliSquare / 10;
		}

		while (rev > 0) {
			rem1 = rev % 10;
			rev1 = rev1 * 10 + rem1;
			rev = rev / 10;
		}
		if (num == rev1) {
			System.out.println(num + " is an Automorphic number");
		} else {
			System.out.println(num + " is Not Automorphic number");
		}
		System.out.println("********************************************");
	}

	public static void binarySearch() {
		System.out.println("**Binary Search**");
		int a[] = { 90, 10, 30, 20, 40, 50, 80, 60, 70 };
		int key = 80;
		System.out.println("Given Array is : " + Arrays.toString(a));
		System.out.println("Given searching value is : " + key);
		Arrays.sort(a);
		System.out.println("After sort, Array is : " + Arrays.toString(a));

		int li = 0;
		int mi;
		int hi = a.length - 1;

		if (li > hi) {
			System.out.println("Element not found !!!!");
		}
		while (li <= hi) {
			mi = (li + hi) / 2;

			if (a[mi] == key) {
				System.out.println(key + " found at " + mi + " index");
				break;
			}

			else if (a[mi] < key) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
		}

		System.out.println("********************************************");
	}

	public static void bubbleSort() {
		System.out.println("**Bubble Sort**");
		int a[] = { 90, 10, 30, 10, 20, 20, 40, 50, 80, 60, 70 };
		System.out.println("Given Array is : " + Arrays.toString(a));

		int len = a.length - 1;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("After Bubble sort : " + Arrays.toString(a));
		System.out.println("********************************************");
	}

	public static void compare2Arrays() {
		System.out.println("**Compare 2 Arrays**");

		int a[] = { 20, 10, 30, 50, 40, 80, 60, 70 };
		int b[] = { 20, 10, 30, 50, 40, 80, 60, 70 };

		// Approach - 1
		if (Arrays.equals(a, b) == true) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both arrays are not equal");
		}

		// Approach - 2

		boolean res = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					res = false;
				}
			}
		}
		if (res == true) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both arrays are not equal");
		}
		System.out.println("********************************************");
	}

	public static void convertLowerToUpperAndViceversa() {
		System.out.println("**Convert from Lower to Upper and Vice versa**");
		String s = "This is a STRING `1234567889";
		System.out.println("Given string is : " + s);
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) {
				temp = temp + (char) (s.charAt(i) + 32);
			} else if ((s.charAt(i) >= 97) && (s.charAt(i) <= 122)) {
				temp = temp + (char) (s.charAt(i) - 32);
			} else {
				temp = temp + (char) (s.charAt(i));
			}
		}
		System.out.println(temp);

		System.out.println("********************************************");
	}

	public static void countCharsAndDigits() {
		System.out.println("**Count the Characters and Digits**");
		String s = "Th233i2s i5s 100 a10 S6tr4in8g4";
		System.out.println("Given string is : " + s);

		int charCount = 0;
		int digitCount = 0;
		String num = "";
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 48) && (s.charAt(i) <= 58)) {
				digitCount++;
				num = num + s.charAt(i) + " ";
			} else if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90) || (s.charAt(i) >= 97) && (s.charAt(i) <= 122)) {
				charCount++;
				temp = temp + (char) (s.charAt(i));
			}
		}
		System.out.println("Number of Characters in a given string is : " + charCount);
		System.out.println("Only Characters is : " + temp);
		System.out.println("Number of Digits in a given string is : " + digitCount);
		System.out.println("Only Digits is : " + num);
		System.out.println("********************************************");
	}

	public static void dateDemo() {
		System.out.println("**Date Demo**");
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d));

		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf1.format(d));
		System.out.println("********************************************");
	}

	public static void removeDuplicateChars() {
		System.out.println("**Remove Duplicate characters from a given string**");

		String s = "programming";
		System.out.println("Given string is : " + s);

		StringBuilder sb = new StringBuilder();
		Set<Character> values = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			values.add(s.charAt(i));
		}

		for (Character value : values) {
			sb.append(value);
		}
		System.out.println("After removing duplicates : " + sb);

		System.out.println("********************************************");
	}

	public static void evenAndOddFromArray() {
		System.out.println("**Extract Even and Odd integers from an Array**");
		int a[] = { 12, 10, 15, 18, 25, 30, 7, 9, 30, 40, 45, 50, 60 };
		for (int kk : a) {
			if (kk % 2 == 0) {
				System.out.println("Even number : " + kk);
			}
		}
		for (int kk : a) {
			if (kk % 2 != 0) {
				System.out.println("Odd number : " + kk);
			}
		}

		System.out.println("********************************************");
	}

	public static void extractNumberAndString() {
		System.out.println("**Extract the numbers and string from given string**");
		String s = "zdsxcj244$##$&&)*45	kHDSHDf,msgs154861234354ggsfg3sff4sf6ss";
		String temp = s;
		System.out.println("Given string's length is : " + s.length());
		s = s.replaceAll("[^a-z A-Z]", "");
		System.out.println(s);
		System.out.println("Extracted string's length is : " + s.length());

		temp = temp.replaceAll("[^0-9]", "");
		System.out.println(temp);
		System.out.println("Extracted number's length is : " + temp.length());
		System.out.println("********************************************");
	}

	public static void factorialNumber() {
		System.out.println("**Factorial number **");
		int n = 5;
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is : " + fact);
		System.out.println("********************************************");
	}

	public static void fibonacciNumber() {
		System.out.println("**Fibonacci Number**");
		int f = 0;
		int s = 1;
		System.out.println("Fibonacci of first 10 numbers are : ");
		System.out.println(f);
		System.out.println(s);

		for (int i = 3; i <= 10; i++) {
			int t = f + s;
			f = s;
			s = t;
			System.out.println(t);
		}
		System.out.println("********************************************");
	}

	public static void findDuplicateElementsInArray() {
		System.out.println("**Duplicate elements in an Array**");
		int a[] = { 10, 20, 30, 80, 20, 50, 40, 60, 70, 10 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[i] == a[j + 1]) {
					System.out.println(a[i] + " is duplicate element");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Duplicate elements not found !!!!");
		}
		System.out.println("********************************************");
	}

	public static void findDuplicateElementsInString() {
		System.out.println("**Duplicate elements in an String**");
		String s[] = { "black", "red", "blue", "white", "black", "red", "purple", "green", "orange" };
		boolean res = false;

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length - 1; j++) {
				if (s[i] == s[j]) {
					System.out.println("Duplicate string is : " + s[i]);
					res = true;
					break;
				}
			}
		}
		if (res == false) {
			System.out.println("Dulicate string not found !!!!");
		}
		System.out.println("********************************************");
	}

	public static void generateRandomEmails() {
		System.out.println("**Generate Random Emails**");
		Random r = new Random();
		int n = r.nextInt(100);
		String s = RandomStringUtils.randomAlphabetic(6);
		String email = s + n + "@gmail.com";
		email = email.toLowerCase();
		System.out.println(email);
		System.out.println("********************************************");
	}

	public static void generateRandomNumber() {
		System.out.println("**Generate Random Numbers**");
		Random r = new Random();
		int n1 = r.nextInt(1000);
		System.out.println(n1);

		float n2 = r.nextFloat();
		System.out.println(n2);
		System.out.println("********************************************");
	}

	public static void largestNumber() {
		System.out.println("**Largest Number**");
		int a = 11111;
		int b = 1000;
		int c = 1111;
		int largest = a > b ? a : b;
		largest = c > largest ? c : largest;

		System.out.println("Largest Number is : " + largest);

		System.out.println("********************************************");
	}

	public static void leapYear() {
		System.out.println("**Leap Year**");
		int year = 2022;
		if ((year % 4 == 0) || (year % 400 == 0)) {
			System.out.println(year + " is Leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is Not Leap year");
		} else {
			System.out.println(year + " is Not Leap year");
		}
		System.out.println("********************************************");
	}

	public static void linearSearch() {
		System.out.println("**Linear Search**");
		int a[] = { 10, 50, 30, 20, 40, 90, 60, 70, 80 };
		int keyVal = 90;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == keyVal) {
				System.out.println("Key found at " + i + "th index");
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Key not found !!!!");
		}
		System.out.println("********************************************");
	}

	public static void maxAndMinElementInArray() {
		System.out.println("**Maximum and Minimum Element in Array**");
		int a[] = { 10, 50, 30, 40, 20, 90, 80, 70, 60 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum element is  : " + max);

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum element is : " + min);

		System.out.println("********************************************");
	}

	public static void missingNumber() {
		System.out.println("**Missing numbers in Array**");
		int a[] = { 2, 0, 20, 15, 10, 4, 5 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int index = 0;

		int max = a[a.length - 1];

		for (int i = 0; i < max; i++) {
			if (i == a[index]) {
				index++;
			} else {
				System.out.println(i);
			}
		}
		System.out.println("********************************************");
	}

	public static void noOfEvenAndOddDigits() {
		System.out.println("**Number of Even and Odd Digits**");
		int a[] = { 2, 0, 20, 15, 10, 4, 5 };
		int evenDigit = 0;
		int oddDigit = 0;
		for (int i = 0; i < a.length; i++) {
			while (a[i] > 0) {
				if (a[i] % 2 == 0) {
					evenDigit++;
					System.out.println(a[i] + " Even");
				} else if (a[i] % 2 != 0) {
					oddDigit++;
					System.out.println(a[i] + " Odd");
				}
				a[i] = a[i] / 10;
			}
		}
		System.out.println("Number of Even Digit : " + evenDigit);
		System.out.println("Number of Odd Digit : " + oddDigit);
		System.out.println("********************************************");
	}

	public static void palindromeNumber() {
		System.out.println("**Palindrome Number**");
		int n = 12343212;
		int num = n;
		int rev = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (num == rev) {
			System.out.println(num + " is Palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}
		System.out.println("********************************************");
	}

	public static void palindromeString() {
		System.out.println("**Palindrome String**");
		String s = "Madam";

		// Approach - 1
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());

		// Approach - 2
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println(s + " is Palindrome string");
		} else {
			System.out.println(s + " is Not Palindrome string");
		}
		System.out.println("********************************************");
	}

	public static void perfectNumber() {
		System.out.println("**Perfect Number**");
		int num = 6;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println(num + " is Perfect number");
		} else {
			System.out.println(num + " is Not Perfect number");
		}
		System.out.println("********************************************");
	}

	public static boolean primeNumber(int num) {
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void getPrime() {
		System.out.println("**Prime Numbers**");
		for (int i = 1; i <= 100; i++) {
			if (primeNumber(i) == true) {
				System.out.println(i + " is Prime Number");
			}
		}
		System.out.println("********************************************");
	}

	public static void asciiValue() {
		System.out.println("**ASCII values**");
		System.out.println("ASCII value of 'A' to 'Z' ");
		for (char i = 'A'; i <= 'Z'; i++) {
			int a = i;
			System.out.println(i + " --> " + a);
		}
		System.out.println();
		System.out.println("ASCII value of 'a' to 'z' ");
		for (char i = 'a'; i <= 'z'; i++) {
			int a = (int) i;
			System.out.println(i + " --> " + a);
		}
		System.out.println();
		System.out.println("ASCII value of '0' to '9' ");
		for (char i = '0'; i <= '9'; i++) {
			int a = i;
			System.out.println(i + " --> " + a);
		}
		System.out.println();
		System.out.println("********************************************");
	}

	public static void getASCII() {
		System.out.println("**ASCII values**");
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int a = ch;
		System.out.println(ch + " --> " + a);
		scn.close();
		System.out.println("********************************************");
	}

	public static void removeDuplicateInt() {
		System.out.println("**Remove Duplicate Integers from an array**");
		int a[] = { 10, 20, 5, 10, 30, 50, 8, 0, 70, 59, 70, 40, 5, 5, 2, 2 };
		System.out.println("Given array is : " + Arrays.toString(a));

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		for (Integer list : a) {
			lhs.add(list);
		}
		System.out.println("LinkedHashSet : " + lhs);

		Set<Integer> ts = new TreeSet<Integer>();
		for (Integer list : a) {
			ts.add(list);
		}
		System.out.println("TreeSet : " + ts);

		System.out.println("********************************************");
	}

	public static void removeDupliString() {
		System.out.println("**Remove Duplicate Strings from an array**");
		String s[] = { "Black", "White", "Red", "Black", "White", "White", "Blue", "Green", "Purple", "Brown", "Pink",
				"Orange", "Blue", "White" };
		System.out.println(Arrays.toString(s));

		Set<String> st = new LinkedHashSet<String>();
		for (String kk : s) {
			st.add(kk);
		}
		System.out.println("LinkedHashSet");
		System.out.println(st);

		Set<String> st1 = new TreeSet<String>();
		for (String kk : s) {
			st1.add(kk);
		}
		System.out.println("TreeSet");
		System.out.println(st1);

		Set<String> st2 = new HashSet<String>();
		for (String kk : s) {
			st2.add(kk);
		}
		System.out.println("HashSet");
		System.out.println(st2);
		System.out.println("********************************************");
	}

	public static void removeExtraSpace() {
		System.out.println("**Remove Extra Spaces**");

		String s = "Java          is    a  Programming Language";
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				temp = temp + s.charAt(i);
			} else if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				temp = temp + s.charAt(i);
			}
		}
		System.out.println(temp);
		System.out.println("********************************************");
	}

	public static void removeJunkChars() {
		System.out.println("**Remove Junk Characters**");
		String s = "@#Ja#$%^&va     i#$%^s Programming #$%^ Language@$ 12345";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println("********************************************");
	}

	public static void removeWhiteSpaces() {
		System.out.println("**Remove White Spaces**");
		String t = "J  a v  a i s a Pr  og ra m m i ng L a n g  ua ge";
		String temp = "";
		System.out.println(t);

		// Approach - 1
		t = t.replaceAll("\\s", "");
		System.out.println(t);

		// Approach - 2
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) != ' ') {
				temp = temp + t.charAt(i);
			}
		}
		System.out.println(temp);
		System.out.println("********************************************");
	}

	public static void reverseNumber() {
		System.out.println("**Reverse the Number**");
		int n = 12345;
		int rem = 0;
		int rev = 0;
		System.out.println("Given number is  : " + n);
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("Reverse nubmer is : " + rev);
		System.out.println("********************************************");
	}

	public static void reverseString() {
		System.out.println("**Reverse the String**");

		String s = "Core Java";
		System.out.println("Given String is : " + s);

		// Approach - 1
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		System.out.println("Reverse String is : " + sb);

		// Approach - 2
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String is : " + rev);

		// Approach - 3
		String str[] = s.split(" ");
		System.out.print("Reverse String is : ");
		for (int i = str.length - 1; i >= 0; i--) {
			char ch[] = str[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("********************************************");
	}

	public static void rotateArrayLeft() {
		System.out.println("**Rotate an array to left**");
		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		int n = 2;
		int first;
		System.out.println(Arrays.toString(a));
		System.out.println("n = " + n);
		for (int i = 0; i < n; i++) {
			first = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = first;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("********************************************");
	}

	public static void sortInBuilt() {
		System.out.println("**Sort an array by using inbuilt methods**");
		int a[] = { 20, 10, 60, 40, 30, 50, 80, 70, 90 };
		System.out.println("Before sort : " + Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("After sort : " + Arrays.toString(a));

		System.out.println("********************************************");
	}

	public static void squareRoot() {
		System.out.println("**Square root of number**");
		int n = 25;
		System.out.println("n = " + n);
		double d = Math.sqrt(n);
		System.out.println("Square root is : " + d);

		System.out.println("********************************************");
	}

	public static void sumOfArrayValues() {
		System.out.println("**Sum of values in a an array**");
		int a[] = { 1, 3, 2, 5, 6, 4, 8, 9, 7, 20, 10 };
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum is : " + sum);
		System.out.println("********************************************");
	}

	public static void sumOfDigits() {
		System.out.println("**Sum of digits**");
		int n = 12345;
		int rem = 0;
		int sum = 0;
		System.out.println("n = " + n);
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of digits is : " + sum);
		System.out.println("********************************************");
	}

	public static void swapDigit() {
		System.out.println("**Swapping of digits without 3rd variable**");
		int a = 10;
		int b = 20;
		System.out.println("Before swapping a = " + a + " and b = " + b);
		a = a + b; // 10+20=30-->a
		b = a - b; // 30-20=10-->b
		a = a - b; // 30-10=20-->a
		System.out.println("After swapping a = " + a + " and b = " + b);
		System.out.println("********************************************");
	}

	public static void swapString() {
		System.out.println("**Swapping of string**");
		String str1 = "Java";
		String str2 = "Selenium";
		System.out.println("Before swapping s1 = " + str1 + " and s2 = " + str2);

		// Approach - 1, with 3rd variable
		String temp = "";
		temp = str1; // temp-->Java
		str1 = str2; // str1-->Selenium
		str2 = temp; // s2-->Java
		System.out.println("After swapping s1 = " + str1 + " and s2 = " + str2);

		// Approach - 2, without 3rd variable
		String s1 = "Java";
		String s2 = "Selenium";
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping s1 = " + s1 + " and s2 = " + s2);

		System.out.println("********************************************");
	}

	public static void wordCount() {
		System.out.println("**Number of words**");
		String s = "Java is a Programming language";
		int count = 1;
		System.out.println(s);

		// Approach - 1
		String str[] = s.split(" ");
		System.out.println("Number of words : " + str.length);

		// Approach - 2
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words : " + count);
		System.out.println("********************************************");
	}

	public static void duplicateCharsAndCountOfChars1() 
	{
		System.out.println("**Duplicate chars count**");
		String s = "JavaProgram";
		System.out.println("Given string : " + s);

		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		char ch[] = s.toCharArray();

		for (char c : ch) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}
		}
		System.out.println("Each chars and count in a string");
		System.out.println(mp);

		System.out.println("Duplicate chars and count");
		Set<Character> st = mp.keySet();
		for (Character val : st) {
			if (mp.get(val) > 1) {
				System.out.println(val + " = " + mp.get(val));
			}
		}
		System.out.println("********************************************");
	}

	public static void convert1DInto2D()
	{
		System.out.println("**Convert 1D array into 2D array**");
		int a[]= {10,20,30,40,50,60};
		int m=3; // no. of rows
		int n=2; // no. of columns
		
		System.out.println("Given 1D array is : ");
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		System.out.println("After converting it into 2D array is : ");
		
		int ar[][]=new int[m][n];
		
		for(int i=0;i<a.length;i++)
		{
			int nr=i/n;
			int nc=i%n;
			ar[nr][nc]=a[i];
		}
		
		for(int kk[]:ar)
		{
			for(int bb:kk)
			{
				System.out.print(bb+" ");
			}
			System.out.println();
		}
		System.out.println("********************************************");
	}
	
	public static void convert2DInto1D()
	{
		System.out.println("**Convert 2D array into 1D array**");
		int a[][]= {{10,20,30},{40,50,60}};
		System.out.println("Given 2D array is : ");
		for(int kk[]:a)
		{
			for(int bb:kk)
			{
				System.out.print(bb+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("After converting into 1D array is : ");
		
		List<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				ar.add(a[i][j]);
			}
		}
		
		int ab[]=new int[ar.size()];
		for(int i=0;i<ab.length;i++)
		{
			ab[i]=ar.get(i);
			System.out.print(ab[i]+" ");
		}
		System.out.println();
		System.out.println("********************************************");
	
	}
	public static void working() {
		System.out.println("ALL THE VERY BEST");
		System.out.println("********************************************");
	}
}

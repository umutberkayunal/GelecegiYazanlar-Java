package stringLab;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1 == str2);//used when comparing different memory adressed
		//variables value. 
		//output is true but this can be indicating memory adresses are shared.
		System.out.println(str1.equals(str2));//so we are using equals()
		str2 = "HELLO";
		System.out.println(str1.equalsIgnoreCase(str2));
		//compares the given strings ignoring upper-lower case.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a message");
		String line = scanner.nextLine();
		System.out.println(line.toLowerCase());
		System.out.println(line.toUpperCase());
		System.out.println(line.charAt(3));
		
		System.out.println(line.length());
		System.out.println(line.substring(3));
		System.out.println(line.isEmpty());
		System.out.println(line.replace("ab", "wq"));
		
		System.out.println(line.indexOf("a"));
		System.out.println(line.lastIndexOf("a"));
		System.out.println(line.trim());
		/*
		    output is :
		    true
			true
			true
			Please input a message
			Merhaba Dünya
			merhaba dünya
			MERHABA DÜNYA
			h
			13
			haba Dünya
			false
			Merhwqa Dünya
			4
			12
			Merhaba Dünya
		*/
		
		Scanner scanner2 = new Scanner(System.in);
		String str3 = scanner2.nextLine();
		String str4 = scanner2.nextLine();
		
		System.out.println(str3 + " " + str4);//this use is causing a new string to be
		//created. Becuase strings in java are immutable.
		//If we need to do changes on the string, we can use StringBuilder object.
	}

}

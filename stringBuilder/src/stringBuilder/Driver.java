package stringBuilder;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String userinput = scanner.nextLine();//the input until the next line is scanned.
		//System.out.println(userinput.toLowerCase());
		StringBuffer buffer = new StringBuffer();
		buffer.append("Ad: ");
		System.out.print("Your First name:");//ln skips to new line while getting input.
		buffer.append(scanner.nextLine());//so we use print() to make sure user is typing
		System.out.print("Your Last name:");//to the according area.
		buffer.append(", Soyad:");
		buffer.append(scanner.nextLine());
		System.out.println(buffer.toString());
	}

}

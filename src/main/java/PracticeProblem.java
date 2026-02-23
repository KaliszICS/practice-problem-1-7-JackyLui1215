/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Jacky Lui
	* Date Last Modified: Feb 23, 2026
	*/

	import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		String character;
		character = input.nextLine();
		char char1;
		char1 = character.charAt(0);

		
		String character1;
		System.out.print("Input another lowercase letter: ");
		character1 = input.nextLine();
		char char2;
		char2 = character1.charAt(0);

		System.out.println(char1 < char2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = input.nextDouble();
		System.out.println(num >= 0 && num <= 10);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num;
		num = input.nextDouble();
		System.out.println(!(num == 5) && num > 0);

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word;
		word = input.nextLine();
		System.out.println(!word.equals("banana"));
	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer;
		integer = input.nextInt();
		System.out.println("The integer " + integer + " is " + ((integer % 2) == 0));

	}

}

package CodingProblems;

import java.util.Scanner;

public class UserInputJava {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter your name :");
		
		String name = s.next();
		
		System.out.println("Enter your age :");
		
		int age = s.nextInt();
		
		System.out.println("Enter your gender :");
		
		char gender = s.next().charAt(0);
		
		System.out.println("Enter your Phone :");
		
		long phone = s.nextLong();
		
		System.out.println("--------------------------------");
		
		System.out.println("Enter your name : " + name);
		
		System.out.println("Enter your age : " + age);
		
		System.out.println("Enter your gender : " + gender);
		
		System.out.println("Enter your phone : " + phone);
		
	}

}

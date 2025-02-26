package CodingProblems;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
//		Scanner t = new Scanner(System.in);
//		System.out.println("Enter number");
//		int no = t.nextInt();
	
		int no = 10;
		int temp=0;
		
		for(int i=2;i<=no-1;i++) 
		{
			
			if (no % i == 0) 
			{
				
				temp = temp + 1;
			}	
		}
			if (temp == 0) 
			{
			
				System.out.println(no +" is prime number");
			}
			else
			{
				System.out.println(no +" is not prime number");
			}
	}

}

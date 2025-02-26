package CodingProblems;

public class FactorialNum {

	public static void main(String[] args) {
		
		int No = 3,fact =1;
		
		for (int i=1; i<= No; i++)
		{
		
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
}

package CodingProblems;

public class GreaterBetweenThree {

	public static void main(String[] args) {
		
		int A=10,B=70,C=30;
		
		if (A>B && A> C) {
			System.out.println("A is greater than B & C");
		}
		else if (B>A && B>C) {
			System.out.println("B is greater than A & C");
		}else {
			System.out.println("C is greater than A & B");
		}
	}
}

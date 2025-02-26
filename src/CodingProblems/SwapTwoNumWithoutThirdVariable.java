package CodingProblems;

public class SwapTwoNumWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int A=10,B=20;
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("A ="+ A);
		System.out.println("B ="+ B);
	}

}

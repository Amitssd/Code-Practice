package CodingProblems;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int no= 987654321, rem,rev=0;
		
		while(no != 0) {
			
			rem = no % 10;
			
			rev = rev *10 + rem;
			
			no= no / 10;
		
		}System.out.println("Reverse Number = " + rev);
	}
}
 
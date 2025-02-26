package CodingProblems;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "LITAP TIMA";
		int lenth = name.length();
		String rev ="";
		
		for (int i= lenth-1;i>=0;i--) {
			
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse String = " + rev);
	}
}

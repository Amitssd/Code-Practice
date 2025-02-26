package CodingProblems;

public class MaximumMinimumNumber {

	public static void main(String[] args) {
		int[] a= {3,23,34,56,4,432,345,654,999};
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element is " + max);
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element is " + min);
	}
}

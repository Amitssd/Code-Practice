package CodingProblems;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		
		int[] a= {3,4,5,6,7,1,2,3,2,4,8,9};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]==a[j]) && (i != j))
				{
					System.out.print(a[j]+",");
				}
			}
		}
	}
}

package CodingProblems;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArraySet {

	public static void main(String[] args) {
		
		int[] a= {3,4,5,6,7,1,2,3,2,4,8,9};
		
		System.out.print("Duplicate elemens are : ");
		Set<Integer>s=new HashSet<>();
		for(int no:a)
		{
			boolean b=s.add(no);
			if(b == false)
			{
				System.out.print(no + " ");
			}
		}
		
	}
}

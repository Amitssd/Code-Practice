package CodingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsInArrayHashmap {

	public static void main(String[] args) {
		int[] a= {3,4,5,6,7,1,2,3,2,4,8,9};
		
		Map<Integer, Integer> hm=new HashMap<>();
		
		for(int no:a)
		{
			Integer count =hm.get(no);
			if(count==null)
			{
				hm.put(no, 1);
				
			}
			else
			{
				count=count+1;
				hm.put(no, count);
			}
		}
		System.out.print(" Duplicate elements are : ");
		Set<Map.Entry<Integer, Integer>>es =hm.entrySet();
		for(Map.Entry<Integer, Integer> me : es)
		{
			if(me.getValue()>1)
			{
				System.out.print(me.getKey()+ " ");
			}
		}

	}
}

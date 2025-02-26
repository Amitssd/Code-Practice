package CodingProblems;

public class KthLargestElement {
	
	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6,7,6,33,4,422,33,44,54,23,77,88,75,74,99,100};
		
		int k=4;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+ " Largest element is "+ a[i]);
			}
		}
		System.out.println("----------------------");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

package CodingProblems;

public class SecondLargestNoInArray {
	public static void main(String[] args) {
		
		int[] a= {5,7,54,56,87,34,44,23,78,99,90};
		
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second largest number is "+ a[1]);
	}

}

package CodingProblems;

public class SecondLargestNoInArray2 {

	public static void main(String[] args) {
		
		int[] a= {9,49,43,59,93,54,23,64,88,98,99};
		
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]> second_largest && a[i]!= largest)
			{
				second_largest=a[i];
			}
		}
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("There is no second largest element in the list");
		}
		else
		{
			System.out.println("Second largest value is "+ second_largest);
		}
	}
}

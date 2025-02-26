package CodingProblems;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int year = 2025;
		
		if (year % 4 == 0)
		{
			 if (year % 100 == 0 )
			{
		
					if (year % 400 == 0) 
				{
					System.out.println("This year is leap year");
				}
				else
				{
					System.out.println("This year is not leap year");
				}
				
			}
			 else
			 { 
				 System.out.println("This year is leap year");
			 }
		}
		else 
		{
			System.out.println("This year is not leap year");
		}
	}
	
}

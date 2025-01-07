import java.util.*;
class Natural
{
	public static void main(String args[])
	{
		int natural;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		natural=sc.nextInt();
		
		System.out.println("The sum of natual number is: " + sum(natural));
		}
			public static int sum(int value)
			{
				if(value == 0)
				{
					return 0;
					}
					
					return value + sum(value - 1);
						
				
			}
			

}

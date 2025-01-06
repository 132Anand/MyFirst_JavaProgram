import java.util.Scanner;
class Cal
{
	public static void main(String args[])
	{
		int choise, s1, s2;
		System.out.println(" 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division");
		System.out.println("Enter from above choice");
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		System.out.println("Enter first number");
		s1 = sc.nextInt();
		System.out.println("Enter second number");
		s2 = sc.nextInt();
		
		int result = 0;
		switch(choise)
		{
			case 1:
				result = s1 + s2;
				break;
				
				case 2:
				result = s1 - s2;
				break;
				
				case 3:
				result = s1 * s2;
				break;
				
				case 4:
				result = s1 / s2;
				break;
				
				default:
					System.out.println("wrong!. Chose from above number");
					}
					System.out.println("Your Answer: " + result);
			}
				
}				


import java.util.Scanner;
class Givennmbr_Factors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		factors(num);

	}

	public static void factors(int num )
	{
		for (int i=1;i<=num;i++)
		{

			if(num%i==0){
				System.out.println(i);
			}

		}
	}



}

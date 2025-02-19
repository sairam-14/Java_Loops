import java.util.Scanner;
class Factors30and40 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();

		if((40%number==0)&&(30%number==0)){
			System.out.println("Given number is Factor of 30 and 40");
		}else{
			System.out.println("given nmber is not factor of 30 and 40");
		}
	}
}

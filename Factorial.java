import java.util.Scanner;
class  Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();  //num=5
		int product =1;  
		for(int i =num;i>=1;i--){
			product = product*i;//1*5*4*3*2*1
		}
		System.out.println(product);

	}
}

import java.util.Scanner;
class Primefactors_Even_Odd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number");
        int num =sc.nextInt();
		
		int count =0;
		
		for(int i=1;i<=num;i++){

			if(num%i==0){

				if(i%2==0){
					System.out.println(i+" is Even");
				}else{
					System.out.println(i+"is odd");
				}
			}
				
		
		}
	
	}
	}
	


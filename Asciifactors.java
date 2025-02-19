import java.util.Scanner;
class  Asciifactors
{
	public static void main(String[] args) 

	{
		char a = (char)5;
		System.out.println(a);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ascii");
		int ascii = sc.nextInt();
		char ch = (char)ascii;
		if((100%ascii==0)&&(90%ascii==0)){

			
			System.out.println(ch +"This ASCII common factors of 100 and 90");

		}else{
			System.out.println(ch +"This character ASCII not common factors of 100 and 90");
		}
	}
}

class Oddfactrs_60 
{
	public static void main(String[] args) 
	{
		int sum =0;

		for(int i=1;i<=60;i++){
			if(60%i==0&&i%2!=0){
				sum= sum+i;
			}
		}
		System.out.println("Sum of odd factors of 60 is" + sum);

	}
}

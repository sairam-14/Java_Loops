class Ascii_Odd 
{
	public static void main(String[] args) 
	{
		for(char ch ='a';ch<='z';ch++){
			int ascii =ch;
			if(ascii%2!=0){
				System.out.println(ch);
			}
		}
	}
}

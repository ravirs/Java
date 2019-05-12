
public class isPrime {

	public static boolean main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		boolean ispalindrome(int number)
		{
			int plaindrome= number;
			int reverse=0;
			
			while(plaindrome!=0)
			{
				int remainder = plaindrome %10;
				reverse = reverse*10 + remainder ;
				plaindrome = plaindrome /10 ;
			}
			
			if(number ==reverse)
			{ return true;}

		}

	}

}

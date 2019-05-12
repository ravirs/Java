
public class HelloWorldGreeting 
{
  public static void main (String[] args)
  {
	 public static int fibonnaci2( int number)
	 {
		 if (number==1 || number ==2)
		 {
			 return 1;
		 }

		 int fibo1=1, fibo2=1, fibonnaci =1;
		 for (int i=3;i<number;i++)
		 {
			 fibonnaci = fibo1 + fibo2;
			 fibo1 = fibo2;
			 fibo2= fibonnaci;
		 }
		 return fibonnaci;
	 }
  }

}

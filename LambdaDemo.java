
public class LambdaDemo
	{
	   public static void main(String[] args)
	   {
		   //lambda expression
		   
		     ImyFunc myFactorialfun = (num)->
		     {
		    	 int fact =1;
		    	 for (int i = 1 ;i<=num;i++)
		    	 {
		    		 fact = i* fact;
		    	 }
		    	 return fact;
		    	 
		     };
		   System.out.println("factorial of 7 is " + myFactorialfun.getValue(8));
	   }
	   
	   static int factorial(int n)
	   {
		   int res=1;
		   for (int i=1;i<=n;i++)
		   {
			   res = res*i;		 
		   }
		   return res;
	   }
	}

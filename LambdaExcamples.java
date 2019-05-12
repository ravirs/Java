import java.util.Comparator;

public class LambdaExcamples
{
	public static void main (String args[])
	{
		Myfunction myfunction = (text1, text2) -> 
		{ System.out.println(text1+ text2);
		  return text1 +""+text2; 
		};
		
		String returnvalue = myfunction.apply("Hello Function Body", "Test");
		System.out.println(returnvalue);
		
		
	}
}  
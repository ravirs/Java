import java.util.Arrays;

public class find_som_of_three 
{
	

}

public static void main (String[] args)
{
	int[] arr = {24,55,6,67,7,87};
	System.out.println("7:" +find_som_of_three(arr, 6));
}

private static String find_som_of_three(int[] arr, int required_sum) 
{
	Arrays.sort(arr);
	for(int i=0;i<arr.length-2;i++)
	{
		int remained_sum = required_sum - arr[i];
		if(find_sum_of_two(arr, remain))
	}
}
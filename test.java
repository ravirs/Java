import java.util.HashSet;

public class test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*public void testDuplicates(){
		int [] array = {2,3,1,4,2,3,4,3,532,232,21231};
			List<Integer> output = this.getDuplicatesInARange(array, 3);
			System.out.println(output);
		}
		*/
	public List<Integer> getDuplicatesInARange(int[]array,int distance)
	{
		HashSet<Integer> set = new HashSet<>() ;
	  for (int i =0;i<array.length;i++)
	{
	       if(i<=distance)
	{
	    	   set.add(array[i]);
	    	   if(set.contains(array[j]);
					{
					return array[i,j];
					}
					}
					return false;
					}


	}

}

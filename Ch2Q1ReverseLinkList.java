
public class Ch2Q1ReverseLinkList 
{

	public static void main(String[] args) 
	{
		
	}
	
	public static LinkedListNode reverse_iterative (LinkedListNode head)
	{
		//No need to traverse if head is null
		if (head == null) 
		{
			head.next = null;
		}
		
		LinkedListNode list_to_do = head.next;
		LinkedListNode reversed_list = reverse_iterative(head.next);
		
		head.next.next = head;
		head.next = null;
		
		
//		reversed_list.next = null;
//		
//		while(list_to_do != null)
//		{
//			LinkedListNode temp = list_to_do ;
//			list_to_do = list_to_do.next;
//			
//			temp.next = reversed_list;
//			reversed_list = temp;
//		}
		
		return reversed_list;
		
	}

}

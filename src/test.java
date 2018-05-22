
public class test {

	public static void main(String[] args) {
		
		
		LinkedListNode nodeList = LinkedListNode.buildList(new int[] {-1,1,5,10,-1,1231,2});
		
		
		LinkedListNode.printList(nodeList);
		
		
		LinkedListNode.removeMax(nodeList, 3);
		
		System.out.println( " after removing " );
		
		LinkedListNode.printList(nodeList);

	}

}


public class DoublyEndedListDemo {// an advantage of a double ended list makes it easier to append to a linked list as you can see!

	public static void main(String[] args) {
		DoubleEndedLinkedList dList = new DoubleEndedLinkedList();
		
		dList.setTail("First tail set");
		dList.setTail(15);
		dList.setTail(false);
		
		System.out.println(dList);
	}

}

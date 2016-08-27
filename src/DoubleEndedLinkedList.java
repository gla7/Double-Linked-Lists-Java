
public class DoubleEndedLinkedList<Any> {
	
	private Node<Any> head;
	private Node<Any> tail;
	
	public void setHead (Any data) {
		Node<Any> newHead = new Node<Any>(data);
		Node<Any> temp = this.head;
		this.head = newHead;
		newHead.setNextNode(temp);
	}
	
	public void setTail (Any data) {
		Node<Any> newTail = new Node<Any>(data);
		if (this.head == null) {
			this.head = newTail;
			this.tail = newTail;
		}
		if (this.tail != null) {
			this.tail.setNextNode(newTail);
			this.tail = newTail;
		}
	}
	
	public String toString () {
		Node<Any> current = this.head;
		String returnString = "{";
		while (current != null) {
			if (current == this.tail) {
				returnString = returnString + current.toString() + "}";
			} else {
				returnString = returnString + current.toString() + ", ";
			}
			current = current.getNextNode();
		}
		return returnString;
	}
	
}


public class Node<Any> {
	
	private Any data;
	
	private Node<Any> nextNode;
	
	public Node (Any data) {
		this.data = data;
	}
	
	public Node<Any> getNextNode () {
		return this.nextNode;
	}
	
	public Any getData () {
		return this.data;
	}
	
	public void setNextNode (Node<Any> nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setData (Any data) {
		this.data = data;
	}
	
	public String toString () {
		return "Data: " + this.data;
	}
}

package Lista;

public class List {
	
	private Node first;
	private Node last;
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	
	public void addNode(int value) {
		Node node = new Node();
		node.setValue(value);
		node.setNext(first);
		this.first = node;
	}
	
	@Override
	public String toString() {
		//StringBuufer para não sobrecarregar a memoria
		StringBuffer str = new StringBuffer();
		str.append("[");
		Node node = this.first;
		
		while(node !=null) {
			str.append(node.getValue() + " -> ");
			node = node.getNext();
		}
		str.append("]");
		
		return str.toString();
	}

}

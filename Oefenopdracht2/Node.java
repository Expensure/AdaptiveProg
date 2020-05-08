package APProefopdracht2;
public class Node {
	private String Naam;
	private Node NodeA;
	private Node NodeB;

	public Node(String string) {
	}

	public Node getNodeA() {
		return NodeA;
	}

	public void setNodeA(Node NodeA) {
		this.NodeA = NodeA;
	}

	public Node getNodeB() {
		return NodeB;
	}

	public void setNodeB(Node NodeB) {
		this.NodeB = NodeB;
	}

}

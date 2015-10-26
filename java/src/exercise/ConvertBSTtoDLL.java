package exercise;

class Node {
	public Node (int v, Node l, Node r) { value = v; left = l; right = r; }
	public Node (int v) { value = v; }
	
	int value;
	Node left;
	Node right;	
}

class Response {
	public Response(Node n) { min = n; max = n; }
	public Response(Node l, Node r) { min = l; max = r; }
	
	Node min;
	Node max;
}

public class ConvertBSTtoDLL {
	
	private Response rec(Node r) {
		if (r == null)
			return null;
		
		if (r.left == null && r.right == null) {
			return new Response(r);
		}	
		
		Response leftMost = new Response(r);
		Response rightMost = new Response(r);
		
		if (r.left != null)
			leftMost = rec(r.left);
		
		if (r.right != null)
			rightMost = rec(r.right);

		r.left = leftMost.max;
		leftMost.max.right = r;
		
		r.right = rightMost.min;
		rightMost.min.left = r;
		
		return new Response(leftMost.min, rightMost.max);
	}

	public static void main(String[] args) {
		ConvertBSTtoDLL converter = new ConvertBSTtoDLL();
		
		Node rL = new Node(50, 
						new Node(25),
						new Node(75));
		
		Node rR = new Node(200, 
						new Node(150),
						new Node(250));
		
		Node root = new Node(100, rL, rR);

		Response first = converter.rec(root);
		Node node = first.min;
		while (node != null) {
			System.out.println(node.value);
			node = node.right;
		}
	}

}

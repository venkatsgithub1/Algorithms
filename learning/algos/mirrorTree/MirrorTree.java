public class MirrorTree {

	Node root;

	void mirror() {
		root = mirror(root);
	}

	Node mirror(Node node) {
		if (node == null)
			return node;

		Node left = mirror(node.left);
		Node right = mirror(node.right);

		node.left = right;
		node.right = left;

		return node;
	}

	void inOrder() {
		inOrder(root);
	}

	/*
	 * Helper function to test mirror(). Given a binary search tree, print out its
	 * data elements in increasing sorted order.
	 */
	void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data + " ");

		inOrder(node.right);
	}

	public static void main(String[] args) {
		/* creating a binary tree and entering the nodes */
		MirrorTree mirrorTree = new MirrorTree();
		mirrorTree.root = new Node(1);
		mirrorTree.root.left = new Node(2);
		mirrorTree.root.right = new Node(3);
		mirrorTree.root.left.left = new Node(4);
		mirrorTree.root.left.right = new Node(5);

		/* print inorder traversal of the input tree */
		System.out.println("Inorder traversal of input tree is :");
		mirrorTree.inOrder();
		System.out.println("");

		/* convert tree to its mirror */
		mirrorTree.mirror();

		/* print inorder traversal of the minor tree */
		System.out.println("Inorder traversal of mirror tree is : ");
		mirrorTree.inOrder();
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int key) {
		data = key;
		left = right = null;
	}
}

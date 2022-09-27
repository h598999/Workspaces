// Java program to construct binary tree from
// given array in level order fashion

public class Tree {
	Node root;

	// Tree Node
	static class Node {
		String data;
		Node left, right;
		Node(String data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	// Function to insert nodes in level order
	public Node insertLevelOrder(String[] arr, Node root,
												int i)
	{
		// Base case for recursion
		if (i < arr.length) {
			Node temp = new Node(arr[i]);
			root = temp;

			// insert left child
			root.left = insertLevelOrder(arr, root.left,
											2 * i + 1);

			// insert right child
			root.right = insertLevelOrder(arr, root.right,
											2 * i + 2);
		}
		return root;
	}

	// Function to print tree nodes in InOrder fashion
	public void inOrder(Node root)
	{
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	// Driver program to test above function
	public static void main(String args[])
	{
		Tree t2 = new Tree();
		String arr[] = { "i","e","N",null,"s",null,"t",null,null,"O","r",null,null,"b","å",null,null,null,null,"t"};
		t2.root = t2.insertLevelOrder(arr, t2.root, 0);
		t2.inOrder(t2.root);
	}
}



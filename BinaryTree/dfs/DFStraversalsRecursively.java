package dfs;

/**
 * DFS Traversals :-
 * Pre-Order Traversal : Root, Left, Right
 * In-order Traversal : Left, Root, right
 * Post-order Traversal: Left, Right, Root
 */
class Node {
	int key;
	Node left, right;
	
	Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class DFStraversalsRecursively {
	Node root;
	
	/**
	 * Traverse Binary Tree in In-order fashion (Left, Root, Right)
	 * @param cur - root of the binary tree
	 */
	void inOrderTraversal(Node cur) {		
		if(cur == null) {
			return;
		}
		
		inOrderTraversal(cur.left);
	
		System.out.println(cur.key);	

		inOrderTraversal(cur.right);

		
	}
	
	/**
	 * Traverse Binary Tree in Pre-order fashion (Root, Left, Right)
	 * @param cur - root of the Binary Tree
	 */
	void preOrderTraversal(Node cur) {		
		if(cur == null) {
			return;
		}
		
		System.out.println(cur.key);
		
		preOrderTraversal(cur.left);	

		inOrderTraversal(cur.right);	
	}
	
	/**
	 * Traverse Binary Tree in Post-Order Fashion (Left, Right, Root)
	 * @param cur - root of the Binary Tree
	 */
	void postOrderTraversal(Node cur) {		
		if(cur == null) {
			return;
		}
		
		preOrderTraversal(cur.left);	

		inOrderTraversal(cur.right);	
		
		System.out.println(cur.key);
	}
	

	public static void main(String[] args) {
		DFStraversalsRecursively dfs = new DFStraversalsRecursively();
		dfs.root = new Node(10);
		dfs.root.left = new Node(11);
		dfs.root.left.left = new Node(7);
		dfs.root.left.right = new Node(12);
		dfs.root.right = new Node(9);
		dfs.root.right.left = new Node(15);
		dfs.root.right.right = new Node(8);
		
		System.out.println("Inorder traversal: ");
		dfs.inOrderTraversal(dfs.root);
		
		System.out.println("Preorder traversal: ");
		dfs.preOrderTraversal(dfs.root);
		
		System.out.println("Postorder traversal: ");
		dfs.postOrderTraversal(dfs.root);
	}

}

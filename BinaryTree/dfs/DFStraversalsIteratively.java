package dfs;

import java.util.Stack;

public class DFStraversalsIteratively {

	Node root;
	
	void inOrder(Node node) {
		if(node == null) {
			return;
		}
		
		Node cur = node;
		
		Stack<Node> s = new Stack<Node>();
		
		while(cur != null || s.size() > 0) {
			while(cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			
			cur = s.pop();
			
			System.out.println(cur.key);
			
			cur = cur.right;
		}
	}
	
	void preOrder(Node node) {
		if(node == null) {
			return;
		}
		
		Node cur = node;
		
		Stack<Node> s = new Stack<Node>();
		s.push(cur);
		
		while(!s.isEmpty()) {
			cur = s.peek();
			
			System.out.println(cur.key);
			
			s.pop();
			
			if(cur.right != null) {
				s.push(cur.right);
			}
			
			if(cur.left != null) {
				s.push(cur.left);
			}		
		}
	}
	
	void postOrder(Node node) {
		if(node == null) {
			return;
		}
		
		Node cur = node, temp;
		
		Stack<Node> s = new Stack<Node>();
		
	}
	
	public static void main(String[] args) {
		DFStraversalsIteratively dfs = new DFStraversalsIteratively();
		
		dfs.root = new Node(10);
		dfs.root.left = new Node(11);
		dfs.root.left.left = new Node(7);
		dfs.root.left.right = new Node(12);
		dfs.root.right = new Node(9);
		dfs.root.right.left = new Node(15);
		dfs.root.right.right = new Node(8);
		
		System.out.println("Inorder traversal: ");
		dfs.inOrder(dfs.root);
		
		System.out.println("Preorder traversal: ");
		dfs.preOrder(dfs.root);
		
		System.out.println("Postorder traversal: ");
		dfs.postOrder(dfs.root);

	}

}

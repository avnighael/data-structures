package bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int key;
	Node left, right;
	
	Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class BFS {
	
	Node root;
	
	/**
	 * Given a binary tree print its nodes 
	 * in BFS manner
	 * @param root - root node of the Binary Tree
	 */
	 void levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null;
		
		while(!q.isEmpty()) {
			temp = q.poll();
			System.out.println(temp.key + " ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		BFS bfs = new BFS();
		bfs.root = new Node(10);
		bfs.root.left = new Node(11);
		bfs.root.left.left = new Node(7);
		bfs.root.right = new Node(9);
		bfs.root.right.left = new Node(15);
		bfs.root.right.right = new Node(8);
        
        bfs.levelOrderTraversal(bfs.root);
	}

}

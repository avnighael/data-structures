package insertDelete;

import java.util.LinkedList;
import java.util.Queue;

public class InsertDelete {
	
	/**
	 * A Binary Tree node has a key,
	 * a left child and a right child
	 *
	 */
	static class Node {
		int key;
		Node left, right;
		
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}
	
	static Node root;
	static Node temp = root;
	
	/**
	 * Prints a Binary Tree in Inorder fashion
	 * @param temp - The point of a three from 
	 * where the traversal starts
	 */
	static void printInorder(Node temp) {
		if(temp == null) {
			return;
		}
		
		printInorder(temp.left);
		System.out.println(temp.key + " ");
		printInorder(temp.right);
	}
	
	/**
	 * Insert a node at the right place.
	 * Tree tracersal is done using queues and
	 * traverse till it finds a node whole left
	 * or right child is empty, and insert at that
	 * empty spot
	 * @param temp - The point of a three from 
	 * where the traversal starts
	 * @param key - a node to insert in BT
	 */
	public static void insert(Node temp, int key) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp.left == null) {
				temp.left = new Node(key);
				break;
			} else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(key);
				break;
			} else {
				q.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        
        System.out.println("Tree nodes before insertion: ");
        printInorder(root);
        
        int key = 12;
        insert(root, key);
        
        System.out.println("Tree nodes after insertion: ");
        printInorder(root);

	}

}

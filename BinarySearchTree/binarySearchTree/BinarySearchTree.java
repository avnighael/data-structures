package binarySearchTree;

class Node {
	int key;
	Node left, right;
	
	Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class BinarySearchTree {
	Node root;
	
	BinarySearchTree() {
		root = null;
	}
	
	public void insert(int key) {
		root = insertUtil(root, key);
	}
	
	Node insertUtil(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insertUtil(root.left, key);
		} else if(key > root.key) {
			root.right = insertUtil(root.right, key);
		}
		
		return root;
	}
	
	public boolean search(int key) {
		return searchUtil(root, key);
	}
	
	public boolean searchUtil(Node root, int key) {
		if(root == null) {
			return false;
		}
		
		if(root.key == key) {
			return true;
		}
		
		if(root.key < key) {
			return searchUtil(root.right, key);
		} else if (root.key > key) {
			 return searchUtil(root.left, key);
		}
		return false;
	}
	
	public void printInorder() {
		inorderUtil(root);
	}
	
	public void inorderUtil(Node root) {
		if(root != null) {
			inorderUtil(root.left);
			System.out.println(root.key);
			inorderUtil(root.right);
			
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(70);
		bst.insert(40);
		bst.insert(80);
		bst.insert(60);
		bst.printInorder();
		
		System.out.println(bst.search(60));
	}

}

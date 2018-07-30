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
	
	/**
	 * Constructor
	 */
	BinarySearchTree() {
		root = null;
	}
	
	/**
	 * Insert key in BST fashion
	 * @param key - key to be inserted in BST
	 */
	public void insert(int key) {
		root = insertUtil(root, key);
	}
	
	/**
	 * Util function to insert key in BST
	 * @param root - parent of tree/subtree
	 * @param key - key to be inserted in BST
	 * @return - root node of BST
	 */
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
	
	/**
	 * Search for given key in BST
	 * @param key - key to be searched
	 * @return - boolean. true if key is found; false otherwise
	 */
	public boolean search(int key) {
		return searchUtil(root, key);
	}
	
	/**
	 * Util function to search for given key in BST
	 * @param root - parent node of tree/subtree
	 * @param key - key to be searched
	 * @return - boolean. true if key is found. false otherwise
	 */
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
	
	/**
	 * Delete a given key from BST
	 * @param key - a key to be deleted from BST
	 */
	public void delete(int key) {
		root = deleteUtil(root, key);
	}
	
	/**
	 * Util to delete the given key from BST
	 * @param root - parent of tree/subtree
	 * @param key - key to be deleted from BST
	 * @return - root node after deleting the given key
	 */
	Node deleteUtil(Node root, int key) {
		if(root == null) {
			return root;
		}
		
		if(key > root.key) {
			root.right = deleteUtil(root.right, key);
		} else if (key < root.key) {
			root.left = deleteUtil(root.left, key);
		} else {
			if(root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			
			root.key = minValue(root.right);
			
			root.right = deleteUtil(root.right, root.key);
		}
		return root;
	}
	
	/**
	 * finds the minimum value from the given parent of BST
	 * @param root - parent of tree/subtree
	 * @return - minimum value of the BST from given root node
	 */
	public int minValue(Node root) {
		int min = root.key;
		
		while(root.left != null) {
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
	
	/**
	 * Prints BST by iterating in Inorder fashion.
	 */
	public void printInorder() {
		inorderUtil(root);
	}
	
	/**
	 * Util function to print BST in Inorder fashion
	 * @param root - parent node of tree/subtree
	 */
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

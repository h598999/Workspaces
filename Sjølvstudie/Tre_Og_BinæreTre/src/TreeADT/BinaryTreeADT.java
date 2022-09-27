package TreeADT;

import TreePackage.BinaryNode;

public interface BinaryTreeADT<T> {
	
	/** 
	 * Sets this binary tree to a one node binary tree.
	 * @param rootData The object that is the data for the new tree`s root.
	 */
	public void setTree(T rootData);
	
	/**
	 * Sets this binary tree to a new binary tree
	 * @param rootData The object that is used as the trees new root
	 * @param leftTree The left subtree of the new tree
	 * @param rightTree The right subtree of the new tree
	 */

	public void setTree(T rootData, BinaryTreeADT<T> leftTree, BinaryTreeADT<T> rightTree);
	
	
	/**
	 * 
	 * @return false if the Tree is not empty, if else returns true
	 */
	public boolean isEmpty();
	
	/**
	 * Clears the tree, sets the root node to a null value
	 */
	public void clear();
	
	/**
	 * 
	 * @return the element of the root. Throws an exception if the tree is empty
	 */
	public T getRootData() throws Exception;
	
	/**
	 * sets the data of the root to rootData
	 * @param rootData
	 */
	public void setRootData(T rootData);
	
	/**
	 * sets the root node to the rootNode
	 * @param rootNode
	 */
	public void setRootNode(BinaryNode<T> rootNode);
	
	/**
	 * uses the method getHeight from the BinaryNode class on the root node
	 * @return the height of the tree
	 */
	public int getHeight();
	/**
	 * Uses the method getNumberOfNodes from the BinaryNode class on the root node
	 * @return the number of nodes in the tree
	 */
	
	public int getNumberOfNodes();
	
}

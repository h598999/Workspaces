package TreePackage;

import TreeADT.BinaryTreeADT;

public class BinaryTree<T> implements BinaryTreeADT<T> {
	
	
	private BinaryNode<T> root;
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(T rootdata) {
		root = new BinaryNode<>(rootdata);
	}
	
	public BinaryTree(T rootdata, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		
		privatesetTree(rootdata,leftTree,rightTree);
	}
	
	

	@Override
	public void setTree(T rootData) {
		root = new BinaryNode<>(rootData);
		
	}

	@Override
	public void setTree(T rootData, BinaryTreeADT<T> leftTree, BinaryTreeADT<T> rightTree) {
		privatesetTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
	}
	
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void clear() {
		root = null;
	}
	
	public T getRootData() throws Exception {
		if (isEmpty()) {
			throw new Exception();
		} else {
			return root.getData();
		}
	}
	
	public void setRootData(T rootData) {
		root.setData(rootData); 	
	}
	
	public void setRootNode(BinaryNode<T> rootNode) {
		root = rootNode;
	}
	
	public int getHeight() {
		return root.getHeight();
	}
	
	public int getNumberOfNodes() {
		return root.getNumberOfNodes();
	}
	
	
private void privatesetTree(T rootdata, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		
		root = new BinaryNode<>(rootdata);
		if ((leftTree != null)&& !leftTree.isEmpty()) {
			root.setLeftChild(leftTree.root);
		}
		if((rightTree != null) && !leftTree.isEmpty()) {
			if (rightTree != leftTree) 
				root.setRightChild(rightTree.root);
			else 
				root.setRightChild(rightTree.root.copy());
		}
		
		if ((leftTree != null) && (leftTree!= this)) {
			leftTree.clear();
		}
		
		if ((rightTree != null) && (rightTree != this)) {
			rightTree.clear();
		}
			
	}



		
}


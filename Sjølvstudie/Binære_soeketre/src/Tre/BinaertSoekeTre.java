package Tre;

import java.util.Iterator;

import ADT.BinaertSoekeTreADT;
import TreeADT.BinaryTreeADT;
import TreePackage.BinaryNode;
import TreePackage.BinaryTree;

public class BinaertSoekeTre<T extends Comparable<? super T>> 
extends BinaryTree<T>  
implements BinaertSoekeTreADT<T> {
	
	private BinaryNode<T> root;
	
	public BinaertSoekeTre() {
		super();
	}
	
	public BinaertSoekeTre(T rootEntry) {
		super();
		setRootNode(new BinaryNode<T>(rootEntry));
	}
	
	public void setTree(T rootData) {
		throw new UnsupportedOperationException();
	}
	
	public void setTree(T rootdata, BinaryTreeADT<T> leftTree, BinaryTreeADT<T> rightTree) {
		throw new UnsupportedOperationException();
	}
	
	public void setRootData(T data) {
		root.setData(data);
	}

	@Override
	public T getRootData() {
		return (root.getData());
	}

	@Override
	public int getHeight() {
		return root.getHeight();
	}

	@Override
	public int getNumberOfNodes() {
		return root.getNumberOfNodes();
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public void clear() {
		root = null;
		
	}

	@Override
	public boolean inneholder(T anEntry) {
	return getEntry(anEntry) != null;
	}

	@Override
	public T getEntry(T entry) {
		return findEntry(root, entry);
	}

	@Override
	public T add(T newEntry) {
		T result = null;
		if (isEmpty()) {
			setRootNode(new BinaryNode<T>(newEntry));
		} else {
			result = addEntry(getRootNode(), newEntry);
		}
		return result;
	}

	public void setRootNode(BinaryNode<T> newRoot) {
		root = newRoot;
	}
	
	public BinaryNode<T> getRootNode() {
		return root;
	}
	
	@Override
	public T remove(T entry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> getInorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private T findEntry(BinaryNode<T> rootNode, T entry) {
		T result = null;
		if (rootNode != null) {
			T rootEntry = rootNode.getData();
			if (entry.equals(rootEntry)) {
				result = rootEntry;
			}
			else if (entry.compareTo(rootEntry)<0) {
				result = findEntry(rootNode.getLeftChild(), entry);
			}
			else {
				result = findEntry(rootNode.getRightChild(), entry);
			}
		}
		return result;
	}
	
	private T addEntry(BinaryNode<T> rootNode, T entry) {
		assert rootNode != null;
		T result = null;
		int comparison = entry.compareTo(rootNode.getData());
		if (comparison == 0) {
			result = rootNode.getData();
			rootNode.setData(entry);
		}
		else if (comparison < 0) {
			if (rootNode.hasLeftChild()) {
				result = addEntry(rootNode.getLeftChild(), entry);
			} else {
				rootNode.setLeftChild(new BinaryNode<>(entry));
			}
		} else {
			if(rootNode.hasRightChild()) {
				result = addEntry(rootNode.getRightChild(), entry); 
			} else {
				rootNode.setRightChild(new BinaryNode<>(entry));
			}
		}
		return result;
	}


}

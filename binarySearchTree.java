class BinarySearchTree<E extends Comparable<E>> {
	protected Node<E> root;
	protected int size;
	protected boolean addReturn; 
	
	
	protected static class Node<E>{
		E data;
		Node <E> left;
		Node <E> right;
		
		public Node(E data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
      
    BinarySearchTree() {
    	root = null;
    }

	public boolean add(E item) {
		root = add(root, item);
		return addReturn;
	}

	private Node<E> add(Node<E> localRoot, E item) {
		if (localRoot == null) {
			addReturn = true;
			return new Node<E>(item);
		}
		else if (item.equals(localRoot)) {
			addReturn = false;
			return localRoot; 
		}
		else if (item.compareTo(localRoot.data) == 0) {
			localRoot.right = add(localRoot.right, item);
			return localRoot;
		}
		else if (item.compareTo(localRoot.data) < 0) {
			localRoot.left = add(localRoot.left, item); 
			return localRoot;
		}
		else {
			localRoot.right = add(localRoot.right, item);
			return localRoot;
		}
	}

    public void getSize() {
        size = getSize(root);
    }

    private int getSize(Node<E> root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }  
}



/**
 * Implements the add method (recursive) for a BST
 * 
 * @author mandyho
 * @verison oct 25
 */
public class myBinarySearchTree extends BinarySearchTree {

    public myBinarySearchTree() {
        root = null;
        size = 0;
    }

    /**
     * Public add method which will use recursive helper method to return true if
     * item successfully adds
     * 
     * @param item Item we want to add
     * @return True if add is successful
     */
    public boolean add(int item) {
        return root = add(root, item);

    }

    /**
     * Recursive helper method that will add an item by comparing current root and
     * item we want to add
     * 
     * @param initialroot Current root we are searching
     * @param item        Item we want to add
     * @return Item that is added
     */
    private Node add(Node initialroot, int item) {
        // creating a new node if our tree is empty
        if (initialroot == null) {
            return new Node(item);
            size++; // increasing size
        }

        int comp = item.compareTo(initialroot.data);
        // if our target matches the root, just return it
        if (comp == 0) {
            return initialroot;
        } // if our value is LESS THAN we will add onto the LEFT of our current root
        else if (comp < 0) {
            initialroot.left = add(initialroot.left, item);
            size++;
            return initialroot;
        } // else add onto right as value is LARGER than the current root
        else {
            initialroot.right = add(initialroot.right, item);
            size++;
            return initialroot;
        }
    }

}

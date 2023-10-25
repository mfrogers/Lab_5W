//Josh branch myTreeIterator

import java.util.List;
import java.util.ArrayList;

interface ITreeIterator {
    int[] SequenceArray(BinarySearchTree tree);
}

//myTreeIterator class implements the ITreeIterator interface.
class myTreeIterator implements ITreeIterator {
    
    //method that implements the SequenceArray method
    @Override
    public int[] SequenceArray(BinarySearchTree tree) {
        //this will hold temporarily hold the values of the tree
        List<Integer> infoList = new ArrayList<>();
        
        orderedTraversal(tree.root, infoList);
        
        //converts the list of ints into array to return
        return infoList.stream().mapToInt(i -> i).toArray();
    }

    //recursively performs in-order traversal on the tree.
    private void orderedTraversal(TreeNode node, List<Integer> list) {
        //base case
        if (node == null) {
            return;
        }
        //recursively goes to left subtree
        orderedTraversal(node.left, list);
        //add current node
        list.add(node.value);
        //recursively goes to right subtree
        orderedTraversal(node.right, list);
    }
}

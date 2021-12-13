package binary_tree;

public class BinaryTree implements BinaryTreeI{

    private final Node rootNode;
    private int index;
    private int numberOfElements;

    public BinaryTree(final int element){
        rootNode = new Node(element);
        numberOfElements = 1;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public void addElement(final int element){
        addNodeToTree(rootNode, element);
        numberOfElements++;
    }

    @Override
    public void addElements(int[] elements) {
        //Iterates over the array of ints and adds them individually
        for (int element: elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(final int value){
        Node node = findNode(value);
        return node != null;
    }

    @Override
    public int[] getSortedTreeAsc() {
        //Initialises an array with length equal to the number of elements in the binary tree
        int[] arr = new int[getNumberOfElements()];
        //Resets the index to store the elements
        resetIndex();
        return getSortedTreeAsc(rootNode,arr);
    }

    private int[] getSortedTreeAsc(Node node, int[] arr){
        //Checks for left node, then traverses to it and recurs
        if (!node.isLeftChildEmpty()){
            getSortedTreeAsc(node.getLeftChild(),arr);
        }
        //Inserts the value of the node to the array at the current index
        arr[getIndex()] = node.getValue();
        incIndex();
        //Checks for right node, then traverses to it and recurs
        if (!node.isRightChildEmpty()){
            getSortedTreeAsc(node.getRightChild(),arr);
        }
        return arr;
    }

    //Index for array for sorting the binary tree
    private void resetIndex(){
        index = 0;
    }

    private void incIndex(){
        index++;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int[] getSortedTreeDesc() {
        //Initialises an array with length equal to the number of elements in the binary tree
        int[] arr = new int[getNumberOfElements()];
        //Resets the index to store the elements
        resetIndex();
        return getSortedTreeDesc(rootNode,arr);
    }

    private int[] getSortedTreeDesc(Node node, int[] arr){
        //Checks for right node, then traverses to it and recurs
        if (!node.isRightChildEmpty()){
            getSortedTreeDesc(node.getRightChild(),arr);
        }
        //Inserts the value of the node to the array at the current index
        arr[getIndex()] = node.getValue();
        incIndex();
        //Checks for left node, then traverses to it and recurs
        if (!node.isLeftChildEmpty()){
            getSortedTreeDesc(node.getLeftChild(),arr);
        }
        return arr;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (findNode(element).getLeftChild() == null){
            throw new ChildNotFoundException("Error");
        }
        return findNode(element).getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException{
        if (findNode(element).getRightChild() == null){
            throw new ChildNotFoundException("Error");
        }
        return findNode(element).getRightChild().getValue();
    }

    private Node findNode(final int element){
        Node node = rootNode;
        while (node != null){
            //Checks if the element we are looking for is the value of the current node, then it returns it
            if (element == node.getValue()){
                return node;
            }
            //Checks if the element is less than the current node's value, then it traverses to the left node
            // Otherwise, it traverses to the right node
            if (element < node.getValue()){
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        //If the element is not in the binary tree, it returns null
        return null;
    }

    private void addNodeToTree(Node node, final int element){
        //Checks if the element is less than or equal to the current node's value, then examines the left node
        //Otherwise, examines the right node.
        if (element <= node.getValue()){
            //Checks if the left child node is empty, then adds a new node to the left child of the current node
            //Otherwise, traverses to the left node and recurs
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(),element);
            }
        } else if (element > node.getValue()){
            //Checks if the right child node is empty, then adds a new node to the right child of the current node
            //Otherwise, traverses to the right node and recurs
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(),element);
            }
        }
    }

}

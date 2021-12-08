package binary_tree;

public class BinaryTree implements BinaryTreeI{

    private final Node rootNode;
    private int index;

    public BinaryTree(final int element){
        rootNode = new Node(element);
    }
    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        int total = 1;
        return getNumberOfElements(rootNode,total);
    }

    private int getNumberOfElements(Node node, int total){
        if (!node.isLeftChildEmpty()){
            total++;
            getNumberOfElements(node.getLeftChild(),total);
        }
        if (!node.isRightChildEmpty()){
            total++;
            getNumberOfElements(node.getRightChild(),total);
        }
        return total;
    }

    @Override
    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int element: elements) {
            addNodeToTree(rootNode, element);
        }
    }

    @Override
    public boolean findElement(final int value){
        Node node = findNode(value);
        return node != null;
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] arr = new int[getNumberOfElements()];
        resetIndex();
        return getSortedTreeAsc(rootNode,arr);
    }

    private int[] getSortedTreeAsc(Node node, int[] arr){
        if (!node.isLeftChildEmpty()){
            getSortedTreeAsc(node.getLeftChild(),arr);
        }
        arr[getIndex()] = node.getValue();
        incIndex();
        if (!node.isRightChildEmpty()){
            getSortedTreeAsc(node.getRightChild(),arr);
        }
        return arr;
    }

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
        int[] arr = new int[getNumberOfElements()];
        resetIndex();
        return getSortedTreeDesc(rootNode,arr);
    }

    private int[] getSortedTreeDesc(Node node, int[] arr){
        if (!node.isRightChildEmpty()){
            getSortedTreeDesc(node.getRightChild(),arr);
        }
        arr[getIndex()] = node.getValue();
        incIndex();
        if (!node.isLeftChildEmpty()){
            getSortedTreeDesc(node.getLeftChild(),arr);
        }
        return arr;
    }

    private Node findNode(final int element){
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()){
                return node;
            }
            if (element < node.getValue()){
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void addNodeToTree(Node node, final int element){
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(),element);
            }
        } else if (element > node.getValue()){
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(),element);
            }
        }
    }

}

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
        Node node = rootNode;
        return getNumberOfElements(node,total);
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
        if (node != null){
            return true;
        }
        return false;
    }

    @Override
    public int[] getSortedTreeAsc() {
        Node node = rootNode;
        int[] arr = new int[getNumberOfElements()];
        resetIndex();
        return getSortedTreeAsc(node,arr,index);
    }

    private int[] getSortedTreeAsc(Node node, int[] arr, int index){
        if (!node.isLeftChildEmpty()){
            getSortedTreeAsc(node.getLeftChild(),arr,index);
        }
        arr[getIndex()] = node.getValue();
        incIndex();
        if (!node.isRightChildEmpty()){
            getSortedTreeAsc(node.getRightChild(),arr,index);
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
        return new int[0];
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

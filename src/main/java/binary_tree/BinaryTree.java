package binary_tree;

public class BinaryTree implements BinaryTreeI{

    private final Node rootNode;

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
        if (!node.isLeftChildEmpty()){

        }
        return 0;
    }

    @Override
    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {

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
        return new int[0];
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

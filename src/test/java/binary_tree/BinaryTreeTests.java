package binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTests {

    BinaryTree binaryTree;


    @Test
    public void getRootElementTest(){
        binaryTree = new BinaryTree(5);
        assertEquals(5,binaryTree.getRootElement());
    }

    @Test
    public void getNumberOfElementsTest(){
        binaryTree = new BinaryTree(5);
        binaryTree.addElements(new int[] {9,3});
        assertEquals(3,binaryTree.getNumberOfElements());
    }

    @Test
    public void addElementTest(){
        binaryTree = new BinaryTree(5);
        binaryTree.addElement(9);
        binaryTree.addElement(3);
        assertEquals(true,binaryTree.findElement(9));
    }

    @Test
    public void addElementsTest(){
        binaryTree = new BinaryTree(5);
        binaryTree.addElements(new int[] {9,3});
        assertEquals(true,binaryTree.findElement(9));
    }

    @Test
    public void getSortedTreeAscTest(){

    }

    @Test
    public void getSortedTreeDescTest(){

    }

}

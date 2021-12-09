package binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTests {

    BinaryTree binaryTree;

    @BeforeEach
    public void setup() {
        binaryTree = new BinaryTree(5);
        binaryTree.addElements(new int[]{9, 3});
    }

    @Nested
    @DisplayName("JUnit tests")
    class JUnitTests {

        @Test
        @DisplayName("Get root element test")
        public void getRootElementTest() {
            assertEquals(5, binaryTree.getRootElement());
        }

        @Test
        @DisplayName("Get number of elements test")
        public void getNumberOfElementsTest() {
            assertEquals(3, binaryTree.getNumberOfElements());
        }

        @Test
        @DisplayName("Find element test")
        public void findElementTest() {
            assertEquals(true, binaryTree.findElement(9));
        }

        @Test
        @DisplayName("Get the tree in an ascending order")
        public void getSortedTreeAscTest() {
            assertArrayEquals(new int[]{3, 5, 9}, binaryTree.getSortedTreeAsc());
        }

        @Test
        @DisplayName("Get the tree in an descending order")
        public void getSortedTreeDescTest() {
            assertArrayEquals(new int[]{9, 5, 3}, binaryTree.getSortedTreeDesc());
        }

        @Test
        @DisplayName("Get the left child of a given element")
        public void getLeftChildTest() throws ChildNotFoundException {
            assertEquals(3,binaryTree.getLeftChild(5));
        }

        @Test
        @DisplayName("Get the right child of a given element")
        public void getRightChildTest() throws ChildNotFoundException {
            assertEquals(9,binaryTree.getRightChild(5));
        }

        @Test
        @DisplayName("Asserts that getLeftChild will throw ChildNotFoundException")
        public void getLeftChildExceptionTest() {
            assertThrows(ChildNotFoundException.class, () -> binaryTree.getLeftChild(9));
        }

        @Test
        @DisplayName("Asserts that getRightChild will throw ChildNotFoundException")
        public void getRightChildExceptionTest() {
            assertThrows(ChildNotFoundException.class, () -> binaryTree.getRightChild(9));
        }

    }

    @Nested
    @DisplayName("Hamcrest tests")
    class HamcrestTests {

        @Test
        @DisplayName("Get root element test")
        public void getRootElementTest() {
            assertThat(binaryTree.getRootElement(), equalTo(5));

        }

        @Test
        @DisplayName("Get number of elements test")
        public void getNumberOfElementsTest() {
            assertThat(binaryTree.getNumberOfElements(), equalTo(3));
        }

        @Test
        @DisplayName("Find element test")
        public void findElementTest() {
            assertThat(binaryTree.findElement(9), equalTo(true));
        }

        @Test
        @DisplayName("Get the tree in an ascending order")
        public void getSortedTreeAscTest() {
            assertThat(binaryTree.getSortedTreeAsc(), equalTo(new int[]{3, 5, 9}));
        }

        @Test
        @DisplayName("Get the tree in an descending order")
        public void getSortedTreeDescTest() {
            assertThat(binaryTree.getSortedTreeDesc(), equalTo(new int[]{9, 5, 3}));
        }

        @Test
        @DisplayName("Get the left child of a given element")
        public void getLeftChildTest() throws ChildNotFoundException {
            assertThat(binaryTree.getLeftChild(5),equalTo(3));
        }

        @Test
        @DisplayName("Get the right child of a given element")
        public void getRightChildTest() throws ChildNotFoundException {
            assertThat(binaryTree.getRightChild(5),equalTo(9));
        }

    }

}

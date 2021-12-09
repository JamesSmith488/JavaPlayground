package binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
    class junitTests {

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

    }

    @Nested
    @DisplayName("Hamcrest tests")
    class hamcrestTests {

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
            //assertArrayEquals(new int[]{3, 5, 9}, binaryTree.getSortedTreeAsc());
            assertThat(binaryTree.getSortedTreeAsc(), equalTo(new int[]{3, 5, 9}));
        }

        @Test
        @DisplayName("Get the tree in an descending order")
        public void getSortedTreeDescTest() {
            //assertArrayEquals(new int[]{9, 5, 3}, binaryTree.getSortedTreeDesc());
            assertThat(binaryTree.getSortedTreeDesc(), equalTo(new int[]{9, 5, 3}));
        }

    }

}

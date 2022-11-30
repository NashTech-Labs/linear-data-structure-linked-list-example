package org.knoldus.linkedList.example.doubly;

import org.junit.Test;

public class CreateDoublyLinkedListTest {
    /**
     * Method under test: {@link CreateDoublyLinkedList#addFirst(Object)}
     */
    @Test
    public void testAddFirst() {
        // TODO: Complete this test.

        (new CreateDoublyLinkedList<>()).addFirst("Element");
    }

    /**
     * Method under test: {@link CreateDoublyLinkedList#addFirst(Object)}
     */
    @Test
    public void testAddFirst2() {
        // TODO: Complete this test.

        CreateDoublyLinkedList<Object> createDoublyLinkedList = new CreateDoublyLinkedList<>();
        createDoublyLinkedList.addFirst("Element");
        createDoublyLinkedList.addFirst("Element");
    }

    /**
     * Method under test: default or parameterless constructor of {@link CreateDoublyLinkedList}
     */
    @Test
    public void testConstructor() {
        // TODO: Complete this test.
        //   Add getters for the following fields or make them package-private:
        //     CreateDoublyLinkedList.head
        //     CreateDoublyLinkedList.size
        //     CreateDoublyLinkedList.tail

        new CreateDoublyLinkedList<>();
    }
}


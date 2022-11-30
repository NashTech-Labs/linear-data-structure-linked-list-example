package org.knoldus.linkedList.example.doubly;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class NodeTest {
    /**
     * Method under test: {@link Node#Node(Object, Node, Node)}
     */
    @Test
    public void testConstructor() {
        Node<Object> next = new Node<>("Element", null, null);

        Node<Object> node = new Node<>("Element", next, new Node<>("Element", null, null));

        Node<Object> next1 = new Node<>("Element", null, null);

        Node<Object> node1 = new Node<>("Element", next1, new Node<>("Element", null, null));

        Node<Object> node2 = new Node<>("Element", node, node1);

        Node<Object> next2 = new Node<>("Element", null, null);

        Node<Object> node3 = new Node<>("Element", next2, new Node<>("Element", null, null));

        Node<Object> next3 = new Node<>("Element", null, null);

        Node<Object> node4 = new Node<>("Element", next3, new Node<>("Element", null, null));

        Node<Object> node5 = new Node<>("Element", node3, node4);

        Node<Object> node6 = new Node<>("Element", node2, node5);

        Node<Object> next4 = new Node<>("Element", null, null);

        Node<Object> node7 = new Node<>("Element", next4, new Node<>("Element", null, null));

        Node<Object> next5 = new Node<>("Element", null, null);

        Node<Object> node8 = new Node<>("Element", next5, new Node<>("Element", null, null));

        Node<Object> node9 = new Node<>("Element", node7, node8);

        Node<Object> next6 = new Node<>("Element", null, null);

        Node<Object> node10 = new Node<>("Element", next6, new Node<>("Element", null, null));

        Node<Object> next7 = new Node<>("Element", null, null);

        Node<Object> node11 = new Node<>("Element", next7, new Node<>("Element", null, null));

        Node<Object> node12 = new Node<>("Element", node10, node11);

        Node<Object> node13 = new Node<>("Element", node9, node12);

        Node<Object> actualNode = new Node<>("Element", node6, node13);

        Object object = actualNode.element;
        assertEquals("Element", object);
        Node<Object> node14 = actualNode.prev;
        Node<Object> node15 = node14.prev;
        assertSame(node13.prev, node15);
        Node<Object> node16 = actualNode.next;
        Node<Object> node17 = node16.prev;
        assertSame(node6.prev, node17);
        assertSame(object, node14.element);
        assertSame(object, node16.element);
        Node<Object> node18 = node16.next;
        assertSame(node6.next, node18);
        Node<Object> node19 = node14.next;
        assertSame(node13.next, node19);
        Node<Object> node20 = node18.prev;
        assertSame(node2.prev, node20);
        Node<Object> node21 = node19.prev;
        assertSame(node9.prev, node21);
        Node<Object> node22 = node17.next;
        assertSame(node5.next, node22);
        Node<Object> node23 = node15.prev;
        assertSame(node12.prev, node23);
        assertSame(object, node18.element);
        Node<Object> node24 = node18.next;
        assertSame(node2.next, node24);
        Node<Object> node25 = node17.prev;
        assertSame(node5.prev, node25);
        assertSame(object, node19.element);
        Node<Object> node26 = node19.next;
        assertSame(node9.next, node26);
        assertSame(object, node17.element);
        assertSame(object, node15.element);
        Node<Object> node27 = node15.next;
        assertSame(node12.next, node27);
        assertSame(object, node26.element);
        Node<Object> node28 = node27.prev;
        assertSame(node10.prev, node28);
        Node<Object> node29 = node27.next;
        assertSame(node10.next, node29);
        Node<Object> node30 = node25.prev;
        assertSame(node4.prev, node30);
        Node<Object> node31 = node22.prev;
        assertSame(node3.prev, node31);
        Node<Object> node32 = node20.prev;
        assertSame(node1.prev, node32);
        assertSame(object, node22.element);
        Node<Object> node33 = node22.next;
        assertSame(node3.next, node33);
        Node<Object> node34 = node21.prev;
        assertSame(node8.prev, node34);
        assertSame(object, node23.element);
        assertSame(object, node24.element);
        Node<Object> node35 = node24.prev;
        assertSame(node.prev, node35);
        Node<Object> node36 = node23.prev;
        assertSame(node11.prev, node36);
        Node<Object> node37 = node24.next;
        assertSame(node.next, node37);
        assertSame(object, node25.element);
        Node<Object> node38 = node23.next;
        assertSame(node11.next, node38);
        assertSame(object, node27.element);
        Node<Object> node39 = node26.next;
        assertSame(node7.next, node39);
        Node<Object> node40 = node25.next;
        assertSame(node4.next, node40);
        assertSame(object, node20.element);
        Node<Object> node41 = node20.next;
        assertSame(node1.next, node41);
        Node<Object> node42 = node26.prev;
        assertSame(node7.prev, node42);
        assertSame(object, node21.element);
        Node<Object> node43 = node21.next;
        assertSame(node8.next, node43);
        assertNull(node42.next);
        assertNull(node43.prev);
        assertNull(node43.next);
        assertSame(object, node43.element);
        assertSame(object, node42.element);
        assertNull(node41.next);
        assertSame(object, node41.element);
        assertSame(object, node40.element);
        assertNull(node39.next);
        assertSame(object, node39.element);
        assertSame(object, node38.element);
        assertSame(object, node37.element);
        assertNull(node36.next);
        assertSame(object, node36.element);
        assertNull(node35.next);
        assertSame(object, node35.element);
        assertNull(node33.next);
        assertSame(object, node33.element);
        assertSame(object, node32.element);
        assertNull(node31.next);
        assertSame(object, node31.element);
        assertNull(node30.next);
        assertSame(object, node30.element);
        assertNull(node29.next);
        assertSame(object, node29.element);
        assertNull(node28.next);
        assertSame(object, node28.element);
        assertNull(node35.prev);
        assertNull(node34.next);
        assertNull(node34.prev);
        assertNull(node32.prev);
        assertNull(node31.prev);
        assertNull(node29.prev);
        assertNull(node28.prev);
        assertNull(node40.next);
        assertNull(node40.prev);
        assertNull(node38.next);
        assertNull(node38.prev);
        assertNull(node36.prev);
        assertSame(object, node34.element);
        assertNull(node32.next);
        assertNull(node30.prev);
        assertNull(node41.prev);
        assertNull(node39.prev);
        assertNull(node37.prev);
        assertNull(node33.prev);
        assertNull(node42.prev);
        assertNull(node37.next);
    }
}


package org.testing;

import org.lab2.queue.Queue;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QueueTest {

    private Queue<Integer> queue;

    @BeforeEach
    public void setUp() {
        this.queue = new Queue<Integer>();
    }
    @AfterEach
    public void tearDown() {
        this.queue = null;
    }

    @Test
    @Order(1)

    public void testsIsQueueEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    @Order(2)
    public void testsSize() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2,this.queue.getSize());
    }
}

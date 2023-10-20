package com.poltarabatko.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing the ArrayContainer implementation
 */
public class ContainerTest {
    private Container<Integer> container;

    @BeforeEach
    void setUp() {
        container = new Container<>();
    }

    @Test
    void testAdd() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(3, container.size());
    }

    @Test
    void testGet() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(1, container.get(0).intValue());
        assertEquals(2, container.get(1).intValue());
        assertEquals(3, container.get(2).intValue());
    }

    @Test
    void testRemove() {
        container.add(1);
        container.add(2);
        container.add(3);
        container.remove(1);
        assertEquals(2, container.size());
        assertEquals(1, container.get(0).intValue());
        assertEquals(3, container.get(1).intValue());
    }

    @Test
    void testSize() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(3, container.size());
    }
}
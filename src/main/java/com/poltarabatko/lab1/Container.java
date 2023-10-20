package com.poltarabatko.lab1;
import java.util.Arrays;

/**
 * Container
 * @author r.poltarabatko
 */

public class Container<T> {
    private Object[] elements;
    private int size;

    public Container() {
        elements = new Object[10];
        size = 0;
    }

    /**
     * Adds an element to the container.
     *
     * @param item The element to add.
     */
    public void add(T item) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = item;
        size++;
    }

    /**
     * Retrieves an element by index.
     * @param index The index of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return (T) elements[index];
    }

    /**
     * Removes an element by index.
     * @param index The index of the element to remove.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements[size] = null; // Clear the last element
    }

    /**
     * Returns the size of the container.
     *
     * @return The size of the container.
     */
    public int size() {
        return size;
    }

}

package model.data_structures;

// -------------------------------------------------------------
// Imports
// -------------------------------------------------------------

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Custom iterator for the dynamic array.
 *
 * @param <T> Generic type.
 */
public class DinamicArrayIterator<T extends Comparable<T>> implements Iterator {
    // -------------------------------------------------------------
    // Attributes
    // -------------------------------------------------------------

    /**
     * A dynamic array.
     */
    private DinamicArray<T> array;

    /**
     * Pointer to the current item.
     */
    private int currentPointer;

    /**
     * Pointer to the previous item.
     */
    private int previousPointer;

    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    DinamicArrayIterator(DinamicArray<T> pArray) {
        array = pArray;
        currentPointer = 0;
        previousPointer = currentPointer;
    }

    // -------------------------------------------------------------
    // Methods
    // -------------------------------------------------------------

    /**
     * Checks if the array has a next item.
     *
     * @return True if the array has a next item, false if otherwise.
     */
    @Override
    public boolean hasNext() {
        return currentPointer < array.size();
    }

    /**
     * Checks if the array has a previous item.
     *
     * @return True if the array has a previous item, false if otherwise.
     */
    public boolean hasPrevious() {
        return currentPointer != 0;
    }

    /**
     * Returns the next item in the array.
     *
     * @return Next item.
     */
    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException("Element does not exist!");
        T value = array.get(currentPointer);
        previousPointer = currentPointer;
        currentPointer++;
        return value;
    }

    /**
     * Returns the previous item in the array without changing pointers.
     *
     * @return Previous item.
     */
    public T getPrevious() {
        T previous;
        if (!hasPrevious())
            previous = null;
        else
            previous = array.get(previousPointer);
        return previous;
    }
}

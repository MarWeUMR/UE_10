package Eratosthenes;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
import java.util.NoSuchElementException;

public class Iterator<E> implements java.util.Iterator<Integer> {

    private List<Integer> list = new ArrayList<>(); // Iterable List
    private int size; // length field
    private int currentPositon = 0; // current element


    /**
     * Constructor of the iterator instance. Generates a List field of Integers
     *
     * @param lowerBound smallest element of the list
     * @param upperBound largest element of the list
     */
    public Iterator(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            list.add(i);
        }

        this.size = list.size();
    }

    public void setCurrentPositon(int n) {
        this.currentPositon = n;
    }

    public int getCurrentPosition() {
        return this.currentPositon;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isTail() {
        return (currentPositon + 1 == size);
    }

    /**
     * Getter for the List field
     *
     * @return whole list
     */
    public List<Integer> getSequence() {
        return list;
    }

    /**
     * Getter for current element
     *
     * @return current element
     */
    public Integer get() {
        return list.get(currentPositon);
    }

    @Override
    public void remove() {
        list.remove(currentPositon);
        this.size = list.size();
    }

    @Override
    public boolean hasNext() {
        return (currentPositon < size - 1);
    }

    @Override
    public Integer next() {

        if (hasNext()) {
            int i = list.get(currentPositon + 1);
            currentPositon += 1;
            return i;
        } else {
            currentPositon = 0;
            return null;
        }
    }
}

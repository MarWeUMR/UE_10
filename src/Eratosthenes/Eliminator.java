package Eratosthenes;

import java.util.List;

public class Eliminator<E> implements java.util.Iterator<Integer> {

    private Iterator<Integer> it;
    private int n;

    /**
     * Constructor for an eliminator instance.
     *
     * @param n  integer to check
     * @param it iterator instance to perform manipulation on
     */
    public Eliminator(int n, Iterator<Integer> it) {
        this.it = it;
        this.it.setCurrentPositon(0);
        this.n = n;
    }

    /**
     * Method to filter the current state of the integer list.
     * Compares the list entries accordingly to the sieving rule and removes them if neccessary.
     */
    public void filter() {

        while (it.hasNext() || it.isTail()) {
            int current = it.get();
            if ((current % this.n == 0) && (current >= Math.pow(this.n, 2))) {
                it.remove();
                if (it.isTail()) {
                    break;
                }
            } else {
                if (it.isTail()) {
                    break;
                } else {
                    it.next();
                }
            }
        }
    }

    /**
     * Method to return the current list
     *
     * @return returns list
     */
    public List<Integer> getSequence() {
        return this.it.getSequence();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}

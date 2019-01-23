package Eratosthenes;

import java.util.List;

public class Sieve implements java.util.Iterator<Integer> {

    Iterator<Integer> it;
    int upper;
    int lower;

    /**
     * Constructor for sieving class.
     *
     * @param lower lower bound of the list
     * @param upper upper bound of the list
     */
    public Sieve(int lower, int upper) {
        this.it = new Iterator<>(lower, upper);
        this.upper = upper;
        this.lower = lower;
    }

    /**
     * Method to return the current instance of the integer list
     *
     * @return pointer to the list
     */
    public List<Integer> getSequence() {
        return it.getSequence();
    }

    /**
     * Method to initiate an eliminator instance for every integer.
     */
    public void sieving() {
        for (int i = lower; i <= Math.sqrt(upper); i++) {
            Eliminator<Integer> e = new Eliminator<>(i, it);
            e.filter();
        }
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

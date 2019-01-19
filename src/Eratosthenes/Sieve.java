package Eratosthenes;

import java.util.List;

public class Sieve implements java.util.Iterator<Integer> {

    Iterator<Integer> it;
    int upper;
    int lower;

    public Sieve(int lower, int upper) {
        this.it = new Iterator<>(lower, upper);
        this.upper = upper;
        this.lower = lower;
    }

    public List<Integer> getSequence() {
        return it.getSequence();
    }

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

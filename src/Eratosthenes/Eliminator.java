package Eratosthenes;

import java.util.List;

public class Eliminator<E> implements java.util.Iterator<Integer> {

    private Iterator<Integer> it;
    private int n;

    public Eliminator(int n, Iterator<Integer> it) {
        this.it = it;
        this.it.setCurrentPositon(0);
        this.n = n;

    }

    public void filter() {

        while (it.hasNext() || it.isTail()) {
            int current = it.get();
            if ((current % this.n == 0) && (current >= Math.pow(this.n, 2))) {
                it.remove();
//                it.next();
            } else {
                it.next();
            }
        }
    }

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

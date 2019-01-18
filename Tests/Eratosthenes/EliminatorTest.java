package Eratosthenes;

import org.junit.Test;

import static org.junit.Assert.*;

public class EliminatorTest {

    @Test
    public void filterTest() {

        Iterator<Integer> it = new Iterator<>(2, 100);
        Eliminator<Integer> terminator = new Eliminator<>(2, it);

        terminator.filter();

        for (Integer i : terminator.getSequence()) {
            System.out.println(i);
        }

    }
}
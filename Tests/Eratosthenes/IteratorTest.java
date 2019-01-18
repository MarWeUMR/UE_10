package Eratosthenes;

import org.junit.Test;

import static org.junit.Assert.*;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        Iterator<Integer> it = new Iterator<>(2, 100);

        System.out.println(it.get());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

    }


}
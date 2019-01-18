package Eratosthenes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SieveTest {

    @Test
    public void sievingTest() {
        Sieve s = new Sieve(2, 100);
        s.sieving();
    }
}
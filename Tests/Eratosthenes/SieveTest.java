package Eratosthenes;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SieveTest {

    @Test
    public void sievingTest() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

        Sieve s = new Sieve(2, 100); // create search parameter
        s.sieving(); // remove non primes

        List<Integer> actual = s.getSequence();

        Assert.assertEquals(expected, actual);

    }
}
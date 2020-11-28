package edu.epam.array.utility;

import edu.epam.array.entity.NumberArrayWrapper;
import edu.epam.array.exception.NumberArrayException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class NumberArrayUtilityTest {
    public NumberArrayWrapper array;
    public NumberArrayWrapper sortedArray;
    public NumberArrayWrapper fibonacciArray;
    NumberArrayUtility numberArrayUtility = new NumberArrayUtility();

    @BeforeMethod
    public void setUp() {
        sortedArray = new NumberArrayWrapper(30, 31, 32, 33, 35, 37);
        array = new NumberArrayWrapper(30, 31, 35, 33, 32);
        fibonacciArray = new NumberArrayWrapper(5, 4, 13, 89, 100);
    }

    @Test
    public void testMax() throws NumberArrayException {
        int expected = 35;
        int actual = numberArrayUtility.max(array);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMin() throws NumberArrayException {
        int expected = 30;
        int actual = numberArrayUtility.min(array);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAllPrimeNumbers() throws NumberArrayException {
        List<Integer> actual = numberArrayUtility.allPrimeNumbers(array);
        List<Integer> expected = Arrays.asList(31);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAllFibonacciNumbers() throws NumberArrayException {
        List<Integer> actual = numberArrayUtility.allFibonacciNumbers(fibonacciArray);
        List<Integer> expected = Arrays.asList(5, 13, 89);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAllNumbersUniqueDigits() throws NumberArrayException {
        List<Integer> actual = numberArrayUtility.allNumbersUniqueDigits(sortedArray);
        List<Integer> expected = Arrays.asList(30, 31, 32, 35, 37);
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        array = null;
        sortedArray = null;
        fibonacciArray = null;
    }
}
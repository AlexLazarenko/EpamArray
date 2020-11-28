package edu.epam.array.service;

import edu.epam.array.entity.NumberArrayWrapper;
import edu.epam.array.exception.NumberArrayException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberSortServiceTest {
    public NumberArrayWrapper actual;
    public NumberArrayWrapper expected;
    NumberSortService sortService = new NumberSortService();

    @BeforeMethod
    public void setUp() {
        actual = new NumberArrayWrapper(31, 32, 30);
        expected = new NumberArrayWrapper(30, 31, 32);
    }

    @Test
    public void testBubbleSort() throws NumberArrayException {
        sortService.bubbleSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() throws NumberArrayException {
        sortService.insertionSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() throws NumberArrayException {
        sortService.selectionSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        actual = null;
        expected = null;
    }
}
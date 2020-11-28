package edu.epam.array.service;

import edu.epam.array.entity.NumberArrayWrapper;
import edu.epam.array.exception.NumberArrayException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchServiceTest {

    public NumberArrayWrapper sortedArray;
    SearchService searchService = new SearchService();

    @BeforeMethod
    public void setUp() {
        sortedArray = new NumberArrayWrapper(30, 31, 32, 33, 35, 37);
    }

    @Test
    public void testBinarySearch() throws NumberArrayException {
        int number = 35;
        int expected = 4;
        int actual = searchService.binarySearch(sortedArray, number);
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        sortedArray = null;
    }
}
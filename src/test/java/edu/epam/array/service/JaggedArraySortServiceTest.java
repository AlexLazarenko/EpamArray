package edu.epam.array.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JaggedArraySortServiceTest {
    JaggedArraySortService jaggedArraySortService = new JaggedArraySortService();
    int[][] jaggedArray;

    @BeforeMethod
    public void setUp() {
        jaggedArray = new int[][]{{2, 5, 7, 9}, {0, 7, 3}, {6, 5, 1}};
    }

    @Test
    public void testSortByMin() {
        jaggedArraySortService.sortByMin(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{0, 7, 3}, {6, 5, 1}, {2, 5, 7, 9}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMinDesc() {
        jaggedArraySortService.sortByMinDesc(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{2, 5, 7, 9}, {6, 5, 1}, {0, 7, 3}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMax() {
        jaggedArraySortService.sortByMax(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{6, 5, 1}, {0, 7, 3}, {2, 5, 7, 9}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortByMaxDesc() {
        jaggedArraySortService.sortByMaxDesc(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{2, 5, 7, 9}, {0, 7, 3}, {6, 5, 1}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortBySum() {
        jaggedArraySortService.sortBySum(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{0, 7, 3}, {6, 5, 1}, {2, 5, 7, 9}};

        assertEquals(actual, expected);
    }

    @Test
    public void testSortBySumDesc() {
        jaggedArraySortService.sortBySumDesc(jaggedArray);
        int[][] actual = jaggedArray;
        int[][] expected = {{2, 5, 7, 9}, {6, 5, 1}, {0, 7, 3}};

        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        jaggedArray = null;
    }

}
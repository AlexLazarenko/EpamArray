package edu.epam.array.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class JaggedArraySortService {
    private static final Logger logger = LogManager.getLogger(JaggedArraySortService.class);

    public void sortBySum(int[][] jaggedArray) {
        Comparator<int[]> comparator = Comparator.comparingInt(this::findSum);
        sort(jaggedArray, comparator);
        logger.info("Jagged arrays sorted by ascending sum of elements in lines");
    }

    public void sortBySumDesc(int[][] jaggedArray) {
        Comparator<int[]> comparator = ((array1, array2) -> findSum(array2) - findSum(array1));
        sort(jaggedArray, comparator);
        logger.info("Jagged arrays sorted by descending sum of elements in lines");
    }

    public void sortByMax(int[][] jaggedArray) {
        Comparator<int[]> comparator = Comparator.comparingInt(this::findMax);
        sort(jaggedArray, comparator);
        logger.info("Jagged arrays sorted by ascending max elements");
    }

    public void sortByMaxDesc(int[][] jaggedArray) {
        Comparator<int[]> comparator = ((array1, array2) -> findMax(array2) - findMax(array1));
        sort(jaggedArray, comparator);
        logger.info("Jagged arrays sorted by descending max elements");
    }

    public void sortByMin(int[][] jaggedArray) {
        Comparator<int[]> comparator = Comparator.comparingInt(this::findMin);
        sort(jaggedArray, comparator);
        logger.info("Jagged arrays sorted by ascending min elements");
    }

    public void sortByMinDesc(int[][] jaggedArray) {
        Comparator<int[]> comparator = ((array1, array2) -> findMin(array2) - findMin(array1));
        sort(jaggedArray, comparator);
        logger.info("Jagged arrays sorted by descending min elements");
    }

    private void sort(int[][] jaggedArray, Comparator<int[]> comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < jaggedArray.length - 1; i++) {
                if (comparator.compare(jaggedArray[i], jaggedArray[i + 1]) > 0) {
                    isSorted = false;
                    swap(jaggedArray, i, i + 1);
                }
            }
        }
    }

    private int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    private int findSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    private void swap(int[][] jaggedArray, int index1, int index2) {
        int[] temp = jaggedArray[index1];
        jaggedArray[index1] = jaggedArray[index2];
        jaggedArray[index2] = temp;
    }
}

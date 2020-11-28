package edu.epam.array.utility;

import edu.epam.array.entity.NumberArrayWrapper;
import edu.epam.array.exception.NumberArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class NumberArrayUtility {
    private static final Logger logger = LogManager.getLogger(NumberArrayUtility.class);

    public int max(NumberArrayWrapper array) throws NumberArrayException {
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        logger.info("Max element is " + max);
        return max;
    }

    public int min(NumberArrayWrapper array) throws NumberArrayException {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }
        logger.info("Min element is " + min);
        return min;
    }

    public List<Integer> allPrimeNumbers(NumberArrayWrapper array) throws NumberArrayException {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (isPrime(array.get(i))) {
                primeNumbers.add(array.get(i));
            }
        }
        logger.info("Prime numbers is " + primeNumbers);
        return primeNumbers;
    }

    public boolean isPrime(int number) {
        boolean flag = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isFibonacci(int number) {
        boolean flag = false;
        if (Math.sqrt(5 * (number * number) - 4) % 1 == 0 || Math.sqrt(5 * (number * number) + 4) % 1 == 0) {
            flag = true;
        }
        return flag;
    }

    public List<Integer> allFibonacciNumbers(NumberArrayWrapper array) throws NumberArrayException {
        List<Integer> fibonacciNumber = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (isFibonacci(array.get(i))) {
                fibonacciNumber.add(array.get(i));
            }
        }
        logger.info("Fibonacci numbers is " + fibonacciNumber);
        return fibonacciNumber;
    }

    public boolean HasNoSameDigits(int number) {
        boolean flag = true;
        int[] array = new int[10];
        while (number > 0) {
            int digit = number % 10;
            if (array[digit] > 0) {
                flag = false;
                break;
            }
            array[digit]++;
            number = number / 10;
        }
        return flag;
    }

    public List<Integer> allNumbersUniqueDigits(NumberArrayWrapper array) throws NumberArrayException {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (HasNoSameDigits(array.get(i))) {
                uniqueNumbers.add(array.get(i));
            }
        }
        logger.info("All numbers with unique digits is " + uniqueNumbers);
        return uniqueNumbers;
    }
}

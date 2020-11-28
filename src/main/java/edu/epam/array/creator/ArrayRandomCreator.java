package edu.epam.array.creator;

import edu.epam.array.entity.NumberArrayWrapper;
import edu.epam.array.exception.NumberArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class ArrayRandomCreator {
    private static final Logger logger = LogManager.getLogger(ArrayRandomCreator.class);
    private static final Random rand = new Random();
    private static final int DEFAULT_MAX = 1000;

    public NumberArrayWrapper createArray(int size, int range) throws NumberArrayException {
        NumberArrayWrapper numberArray = new NumberArrayWrapper();
        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(range);
            numberArray.set(i, number);
        }
        logger.info("Array with random numbers was created");
        return numberArray;
    }

    public NumberArrayWrapper createArray(int size) throws NumberArrayException {
        return createArray(size, DEFAULT_MAX);
    }
}

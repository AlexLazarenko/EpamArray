package edu.epam.array.service;

import edu.epam.array.entity.NumberArrayWrapper;
import edu.epam.array.exception.NumberArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchService {
    private static final Logger logger = LogManager.getLogger(SearchService.class);

    public int binarySearch(NumberArrayWrapper array, int key, int low, int high) throws NumberArrayException {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) < key) {
                low = mid + 1;
            } else if (array.get(mid) > key) {
                high = mid - 1;
            } else if (array.get(mid) == key) {
                index = mid;
                break;
            }
        }
        logger.info("binarySearch result is " + index);
        return index;
    }

    public int binarySearch(NumberArrayWrapper array, int key) throws NumberArrayException {
        return binarySearch(array, key, 0, array.size() - 1);
    }
}

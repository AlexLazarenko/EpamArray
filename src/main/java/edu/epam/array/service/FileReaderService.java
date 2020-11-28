package edu.epam.array.service;

import edu.epam.array.utility.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    private static final Logger logger = LogManager.getLogger(FileReaderService.class);

    public List<String> readFromFile(String dir) {
        ArrayList<String> lines = new ArrayList<>();
        File file = new File(PropertiesLoader.getProperty(dir));
        try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr)) {
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            logger.error(e);
        }
        logger.info("String array with lines from file: " + lines);
        return lines;
    }

    public List<Integer> numbersFromFile(List<String> lines) {
        List<Integer> numberArray = new ArrayList<>();
        for (String line : lines) {
            String[] numbers = line.split("\\s+");
            for (String number : numbers) {
                if (number.matches("\\d+$")) {
                    int num = Integer.parseInt(number);
                    numberArray.add(num);
                }
            }
        }
        logger.info("Integer array from file: " + numberArray);
        return numberArray;
    }
}

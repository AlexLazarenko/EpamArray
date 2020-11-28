package edu.epam.array.service;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class FileReaderServiceTest {
    @Test
    public void testNumbersFromFile() {
        FileReaderService readerService = new FileReaderService();
        List<String> list = readerService.readFromFile("testFile.dir");
        List<Integer> actual = readerService.numbersFromFile(list);
        List<Integer> expected = Arrays.asList(57, 35, 77, 22, 31, 77, 88, 22, 1);
        assertEquals(actual, expected);
    }
}
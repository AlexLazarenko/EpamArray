package edu.epam.array.entity;

import edu.epam.array.exception.NumberArrayException;

import java.util.Arrays;

public class NumberArrayWrapper {
    private int[] array;

    public NumberArrayWrapper() {
    }

    public NumberArrayWrapper(int... array) {
        this.array = array;
    }

    public int get(int index) throws NumberArrayException {
        if (index > array.length - 1) {
            throw new NumberArrayException("Array out of bounds");
        } else return array[index];
    }

    public void set(int index, int number) throws NumberArrayException {
        if (index > array.length - 1) {
            throw new NumberArrayException("Array out of bounds");
        } else array[index] = number;
    }

    public int size() {
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberArrayWrapper that = (NumberArrayWrapper) o;

        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberArrayWrapper{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}

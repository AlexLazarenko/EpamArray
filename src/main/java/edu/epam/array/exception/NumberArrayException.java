package edu.epam.array.exception;

public class NumberArrayException extends Exception {
    public NumberArrayException() {
    }

    public NumberArrayException(String message) {
        super(message);
    }

    public NumberArrayException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public NumberArrayException(Throwable throwable) {
        super(throwable);
    }
}

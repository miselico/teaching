package fi.teaching.materials.utils;

/**
 * Example utility class that contains bugs that should be detected in unit test
 *
 * @author Kamil Janowski
 */
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        // contains a mistake! adds the number instead of multiplying them. Should be detected by an appropriate unit test
        return a + b;
    }
}

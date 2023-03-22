package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void max() {
        Array array = new Array(5);
        array.insert(1);
        array.insert(5);
        array.insert(3);

        var result = array.max();
        assertEquals(5, result);
    }

    @Test
    void reverse() {
    }

    @Test
    void insertAt() {
    }

    @Test
    void insert() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void removeAt() {
    }

    @Test
    void printArray() {
    }

    @Test
    void increaseArraySize() {
    }
}
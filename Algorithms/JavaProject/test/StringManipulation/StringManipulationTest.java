package StringManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringManipulationTest {

    @Test
    void testCountVowels() {
        Assertions.assertEquals(3, StringManipulation.countVowels("hello world"));
        Assertions.assertEquals(0, StringManipulation.countVowels(""));
        Assertions.assertEquals(0, StringManipulation.countVowels(null));
        Assertions.assertEquals(0, StringManipulation.countVowels("bcdfghjklmnpqrstvwxyz"));
    }

    @Test
    void testReverseString() {
        Assertions.assertEquals("dlrow olleh", new StringManipulation().reverseString("hello world"));
        Assertions.assertEquals("", new StringManipulation().reverseString(""));
        Assertions.assertEquals("racecar", new StringManipulation().reverseString("racecar"));
    }

    @Test
    void testReverseSentenceOrder() {
        Assertions.assertEquals("world hello", new StringManipulation().reverseSentenceOrder("hello world"));
        Assertions.assertEquals("one two three", new StringManipulation().reverseSentenceOrder("three two one"));
        Assertions.assertEquals("", new StringManipulation().reverseSentenceOrder(""));
    }

    @Test
    void testRemoveDuplicates() {
        Assertions.assertEquals("helo wrd", new StringManipulation().removeDuplicates("hello world"));
        Assertions.assertEquals("", new StringManipulation().removeDuplicates(""));
        Assertions.assertEquals(null, new StringManipulation().removeDuplicates(null));
    }

    @Test
    void testFindMostRepeatedCharacter() {
        Assertions.assertEquals('l', new StringManipulation().findMostRepeatedCharacter("hello world"));
        Assertions.assertEquals('a', new StringManipulation().findMostRepeatedCharacter("banana"));
        Assertions.assertEquals(' ', new StringManipulation().findMostRepeatedCharacter("this has no repeating characters"));
    }

    @Test
    void testUpperCaseTrim() {
        Assertions.assertEquals("Hello World", new StringManipulation().upperCaseTrim("hello world"));
        Assertions.assertEquals("", new StringManipulation().upperCaseTrim(""));
        Assertions.assertEquals("One Two Three", new StringManipulation().upperCaseTrim("one two three"));
    }

    @Test
    void testIsPalindrome() {
        Assertions.assertTrue(StringManipulation.isPalindrome("racecar"));
        Assertions.assertFalse(StringManipulation.isPalindrome("hello"));
        Assertions.assertTrue(StringManipulation.isPalindrome(""));
    }
}
package Stack;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(2);
        assertEquals("[1, 2, ]", stack.returnStack());
    }

    @Test
    void push_Resize() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals("[1, 2, 3, 4, 5, ]", stack.returnStack());
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);
        int result = stack.pop();
        assertEquals(2, result);
        assertEquals("[1, ]", stack.returnStack());
    }

    @Test
    void pop_EmptyStack() {
        assertThrows(IllegalStateException.class, () -> {
            stack.pop();
        });
    }

    @Test
    void peek() {
        stack.push(1);
        stack.push(2);
        int result = stack.peek();
        assertEquals(2, result);
        assertEquals("[1, 2, ]", stack.returnStack());
    }

    @Test
    void peek_EmptyStack() {
        assertThrows(IllegalStateException.class, () -> {
            stack.peek();
        });
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void returnStack() {
        stack.push(1);
        stack.push(2);
        assertEquals("[1, 2, ]", stack.returnStack());
    }
}
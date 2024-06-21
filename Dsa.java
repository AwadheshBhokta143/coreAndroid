import java.util.EmptyStackException;

public class StackDemo {

    private static final int MAX_SIZE = 100; // Maximum size of the stack
    private int[] stackArray;
    private int top; // Index of the top element in the stack

    public StackDemo() {
        stackArray = new int[MAX_SIZE];
        top = -1; // Stack is initially empty
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Push operation: Add an element onto the stack
    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full. Cannot push element.");
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Pop operation: Remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    // Peek operation: Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        StackDemo stack = new StackDemo();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        System.out.println("Top element of the stack after popping: " + stack.peek());
    }
}

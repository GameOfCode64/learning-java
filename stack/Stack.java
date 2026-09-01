//  Stack using arrays !
public class Stack {

    private static final int DEFAULT_SIZE = 10;
    private int top = -1;
    private int[] stack = new int[DEFAULT_SIZE];

    public void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("Stack is Full!");
        } else {
            stack[++top] = val;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    public int peek() {
        if (top < 0) {
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }
}

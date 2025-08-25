class Stack {
    private static final int SIZE = 100;
    private int top = -1;
    private int[] a = new int[SIZE];

    // Push method
    public void push(int value) {
        if (top == SIZE - 1) {
            System.out.println("Element cannot be added, stack overflow!");
        } else {
            top++;
            a[top] = value;
        }
    }

    // Pop method
    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
        } else {
            top--;
        }
    }

    // Check if stack is empty
    public void isEmpty() {
        if (top == -1) {
            System.out.println("\nStack is empty");
        } else {
            System.out.println("\nStack is not empty");
        }
    }

    // Check if stack is full
    public void isFull() {
        if (top == SIZE - 1) {
            System.out.println("\nStack is full");
        } else {
            System.out.println("\nStack is not full");
        }
    }

    // Peek method
    public void peek() {
        if (top == -1) {
            System.out.println("-1");
        } else {
            System.out.println(a[top]);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.push(70);

        myStack.peek();
        myStack.isEmpty();
        myStack.isFull();
    }
}


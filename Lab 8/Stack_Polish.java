 class Polish{
    int top = -1;
    int n;
    char[] stackArray;

    public void Stack_Polish(int n) {
        this.n = n;
        stackArray = new char[n];
    }

    public void Stack_Polish(char[] stackArray, int top) {
        this.stackArray = stackArray;
        this.top = top;
    }

    public void push(char x) {
        if (top >= n - 1) {
            System.out.println("Stack OverFlow");
            return;
        }
        this.top = this.top + 1;
        stackArray[top] = x;
        return;
    }

   
    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '!';
        }
        top--;
        return stackArray[top + 1];
    }
    public char peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return '~';
        }
        return stackArray[top - i + 1];
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
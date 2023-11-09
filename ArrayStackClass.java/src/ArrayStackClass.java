//Garret Jordan
public class ArrayStackClass {

    char stack[];
    private int maxSize;
    private int top = -1;

    public ArrayStackClass(int maxSize) {
        this.maxSize = maxSize;
        stack = new char[maxSize];
    }

//N.stack = new char[];
    public void push(char data) {
        top++;
        stack[top] = data;
    }

    public char pop() {
        char data;
        data = stack[top];
        stack[top] = 0;
        top--;
        return data;
    }

    public char peek() {
        char data;
        data = stack[top];
        //System.out.println("the value of data is:" +data);
        return data;

    }
    public int size(){
        return top;
    }
    public boolean isEmpty() {
    return top == -1;
    }
    public boolean isFull(){
        return top == maxSize -1;
    }

 }


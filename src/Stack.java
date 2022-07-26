public class Stack {
    int top = -1;
    int MAX_LENGTH = 30;
    char stack[] = new char[MAX_LENGTH];

    void push(char x) {
        if (top < (MAX_LENGTH-1)) {
            stack[++top] = x;
        }
        else {
            System.out.println("OVERFLOW: Stack is filled.");
        }
    }
    
    
    char pop() {
        char removed = '0';
        if (top != -1) {
            removed = stack[top];
            top--;
        } else
            System.out.println("UNDERFLOW: Stack is empty");
        return removed;
        
    }
    
    void display() {
        if (top != -1) {
            System.out.println("* STACK *");
            System.out.printf("| %s | -> TOP%n", stack[top]);
            for (int i = top-1; i >= 0; i--) {
                System.out.printf("| %s |%n", stack[i]);
            }
        }

    }
}   

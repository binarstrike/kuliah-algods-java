public class ImplementasiStack {
  public static void main(String[] args) {
    StackWithArray stack = new StackWithArray(5);
   
    stack.push(32);
    stack.push(27);
    stack.push(127);

    System.out.println("Stackk paling atas: "+stack.peek());

    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop(); // stack kosong

    System.out.println("Apakah stack nya kosong: "+stack.isEmpty());
  }
}

class StackWithArray {
  private final int maxSize;
  private int top;
  private final int[] stackArray;

  public StackWithArray(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int value) {
    if (top < maxSize - 1) {
      stackArray[++top] = value;
      System.out.println("Pushed: " + value);
    } else {
      System.out.println("Stack is full. Cannot push " + value);
    }
  }

  public int pop() {
    if (top >= 0) {
      int poppedValue = stackArray[top--];
      System.out.println("Popped: " + poppedValue);
      return poppedValue;
    } else {
      System.out.println("Stack is empty. Cannot pop. ");
      return -1;
    }
  }

  public int peek() {
    if (top >= 0) {
      return stackArray[top];
    } else {
      System.out.println("Stack is empty. Cannot peek.");
      return -1;
    }
  }

  public boolean isEmpty() {
    return (top == -1);
  }
}
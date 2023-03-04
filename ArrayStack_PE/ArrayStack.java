/**
 * CS2030S PE1 Question 2
 * AY21/22 Semester 2
 *
 * @author A0258524Y
 */

class ArrayStack<T> implements Stack<T> {
  
  private T[] stackArr;
 
  private int endPointer = -1;
  private int maxDepth;

  public ArrayStack(int depth) {
    @SuppressWarnings("unchecked")
    T[] temp = (T[]) new Object[depth];
    this.stackArr = temp;
    this.maxDepth = depth;
  }

  //factory method
  public static <T> ArrayStack<T> of(T[] newArr, int depth) {
    ArrayStack<T> convertedArr = new ArrayStack<T>(depth);

    for (int i = 0; i < newArr.length; i ++) {
      convertedArr.push(newArr[i]);
    }

    return convertedArr;
  }

  public void push(T item) {
    if (this.endPointer >= this.maxDepth - 1) {

      return;
    }
    this.endPointer++;
    this.stackArr[this.endPointer] = item;
    
  }

  public void pushAll(ArrayStack<? extends T> givenArr) {

    for (int i = givenArr.endPointer; i >= 0; i --) {
      T item = givenArr.pop();

      if (!(this.endPointer >= this.maxDepth - 1)) {
        this.push(item);

      }
    }
  }

  public T pop() {
    if (this.endPointer == -1) {
    
      return null;
    }

    this.endPointer--;
    return this.stackArr[this.endPointer + 1];
  }

  public void popAll(ArrayStack<? super T> givenArr) {

    for (int i = this.endPointer; i >= 0; i --) {
      T item = this.pop();

      if (!(givenArr.endPointer >= givenArr.maxDepth - 1)) {
        
        givenArr.push(item);
      }
    }
  }

  public int getStackSize() {
    return this.endPointer + 1;
  }

  @Override
  public String toString() {

    String base = "Stack:";

    for (int i = 0; i <= this.endPointer; i++) {
      base = base + " " + stackArr[i];
    }

    return base;
  }
}

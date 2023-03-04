/**
 * CS2030S PE1 Question 2
 * AY21/22 Semester 2
 *
 * @author A0258524Y
 */

public interface Stack<T> {
  
  T pop();

  void push(T object);

  int getStackSize();
}

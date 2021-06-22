package data_structure_algorithm.stack;

public interface Stack<T>{
    boolean isEmpty();
    boolean push(T x);
    T pop();
    T peek();
    int getLenght();
}
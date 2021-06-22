package data_structure_algorithm.queue;

public interface Queue<T> {
    void enQueue(T x);
    void deQueue();
    boolean isFull();
    boolean isEmpty();
    T front();
    T rear();
    void printAllElements();
}

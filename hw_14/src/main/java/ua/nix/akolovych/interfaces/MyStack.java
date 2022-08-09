package ua.nix.akolovych.interfaces;

public interface MyStack<T> {
    boolean addElem(T object);
    boolean addAll(T[] objects);
    T getElem(int index);
    int getIndexOf(T value);
    void changeElemByIndex(T value, int index);
    boolean deleteElemByIndex(int index);
    boolean deleteElemByValue(T value);
    boolean push(T object);
    boolean pop();
    T peek();
    int size();
    boolean empty();
}

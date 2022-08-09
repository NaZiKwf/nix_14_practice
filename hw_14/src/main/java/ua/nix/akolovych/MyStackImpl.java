package ua.nix.akolovych;

import ua.nix.akolovych.interfaces.MyStack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStackImpl<T> implements MyStack<T> {
    Node<T> top;
    private int size;

    public MyStackImpl(){

    }


    private static class Node<T>{
        private T value;
        private Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    @Override
    public boolean addElem(T object) {
        Node<T> node = new Node(object);

        if (top == null)
            top = node;
        else {
            node.next = top;
            top = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(T[] objects) {
        for(T obj : objects)
            addElem(obj);
        return true;
    }

    @Override
    public T getElem(int index) {

        if(top==null){
            throw new EmptyStackException();
        }

        if(index < 0 || index>=size){
            throw new RuntimeException("Not correct index");
        }

        int i=0;
        for(Node<T> node = top; node != null; node=node.next){
            if(i==index){
                return node.value;
            }
            i++;
        }
        throw new NoSuchElementException();
    }

    @Override
    public int getIndexOf(T value) {
        int i= 0;
        for(Node<T> node = top; node != null; node=node.next){
            if(node.value==value){
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public void changeElemByIndex(T value, int index) {

        if(top==null){
            throw new EmptyStackException();
        }

        if(index < 0 || index>=size){
            throw new RuntimeException("Not correct index");
        }

        Node<T> result = new Node<>(null);
        int i = 0;
        for(Node<T> node = top; node != null; node=node.next){
            if(index==i){
                Node<T> old = new Node<T>(node.value);
                node.value = value;
            }
            i++;
        }
    }

    @Override
    public boolean deleteElemByIndex(int index) {

        if (top == null || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            top = top.next;
        } else {
            remove(index, 0, top);
        }
        size--;

        return true;
    }
    private void remove(int index, int current, Node<T> n) {
        if (current == index - 1) {
            n.next = n.next.next;
        } else {
            remove(index, current + 1, n.next);
        }
    }

    @Override
    public boolean deleteElemByValue(T value) {
        return deleteElemByIndex(getIndexOf(value));
    }

    @Override
    public boolean push(T object) {
        addElem(object);
        return true;
    }

    @Override
    public boolean pop() {
        if(top==null){
            throw new EmptyStackException();
        }
        top = top.next;
        size--;
        return true;
    }

    @Override
    public T peek() {
        if(top==null){
            throw new EmptyStackException();
        }
        return top.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean empty() {
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Node<T> node = top; node != null; node=node.next){
            str.append(node.value).append(" ");
        }
        return str.toString();
    }
}

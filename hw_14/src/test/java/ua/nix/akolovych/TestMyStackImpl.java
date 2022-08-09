package ua.nix.akolovych;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;


import static org.junit.jupiter.api.Assertions.*;

public class TestMyStackImpl {
    @Test
    void empty_returnSize(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        boolean expected = false;
        boolean actual = myStack.empty();
        assertEquals(expected,actual);
    }

    @Test
    void size_returnSizeOfStack(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        int expected = 0;
        int actual = myStack.size();
        assertEquals(expected,actual);
    }

    @Test
    void peek_returnTopOfStack(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        myStack.addElem(3);
        int expected = 3;
        int actual = myStack.peek();
        assertEquals(expected,actual);
    }
    @Test
    public void peek_throwExceptionWhenStackEmpty() {
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        Exception exception = assertThrows(EmptyStackException.class, myStack::peek);
    }

    @Test
    void deleteElemByIndex_throwExceptionWhenIndexIsNotCorrect(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        Exception exception = assertThrows(IndexOutOfBoundsException.class,()->myStack.deleteElemByIndex(-1));
    }

    @Test
    void deleteElemByIndex_inputIndexByUser_returnCorrectInput(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        boolean expected = true;
        boolean actual = myStack.deleteElemByIndex(0);
        assertEquals(expected,actual);
    }

    @Test
    void deleteElemByIndex_inputIndexByUser_returnNotCorrectInput(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        myStack.addElem(3);
        boolean expected = true;
        boolean actual = myStack.deleteElemByIndex(2);
        assertEquals(expected,actual);
    }

    @Test
    void addAll_InputArrayofObjects_returnBoolean(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        Integer [] array = new Integer[] {1, 2, 3};
        myStack.addAll(array);
        int expectedSize = 3;
        int actual = myStack.size();
        assertEquals(expectedSize,actual);
    }

    @Test
    void getElem_throwExceptionWhenTopIsNull(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        Exception exception = assertThrows(EmptyStackException.class,()->myStack.getElem(1));
    }
    @Test
    void getElem_throwExceptionWhenIndexIsNotCorrect(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        Exception exception = assertThrows(RuntimeException.class,()->myStack.getElem(-1));
    }

    @Test
    void getElem_InputIndexFromUser(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        int expectedElem = 1 ;
        int actual = myStack.getElem(1);
        assertEquals(expectedElem,actual);
    }

    @Test
    void push_returnBoolean(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        boolean expected = true;
        boolean actual = myStack.push(1);
    }

    @Test
    void pop_throwExceptionWhenTopIsNull(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        Exception exception = assertThrows(EmptyStackException.class,()->myStack.pop());
    }

    @Test
    void pop_returnBoolean(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        myStack.addElem(3);
        myStack.pop();
        int expectedSize = 2;
        int actual = myStack.size();
        assertEquals(expectedSize,actual);
    }

    @Test
    void changeElemByIndex_throwExceptionWhenTopIsNull(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        Exception exception = assertThrows(EmptyStackException.class,()->myStack.changeElemByIndex(1,0));
    }

    @Test
    void changeElemByIndex_throwExceptionWhenIndexIsNotCorrect(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        Exception exception = assertThrows(RuntimeException.class,()->myStack.changeElemByIndex(1,-1));
    }

    @Test
    void changeElemByIndex_InputIndexFromUser() {
        MyStackImpl<Integer> myStack = new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        int expectedElem = 5;
        myStack.changeElemByIndex(5,1);
        int actual = myStack.getElem(1);
        assertEquals(expectedElem, actual);
    }

    @Test
    void getIndexOf_ValueFromUser_returnIndex(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        int expectedIndex = 0 ;
        int actual = myStack.getIndexOf(1);
        assertEquals(expectedIndex,actual);
    }

    @Test
    void getIndexOf_NotCorrectValueFromUser(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        int expectedIndex = -1 ;
        int actual = myStack.getIndexOf(5);
        assertEquals(expectedIndex,actual);
    }

    @Test
    void toString_InputFromUser_returnString(){
        MyStackImpl<Integer> myStack= new MyStackImpl<>();
        myStack.addElem(1);
        myStack.addElem(2);
        String expected = "2 1 ";
        String actual = myStack.toString();
        assertEquals(expected,actual);
    }

}

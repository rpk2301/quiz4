package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable {
    Stack<SomeType> RickyStack;
    public MyStack() {
       RickyStack = new Stack<>();
    }

    public Boolean isEmpty() {
        return RickyStack.isEmpty();
    }

    public void push(SomeType i) {
        RickyStack.push(i);
    }

    public SomeType peek() {
        if (RickyStack.isEmpty()) {return null;}
       return RickyStack.peek();
    }

    public SomeType pop() {
        return RickyStack.pop();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}

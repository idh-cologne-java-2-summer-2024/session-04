package idh.java;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Object> {

    Object[] array;
    int i = 0;

    public ArrayIterator(Object[] arr) {
	this.array = arr;
    }

    @Override
    public boolean hasNext() {
	return i < array.length - 1;
    }

    @Override
    public Object next() {
	return array[i++];
    }

}

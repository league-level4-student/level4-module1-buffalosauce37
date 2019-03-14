package _01_Custom_ArrayList;

import org.junit.experimental.theories.FromDataPoints;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] array;
	int size;
	int capacity;

	public ArrayList() {
		capacity = 2;
		array = (T[]) new Object[capacity];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc >= size){
			throw new IndexOutOfBoundsException();
		}
		
	else{	
	return array[loc];
	}
	}

	public void add(T val) {
		
		if(capacity <= size) {
			int newCapacity = 2 * capacity;
			T[] newArray = (T[]) new Object[newCapacity];
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			capacity = newCapacity;
		}
		array[size] = val;
		size++;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if(loc > size){
			throw new IndexOutOfBoundsException();
		}
		if(capacity <= size) {
			int newCapacity = 2 * capacity;
			T[] newArray = (T[]) new Object[newCapacity];
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			capacity = newCapacity;
		}
		for (int i = size; i >= loc; i--) {
			array[i + 1] = array[i];
		}
		array[loc] = val;
		size++;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc >= size){
			throw new IndexOutOfBoundsException();
		}
		array[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		if(loc >= size){
			throw new IndexOutOfBoundsException();
		}
		for (int i = loc; i < size-1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	public boolean contains(T val) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {

		return size;
	}
}
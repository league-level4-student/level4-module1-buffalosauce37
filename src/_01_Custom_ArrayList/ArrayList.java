package _01_Custom_ArrayList;

import org.junit.experimental.theories.FromDataPoints;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;
	int size;
	
	public ArrayList() {
		array = (T[])new Object[100];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return array[loc];
	}
	
	public void add(T val) {
		array[size] = val;
		size ++;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		for (int i = 0; i < array.length; i++) {
			
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}
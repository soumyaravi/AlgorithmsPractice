package stacksQueues;

import java.util.EmptyStackException;
public class ThreeInOne {
	
	private int numberOfStacks=3;
	private int capacity;
	private int sizes[];
	private int values[];
	
	public ThreeInOne(int size){
		sizes = new int[numberOfStacks];
		capacity = size;
		values = new int[capacity * numberOfStacks];
	}
	
	public void push(int data, int stackNum){
		if(isFull(stackNum))
			throw new EmptyStackException();
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = data;	
			
	}
	
	public int pop(int stackNum) {
		if(isEmpty(stackNum))
			throw new EmptyStackException();
		int data = values[indexOfTop(stackNum)];
		values[indexOfTop(stackNum)] = 0;
		sizes[stackNum]--;
		return data;
	}
	
	public int peek(int stackNum){
		if(isEmpty(stackNum))
			throw new EmptyStackException();
		int data = values[indexOfTop(stackNum)];
		return data;
	}
	public boolean isEmpty(int stackNum){
		return sizes[stackNum] == 0;
	}
	
	public boolean isFull(int stackNum){
		
		return sizes[stackNum] == capacity;
	}
	public int indexOfTop(int stackNum){
		int top = stackNum * capacity;
		int size = sizes[stackNum];
		return top + size - 1;
	}
}

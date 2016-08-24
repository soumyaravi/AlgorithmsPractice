package Stacksq3;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
	int capacity;
	ArrayList<Stacks> stack = new ArrayList<Stacks>();
	
	public SetOfStacks(int capacity){
		this.capacity = capacity;
	}
	
	public Stacks getLastStack(){
		if(stack.size() == 0)
			return null;
		return stack.get(stack.size()-1);
	}
	
	public void push(int data){
		Stacks last = getLastStack();
		if(last!=null && !last.isFull()) //Add to last stack
			last.push(data);
		else{							// Create new stack as previous stack has reached maximum capacity
			Stacks top = new Stacks(capacity);
			top.push(data);
			stack.add(top);			
		}
	}
	
	public int pop(){
		Stacks last = getLastStack();
		if(last == null)
			throw new EmptyStackException();
		int data = last.pop();
		if(last.size == 0)
			stack.remove(stack.get(stack.size()-1));
		return data;
	}
	
	public int popAt(int index){
		return leftShift(index,true);
	}

	private int leftShift(int index, boolean removeTop) {
		// TODO Auto-generated method stub
		Stacks stacks = stack.get(index);
		int remove;
		if(removeTop)
			remove = stacks.pop();
		else
			remove = stacks.removeBottom();
		if(stacks.isEmpty())
			stack.remove(index);
		else if(stack.size() > index + 1){
			int next = leftShift(index + 1,false);
			stacks.push(next);
		}
			
		return remove;
	}
	
	public boolean isEmpty(){
		Stacks last = getLastStack();
		return last ==null || last.isEmpty();
	}
	
}

package Stacksq3;

import java.util.EmptyStackException;
public class Stacks {
	private int capacity;
	public int size = 0;
	Node top, bottom;
	
	public Stacks(int capacity){
		this.capacity = capacity;
	}
	
	public boolean isFull(){
		return size == capacity;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	public boolean push(int data){
		if(size>=capacity)
			return false;
		size++;
		Node n = new Node(data);
		if(size == 1)
			bottom = n;
		join(n,top);
		top = n;
		return true;
	}

	private void join(Node above, Node below) {
		// TODO Auto-generated method stub
		if(below!=null)
			below.above = above;
		if(above!=null)
			above.below = below;
	}
	public int pop(){
		if(top==null)
			throw new EmptyStackException();
		Node t = top;
		top = top.below;
		size--;
		return t.data;
	}
	public int removeBottom(){
		if(bottom == null)
			throw new EmptyStackException();
		Node b = bottom;
		bottom = bottom.above;
		if(bottom!=null)
			bottom.below = null;
		size --;
		return b.data;
		
	}
}

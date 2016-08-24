package stacksQueues;

public class SortStack {
	Stack<Integer> stack,temp;
	
	public SortStack(){
		stack = new Stack<Integer>();
		temp = new Stack<Integer>();
	}
	
	public void push(int data){
		if(stack.isEmpty())
			stack.push(data);
		else{
			sortstack(data);
		}
	}

	private void sortstack(int data) {
		while(!stack.isEmpty() && stack.peek()>data){			
			temp.push(stack.pop());
		}
		stack.push(data);
		while(!temp.isEmpty())
			stack.push(temp.pop());
	}
	public int pop(){
		return stack.pop();
	}
	public int peek(){
		return stack.peek();
	}
	public boolean isEmpty(){
		return stack==null;
	}
}

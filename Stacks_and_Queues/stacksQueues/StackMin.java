package stacksQueues;

public class StackMin extends Stack<Integer> {
	private Stack<Integer> minStack;
	
	public StackMin(){
		minStack = new Stack<Integer>();
	}
	
	public void push(int data){
		super.push(data);
		if(data<=min()){
			minStack.push(data);
		}
	}
	
	public Integer pop(){
		if(super.isEmpty())
			return Integer.MAX_VALUE;
		Integer data = super.pop();
		if(data == min())
			minStack.pop();
		return data;
		
	}
	
	public Integer min(){
		if(minStack.isEmpty())
			return Integer.MAX_VALUE;
		return minStack.peek();
	}
}

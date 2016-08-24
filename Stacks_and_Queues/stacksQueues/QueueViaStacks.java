package stacksQueues;

public class QueueViaStacks {
	Stack<Integer> stack , stack2;
	
	public QueueViaStacks(){
		stack = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	public void push(int data){
		stack.push(data);
	}
	
	public int pop(){;
		Stack<Integer> last = leftShift();
		return last.pop();
	}
	private Stack<Integer> leftShift() {
		// TODO Auto-generated method stub
		if(stack2.isEmpty()){
		while(!stack.isEmpty()){
			int data = stack.pop();
			stack2.push(data);
		}
		}
		return stack2;
	}
	public int peek(){
		Stack<Integer> last = leftShift();
		return last.peek();
	}
	
}

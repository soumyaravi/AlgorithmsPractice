package stacksQueues;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueViaStacks qvs = new QueueViaStacks();
		for(int i=0;i<10;i++)
			qvs.push(i);
		System.out.println("Pop:" + qvs.pop());
		System.out.println("Peek:" + qvs.peek());
	}

}

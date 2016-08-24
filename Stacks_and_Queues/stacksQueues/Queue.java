package stacksQueues;

public class Queue<Item> {
	
	private Node front,rear;

	public void enqueue(Item data){
		if(rear ==null){
			front = new Node(data);
			rear = front;
		}
		else{
			Node n = new Node(data);
			rear.next = n;
			rear = rear.next;
		}
	}
	public Item dequeue(){
		if(rear == null){
			System.out.println("Empty queue");
			return null;
		}
		Node top = front;
		if(front.next == null){
			front = rear = null;
		}
		else
			front = front.next;
		return top.data;
	}
	public boolean isEmpty(){
		return rear == null;
	}
	public int size(){
		int size =0;
		Node n = front;
		while(n!=null){
			size++;
			n = n.next;
		}
		return size;
	}
	class Node{
		Node next;
		Item data;
		
		public Node(Item data){
			next = null;
			this.data = data;
		}
	}
}

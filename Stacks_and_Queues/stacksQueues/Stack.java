package stacksQueues;

public class Stack<Item> {

	private Node top;
	
	public void push(Item data){
		if(top == null){
			top = new Node(data);
		}
		else{
			Node n = new Node(data);
			n.next = top;
			top = n;
		}
	}
	
	public Item pop(){
		if(top == null)
			return null;
		Node n = top;
		top = top.next;
		return n.data;
	}
	
	public Item peek(){
		if(isEmpty())
			return null;
		return top.data;
	}
	
	public int size(){
		int size = 0;
		Node n = top;
		while(n!=null){
			size++;
			n = n.next;
		}
		return size;
	}
	public boolean isEmpty(){
		
		return top == null;
	}
	
	public void display(){
		if(isEmpty())
			System.out.println("Stack is empty");
		else{
			Node n = top;
			System.out.println("Elements are - >");
			while(n!=null){
				System.out.print(n.data + " ");
			}
		}
	}
	class Node{
		private Node next;
		private Item data;
		
		public Node(Item data){
			this.data = data;
			next = null;
			
		}
	}

}
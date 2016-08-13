package linkedlist;

public class LoopDetection {
	
	private Node head,loop,tail;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDetection ld = new LoopDetection();
		ld.insert(2);
		ld.insert(5);
		ld.insert(9);
		ld.insert(0);
		ld.insert(3);
		ld.insert(1);
		ld.insert(24);
		ld.insert(36);
		ld.insert(19);
		ld.insert(37);
		ld.insert(26);
		ld.insert(10);
		ld.LoopDetectionNode();
	}
	private void LoopDetectionNode() {
		// TODO Auto-generated method stub
		tail.next = loop;
		Node n = LoopDetectionNode(head);
		if(n == null){
			System.out.println("No Loop");
		}
		else{
			System.out.println("Data at intersection " + n.data);
		}
	}
	private Node LoopDetectionNode(Node head) {
		// TODO Auto-generated method stub
		Node slow = head, fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				break;
		}
		if(fast==null || fast.next == null)
			return null;
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
			return fast;
	}
	private void insert(int n) {
		// TODO Auto-generated method stub
		head = insertNodes(head,n);
		
	}

	private Node insertNodes(Node head, int data) {
		// TODO Auto-generated method stub
		Node end = new Node(data);
		if(data == 26)
			loop = end;
		if(head == null){
			head = end;
			return head;
		}
		else{
			Node node = head;
			while(node.next!=null)
				node=node.next;
			node.next = end;
			tail = node.next;
			return head;
		}
	}
}

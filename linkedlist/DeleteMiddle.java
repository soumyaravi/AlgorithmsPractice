package linkedlist;

import java.util.Scanner;

public class DeleteMiddle {
	
	private Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddle dm = new DeleteMiddle();
		dm.insert(2);
		dm.insert(5);
		dm.insert(9);
		dm.insert(0);
		dm.insert(3);
		dm.insert(1);
		dm.insert(24);
		dm.insert(36);
		dm.insert(19);
		dm.insert(37);
		dm.insert(26);
		dm.insert(10);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dm.deleteMiddleNode(n);
		dm.printNodes();
	}
	private void deleteMiddleNode(int n) {
		// TODO Auto-generated method stub
		deleteMiddleNode(head,n);
		
	}
	private void deleteMiddleNode(Node head, int n) {
		// TODO Auto-generated method stub
		if(head == null)
			System.out.println("No nodes present!");
		else{
			while(head.next!=null){
				if(head.data == n){
					head.data = head.next.data;
				head.next = head.next.next;
				}
				head = head.next;
			}
		}
			
	}
	private void printNodes() {
		// TODO Auto-generated method stub
		printNodes(head);
	}

	private void printNodes(Node n) {
		// TODO Auto-generated method stub
		
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	private void insert(int n) {
		// TODO Auto-generated method stub
		head = insertNodes(head,n);
		
	}

	private Node insertNodes(Node head, int data) {
		// TODO Auto-generated method stub
		Node end = new Node(data);
		if(head == null){
			head = end;
			return head;
		}
		else{
			Node node = head;
			while(node.next!=null)
				node=node.next;
			node.next = end;
			return head;
		}
	}
}

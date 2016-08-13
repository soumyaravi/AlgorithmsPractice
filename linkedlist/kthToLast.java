package linkedlist;

import java.util.Scanner;

public class kthToLast {
	
	private Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthToLast kl = new kthToLast();
		kl.insert(2);
		kl.insert(5);
		kl.insert(9);
		kl.insert(0);
		kl.insert(3);
		kl.insert(1);
		kl.insert(4);
		kl.insert(6);
		kl.insert(9);
		kl.insert(3);
		kl.insert(2);
		kl.insert(10);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		kl.findKthToLast(k);
	}
	private void findKthToLast(int k) {
		// TODO Auto-generated method stub
		System.out.println(head.data);
		Node n = findKthToLast(head,k);
		if(n==null){
			System.out.println("Length of list is smaller than" + k);
		}
		else
			System.out.println(k+"th to last element is " + n.data);
	}
	private Node findKthToLast(Node head,int k) {
		// TODO Auto-generated method stub
		if(head == null)
			return null;
		Node n = head;
		Node n2 = head;
		for(int i=0;i<k;i++){
			if(n.next!=null)
			n = n.next;
		}
		while(n!=null){
			n=n.next;
			n2=n2.next;
		}
		return n2;
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

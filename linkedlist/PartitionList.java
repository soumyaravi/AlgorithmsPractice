package linkedlist;

import java.util.Scanner;

public class PartitionList {
	private Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionList pl = new PartitionList();
		pl.insert(2);
		pl.insert(5);
		pl.insert(9);
		pl.insert(0);
		pl.insert(3);
		pl.insert(1);
		pl.insert(24);
		pl.insert(36);
		pl.insert(19);
		pl.insert(37);
		pl.insert(26);
		pl.insert(10);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pl.partition(n);
		sc.close();
	}
	private void partition(int n) {
		// TODO Auto-generated method stub
		Node start = partitionList(head,n);
		printNodes(start);
		
	}
	private Node partitionList(Node head, int n) {
		// TODO Auto-generated method stub
		Node left = null;
		Node right = null;
		Node lhead=null,rhead=null,mid=null;
		while(head!=null){
			Node next = head.next;
			head.next = null;
			if(head.data<n){
				if(lhead == null){
					lhead = head;
					left = lhead;
				}
				else{
					left.next = head;
					left = left.next;
				}
			}
			else if(head.data>n){
				if(rhead == null){
					rhead = head;
					right = rhead;
				}
				else{
					right.next = head;
					right = right.next;
				}
			}
			else{
				mid = head;
			}
			head = next;
		}
		if(mid!=null){
			left.next = mid;
			left = left.next;
		}
		left.next = rhead;
		return lhead;
	}
	private void printNodes(Node n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
			count++;
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

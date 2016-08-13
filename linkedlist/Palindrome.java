package linkedlist;

import java.util.Stack;

public class Palindrome {

	private Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal = new Palindrome();
		pal.insert(2);
		pal.insert(1);
		pal.insert(9);
		pal.insert(9);
		pal.insert(5);
		pal.insert(2);
		pal.PalindromeStack();
		pal.PalindromeReverse();
	}
	private void PalindromeReverse() {
		// TODO Auto-generated method stub
		System.out.println(PalindromeReverse(head));
	}
	private boolean PalindromeReverse(Node head) {
		// TODO Auto-generated method stub
		Node clone = null,node = head;
		while(node!=null){
			Node n = new Node(node.data);
			if(clone == null){
				clone = n;
			}
			else{
				n.next = clone;
				clone = n;
			}
			node = node.next;
		}
		while(head!=null && clone!=null){
			if(head.data == clone.data){
				clone = clone.next;
				head = head.next;
			}
			else
				return false;
		}
		return true;
	}
	private void printNodes(Node n) {
		// TODO Auto-generated method stub
		
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	private void PalindromeStack() {
		// TODO Auto-generated method stub
		boolean ans = PalindromeStack(head);
		System.out.println(ans);
	}
	private boolean PalindromeStack(Node head) {
		// TODO Auto-generated method stub
		if(head == null)
			return false;
		else{
			int len = findlength(head);
			Stack<Integer> stack = new Stack<Integer>();
			for(int i=0;i<len/2;i++){
				stack.push(head.data);
				head = head.next;
			}
			if(len%2!=0)
				head = head.next;
			while(head!=null){
				int val = stack.pop();
				if(head.data == val)
					head = head.next;
				else
					return false;
			}
			return true;
		}
			
	}
	private int findlength(Node head) {
		// TODO Auto-generated method stub
		int count = 0;
		while(head!=null){
			count+=1;
			head = head.next;
		}
		return count;
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

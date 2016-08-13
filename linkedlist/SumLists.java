package linkedlist;

import java.util.Stack;

public class SumLists {

		// TODO Auto-generated method stub
		private Node head1,head2;
		private int carry = 0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SumLists sl = new SumLists();/*
			sl.insert(7,1);
			sl.insert(1,1);
			sl.insert(6,1);
			sl.insert(5,2);
			sl.insert(9,2);
			sl.insert(4,2);
			sl.SumListsBackward();*/
			sl.insert(6,1);
			sl.insert(1,1);
			sl.insert(7,1);
			sl.insert(4,2);
			sl.insert(9,2);
			sl.insert(5,2);
			sl.SumListsForward();
		}
		private void SumListsForward() {
			// TODO Auto-generated method stub
			Node sum = SumListsForward(head1,head2);
			printNodes(sum);
		}
		private Node SumListsForward(Node head1, Node head2) {
			// TODO Auto-generated method stub
			int len1 = findlength(head1);
			int len2 = findlength(head2);
			int len = 0;
			if(len1<len2){
				head1 = padZeros(head1,len2-len1);
				len = len2;
			}
			else if(len1>len2){
				head1 = padZeros(head2,len1-len2);
				len = len1;
			}
			else
				len = len1;
			Stack<Integer> stack = new Stack<Integer>();
			while(len!=0){
				stack.push(head1.data + head2.data);
				head1 = head1.next;
				head2 = head2.next;
				len--;
			}
			
			Node head = null;
			carry = 0;
			while(!stack.isEmpty()){
				int val = stack.pop() + carry;
				carry = val / 10;
				val = val % 10;
				Node n = new Node(val);
				if(head == null)
					head = n;
				else{
					n.next = head;
					head = n;
				}
			}
			if(carry>0){
				Node n = new Node(carry);
				n.next = head;
				head = n;
			}
			return head;
		}
		private Node padZeros(Node head1, int i) {
			// TODO Auto-generated method stub
			Node head = null;
			while(i!=0){
				Node n = new Node(0);
				if(head == null)
					head = n;
				else{
					head.next = n;
					head = n;
				}
				i--;
			}
			return head;
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
		private void SumListsBackward() {
			// TODO Auto-generated method stub
			Node sum = SumListsBackward(head1,head2);
			printNodes(sum);
		}
		private Node SumListsBackward(Node head1, Node head2) {
			// TODO Auto-generated method stub
			Node head = null,tail = null;
			
			while(head1!=null || head2!=null){
				int value = ((head1 == null)?0:head1.data) +  ((head2==null)?0:head2.data )+ carry;
				carry = value/10;
				value= value % 10;
				Node n = new Node(value);
				if(head==null){
					head = n;
					tail = head;
				}
				else{
					tail.next = n;
					tail = n;
				}
				head1 = (head1.next==null)?null:head1.next;
				head2 = (head2.next==null)?null:head2.next;
			}	
			if(carry >0){
				Node n = new Node(carry);
				tail.next = n;
			}
			
			return head;
		}

		private void printNodes(Node n) {
			// TODO Auto-generated method stub
			
			while(n!=null){
				System.out.println(n.data);
				n = n.next;
			}
		}
		private void insert(int n,int list) {
			// TODO Auto-generated method stub
			if(list==1)
			head1 = insertNodes(head1,n);
			else
			head2 = insertNodes(head2,n);
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


package linkedlist;

import java.util.HashSet;
import java.util.Set;

//remove duplicates from unsorted linked list

public class RemoveDupliates {
	
	private Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDupliates rd = new RemoveDupliates();
		rd.insert(2);
		rd.insert(5);
		rd.insert(9);
		rd.insert(0);
		rd.insert(3);
		rd.insert(1);
		rd.insert(4);
		rd.insert(6);
		rd.insert(9);
		rd.insert(3);
		rd.insert(2);
		rd.insert(10);
		rd.runnerTechnique();
		//rd.setTechnique();
		rd.printNodes();
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

	private void setTechnique() {
		// TODO Auto-generated method stub
		setTechnique(head);
	}

	private void setTechnique(Node n) {
		// TODO Auto-generated method stub
		System.out.println("using Set Technique");
		Set<Integer> map = new HashSet<Integer>();
		Node prev = null;
		while(n!=null){
			if(map.contains(n.data)){
				prev.next = n.next;
			}
			else{
				prev = n;
				map.add(n.data);
			}
			n = n.next;
		}
	}

	private void runnerTechnique() {
		// TODO Auto-generated method stub
		runnerTechnique(head);
	}

	private void runnerTechnique(Node head) {
		// TODO Auto-generated method stub
		System.out.println("Using runner Technique");
		while(head!=null){
			Node node = head;
			while(node.next!=null){
				if(head.data == node.next.data)
					node.next = node.next.next;
				else
					node = node.next;
			}
			head = head.next;
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

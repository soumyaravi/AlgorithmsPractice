package linkedlist;

public class Intersection {
	
	private Node head,head1,head2,inter,tail,tail1,tail2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection obj = new Intersection();
		obj.insert(2,1);
		obj.insert(5,1);
		obj.insert(9,1);
		obj.insert(0,2);
		obj.insert(3,2);
		obj.insert(1,2);
		obj.insert(37,2);
		obj.insert(26,2);
		obj.insert(10,2);
		obj.insert(24,1);
		obj.insert(36,1);
		obj.insert(19,1);
		obj.IntersectionNode();
	}
	private void IntersectionNode() {
		// TODO Auto-generated method stub
		tail.next = inter;
		Node n = IntersectionNode(head1,head2);
		if(n!=null)
		System.out.println(n.data);
		else
			System.out.println("No intersections");
	}
	private Node IntersectionNode(Node head1, Node head2) {
		// TODO Auto-generated method stub
		int len1 = findlength(head1);
		tail1=tail;
		int len2 = findlength(head2);
		tail2=tail;
		int len = 0;
		if(tail1!=tail2){
			return null;
		}
		else{
			if(len1>len2){
				len = len1-len2;
				for(int i=0;i<len;i++)
					head1 = head1.next;
			}
			else if(len1<len2){
				len = len2-len1;
				for(int i=0;i<len;i++)
					head2 = head2.next;
			}
			while(head1!=null && head2!=null){
				if(head1==head2)
					return head1;
				else{
					head1 = head1.next;
					head2 = head2.next;
				}
			}
			return null;
		}
	}
	private int findlength(Node head) {
		// TODO Auto-generated method stub
		int count = 0;
		while(head!=null){
			count+=1;
			tail = head;
			head = head.next;
		}
		return count;
	}
	private void printNodes() {
		// TODO Auto-generated method stub
		printNodes(head1);
		printNodes(head2);
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
		if(data == 37){
			inter = end;
		}
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

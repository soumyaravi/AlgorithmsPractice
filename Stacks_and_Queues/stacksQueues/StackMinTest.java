package stacksQueues;

public class StackMinTest {
	
	StackMin sm = new StackMin();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMinTest smt = new StackMinTest();	
		smt.test();
	}

	private void test() {
		// TODO Auto-generated method stub
		sm.push(7);
		sm.push(3);
		sm.push(1);
		sm.push(37);
		sm.push(9);
		sm.push(0);
		System.out.println(sm.min());
		sm.pop();
		System.out.println(sm.min());
	}

}

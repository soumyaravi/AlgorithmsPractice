package stacksQueues;

public class TestThreeInOne {
	
	ThreeInOne obj = new ThreeInOne(3);
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestThreeInOne tio = new TestThreeInOne();
		tio.test();
	}
	private void test() throws Exception {
		// TODO Auto-generated method stub
		obj.push(1, 0);
		obj.push(2, 0);
		obj.push(3, 0);
		obj.push(4, 1);
		obj.push(5, 1);
		obj.push(6, 2);
		obj.push(7, 2);
		obj.push(8, 2);
		System.out.println(obj.peek(0));
		System.out.println(obj.peek(1));
		System.out.println(obj.peek(2));
		System.out.println(obj.isFull(0));
		System.out.println(obj.pop(0));
		System.out.println(obj.isFull(0));
		System.out.println(obj.indexOfTop(2));
	}

}

package stacksQueues;

public class SortStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStack ss = new SortStack();
		for(int i=0;i<10;i++){
			int r = (int)(Math.random()*100);
			ss.push(r);
		}
		for(int i=0;i<10;i++)
			System.out.println((i+1) + ":" + ss.pop());
	}

}

package Stacksq3;

public class StackOfPlates {

	public static void main(String[] args) {
		int capacity = 5;
		SetOfStacks stack = new SetOfStacks(capacity);
		for(int i=0;i<35;i++)
			stack.push(i);
		System.out.println("Popped at index 4:" + stack.popAt(4));
		for(int i=0;i<35;i++)
			System.out.println("Popped: " + stack.pop());

	}

}

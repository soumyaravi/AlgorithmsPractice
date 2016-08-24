package stacksQueues;

import java.util.LinkedList;

public class AnimalQueue{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	
	private int order = 0;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		if(a instanceof Cat){
			cats.addLast((Cat)a);
		}
		else
			dogs.addLast((Dog)a);
	}
	
	public Animal dequeueAny(){
		if(dogs.size()==0){
			dequeueCats();
		}
		else if(cats.size() == 0)
			dequeueDogs();
		else if(cats.size() == 0 && dogs.size() == 0){
			System.out.println("End of list");
			return null;
		}
		System.out.println(dogs.size() +" " + cats.size());
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.isOlder(cat))
			return dogs.poll();
		else
			return cats.poll();
		
	}
	public Animal peek() {
		if (dogs.size() == 0) {
			return cats.peek();
		} else if (cats.size() == 0) {
			return dogs.peek();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlder(cat)) {
			return dog;
		} else {
			return cat;
		}
}
	public int size(){
		return dogs.size() + cats.size();
	}
	private Dog dequeueDogs() {
		// TODO Auto-generated method stub
		return dogs.poll();
	}

	private Cat dequeueCats() {
		// TODO Auto-generated method stub
		return cats.poll();
	}
}

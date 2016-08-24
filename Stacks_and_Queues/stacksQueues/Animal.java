package stacksQueues;


public abstract class Animal{
	private int order;
	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	public String name(){
		return name;
	}
	public void setOrder(int order){
		this.order = order;
	}
	public boolean isOlder(Animal a){
		return order < a.order;
	}
}
public class Fruit{
	private String name;
	private int quantity;
	
	public Fruit(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
		
	public Fruit(String name){
		this.name = name;
		this.quantity = 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	@Override
	public String toString(){
		return this.name + " de quantité " + this.quantity;
	}
}
public class Drink{
	private String name;
	
	public Drink(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
	
}
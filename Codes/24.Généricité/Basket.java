public class Basket<E>{
	private E item;
	
	public Basket (E item){
		this.item = item;
	}
	
	public E getItem(){
		return this.item;
	}
}
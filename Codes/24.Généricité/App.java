import java.util.List;
import java.util.ArrayList;

public class App{
	public static void main(String[] args){
		Fruit f = new Fruit("Strawberry", 10);
		Vegetable v = new Vegetable("Cucumber", Color.GREEN);
		Drink d = new Drink("Water");
		
		Basket<Fruit> bf = new Basket(f);
		Basket<Vegetable> bv = new Basket(v);
		Basket<Drink> bd = new Basket(d);
		
		System.out.println("Le panier contient le fruit : " + bf.getItem());
		System.out.println("Le panier contient le légume : " + bv.getItem());
		System.out.println("Le panier contient la boisson : " + bd.getItem());
		
		System.out.println("");
		
		
		List<Fruit> lf = new ArrayList<>();
		
		Fruit f2 = new Fruit("Cherry");
		Fruit f3 = new Fruit("Banana");
		Fruit f4 = new Fruit("Blueberry");
		
		lf.add(f2);
		lf.add(f3);
		lf.add(f4);
		
		List<Vegetable> lv = new ArrayList<>();
		
		Vegetable v2 = new Vegetable("Cabbage", Color.RED);
		Vegetable v3 = new Vegetable("Leeks", Color.GREEN);
		Vegetable v4 = new Vegetable("Endive", Color.WHITE);
		
		lv.add(v2);
		lv.add(v3);
		lv.add(v4);
		
		printList(lf);
		printList(lv);
	}  

	public static void printList(List<?> li){
		for(Object items : li)
			System.out.println(items);
	}
}
import java.util.List;

public class App{
	public static void main(String[] args){
		Creature d = new Dragon();
		d.fly();
		d.attack();
		d.eat();
	}
	
	@SafeVarargs
	public static void printIntLists(List<Integer>... lists){
		for(List<Integer> l : lists){
			System.out.println(l);
		}
	}
}
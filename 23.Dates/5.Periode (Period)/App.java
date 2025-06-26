import java.time.LocalDate;
import java.time.Period;

public class App{
	public static void main(String[] args){
		Period p = Period.of(3, 5, 3);
		LocalDate date = LocalDate.of(2010, 2, 15);
		
		System.out.println("Période : " + p);
		System.out.println("La date + période : " + date.plus(p));
	}
}
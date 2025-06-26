import java.time.LocalTime;
import java.time.Duration;

public class App{
	public static void main(String[] args){
		Duration du = Duration.ofHours(3).plusMinutes(30);
		LocalTime time = LocalTime.of(10, 20, 15);
		
		System.out.println("Durée : " + du);
		System.out.println("L'heure + Durée : " + time.plus(du));
	}
}
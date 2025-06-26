import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class App{
	public static void main(String[] args){
		LocalDateTime ldt = LocalDateTime.now();
		
		LocalTime myTime = LocalTime.of(20, 11, 28);
		LocalDate myDate = LocalDate.of(2003, 11, 28);
		LocalDateTime myDateTime = LocalDateTime.of(myDate, myTime);
		
				
		System.out.println("Date et Heure d'aujourd'hui: " + ldt);
		System.out.println("Date et Heure : " + myDateTime);
		System.out.println("Autre Date et Heure : " + LocalDateTime.of(1999, 10, 20, 9, 10, 50));
	}
}
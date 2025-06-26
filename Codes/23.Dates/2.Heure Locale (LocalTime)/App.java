import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class App{
	public static void main(String[] args){
		LocalTime myTime = LocalTime.of(20, 11, 28);
		LocalDate myDate = LocalDate.of(2003, 11, 28);
		LocalDateTime myDateTime = LocalDateTime.of(myDate, myTime);
		
		
		System.out.println("Date et Heure d'aujourd'hui : " + myDateTime);
		
		
		/*System.out.println("Votre date : " + myTime);
		
		System.out.println(" ");
		System.out.println("Notre heure est : " + time.getHour());
		System.out.println("Notre minute est : " + time.getMinute());
		System.out.println("Notre seconde est : " + time.getSecond());
		System.out.println("Notre nano-seconde est : " + time.getNano());

		System.out.println(" ");
		
		System.out.println("Notre heure d'ajourd'hui est : " + time);
		time = time.plusHours(1);
		time = time.plusMinutes(11);
		time = time.plusSeconds(5);
		
		System.out.println("On ajoute 1 heure, 11 minutes et 5 secondes : " + time);
		
		System.out.println(" ");
		
		System.out.println("Notre heure est : " + time);
		time = time.minusHours(1);
		time = time.minusMinutes(6);
		time = time.minusSeconds(5);
		
		System.out.println("Maintenant on retire 1 heure, 6 minutes et 5 secondes : " + time);/*
	}
}
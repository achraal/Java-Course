import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App{
	public static void main(String[] args){
		ZoneId zone = ZoneId.of("GMT+2");
		LocalDate date = LocalDate.of(2001, 11, 16);
		LocalTime time = LocalTime.of(15, 29, 59);
		ZonedDateTime zdt = ZonedDateTime.of(date, time, zone);
		
		System.out.println("Votre zone : " + zone);
		System.out.println("Votre fuseau horaire : " + zdt);
		System.out.println("Notre fuseau horaire : " + ZonedDateTime.now());
	}
}
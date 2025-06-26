import java.time.LocalDate;

public class App{
	public static void main(String[] args){
		LocalDate date = LocalDate.EPOCH;
		LocalDate todayDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2003, 11, 28);
		
		System.out.println("Date epoch : " + date);
		System.out.println("Date d'aujourd'hui : " + todayDate);
		System.out.println("Votre date : " + myDate);
		
		System.out.println(" ");
		System.out.println("Notre année est : " + todayDate.getYear());
		System.out.println("Notre mois est : " + todayDate.getMonth() + " donc c'est le mois " + todayDate.getMonthValue());
		System.out.println("Notre jour est : " + todayDate.getDayOfWeek() + " le " + todayDate.getDayOfMonth() );

		System.out.println(" ");
		
		System.out.println("Notre date d'ajourd'hui est : " + todayDate);
		todayDate = todayDate.plusYears(1);
		todayDate = todayDate.plusMonths(11);
		todayDate = todayDate.plusDays(5);
		
		System.out.println("On ajoute 1 année, 11 mois et 5 jours : " + todayDate);
		
		System.out.println(" ");
		
		System.out.println("Notre date est : " + todayDate);
		todayDate = todayDate.minusYears(1);
		todayDate = todayDate.minusMonths(6);
		todayDate = todayDate.minusDays(5);
		
		System.out.println("Maintenant on retire 1 année, 6 mois et 5 jours : " + todayDate);
	}
}
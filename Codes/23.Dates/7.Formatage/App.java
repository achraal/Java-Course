import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App{
	public static void main(String[] args){
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		
		DateTimeFormatter ldfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ldfmt2 = DateTimeFormatter.ofPattern("dd MMM uuuu");
		DateTimeFormatter ldtfmt = DateTimeFormatter.ofPattern("E dd/MM/yyyy HH:MM:ss:SS (a)");
		DateTimeFormatter zdtfmt = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy HH:MM:ss [zzzz | XXX]");
		
		String ldF = ld.format(ldfmt);
		String ldF2 = ld.format(ldfmt2);
		String ldtF = ldt.format(ldtfmt);
		String zdtF = zdt.format(zdtfmt);
		
		System.out.println(ldF);
		System.out.println(ldF2);
		System.out.println(ldtF);
		System.out.println(zdtF);
	}
}
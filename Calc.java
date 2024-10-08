import java.time.LocalDate;
import java.time.Period;

public class Calc {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1999, 04, 25);
		int years = Period.between(birthDate, today).getYears();

		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
	}

}
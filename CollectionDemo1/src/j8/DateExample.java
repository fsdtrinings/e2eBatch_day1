package j8;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); // today date 
		System.out.println(date);
		
		int year = 2021 ; // sc.nextInt
		
		LocalDate date2 = LocalDate.of(year, 10, 8); // manual date
		System.out.println(date2);
		
		
		LocalDate d2 =  date.minusDays(2);
		System.out.println(d2);
		
		LocalDate dateOfReturn =  date2.plusDays(15);
		System.out.println(dateOfReturn);
		
		System.out.println(" ------------------");
		Period p = Period.between(date2, date);
		
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		System.out.println(" ------------------");
		
		long count = date2.until(date, ChronoUnit.DAYS);
		System.out.println(" count "+count);
		
		
		
	}
}

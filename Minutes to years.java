import java.util.*;
public class Years  {

	public static void main(String[] args) 
	{
                System.out.println("Enter total minutes");
		Scanner s=new Scanner(System.in);
		int minutes;
		minutes=s.nextInt();
		int year,days;
		int minutesInYear=60*24*365;
		year=minutes/minutesInYear;
		System.out.print(year+" Years ");
		minutes=minutes-(year*minutesInYear);
		int minutesInDays=60*24;
		days=minutes/minutesInDays;
		System.out.println("and "+days+" Days");
	}
}

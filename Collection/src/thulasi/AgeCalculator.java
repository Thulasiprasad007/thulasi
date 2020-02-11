package thulasi;

import java.time.*;

public class AgeCalculator {
	public static int calculateAge(String s)
	{
		String s1[]=s.split(",");
		int year=Integer.parseInt(""+s1[0]);
		int Month=Integer.parseInt(""+s1[1]);
		int day=Integer.parseInt(""+s1[2]);
		LocalDate d1=LocalDate.of(year,Month,day);
		LocalDate d2=LocalDate.now();
		Period age=Period.between(d1,d2);
		return age.getYears();
       /* for(String i:s1)
        {
        	System.out.println(i);
        }
		return 0;*/
		
	}
public static void main(String...args)
{
	//LocalDate dob=LocalDate.of(1997, 06, 17);
	//System.out.println(calculateAge(dob));
	String s="1997,06,17";
	System.out.println(calculateAge(s));
	//Period diff=Period.between(d1,d2);
	//System.out.println(diff.getYears());
}
}

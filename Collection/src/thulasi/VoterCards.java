package thulasi;

import java.util.*;
import java.text.*;
import java.util.Map.Entry;
import java.time.*;
public class VoterCards {
	public static void main(String...args)
	{
	HashMap<String,String> s=new HashMap<String,String>();
	s.put("aruna","12/04/1998");
	s.put("latha","24/03/1997");
	s.put("aruna","12/04/1998");
	s.put("aru","12/04/1998");
	System.out.println(s.values());
	Date d=new Date();
	SimpleDateFormat forma=new SimpleDateFormat("dd/MM/YYYY");
	String str=forma.format(d);
	
	/*for(Entry<String, String> r :s.entrySet())
	{
		System.out.println(r.getValue());
	}
	/*LocalDate date1=LocalDate();
	LocalDate date=LocalDate.now();
	Period diff=Period.between(date,s);*/
	}
}
	

	
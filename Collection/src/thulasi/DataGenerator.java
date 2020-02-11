package thulasi;
import java.util.*;
import java.text.*;
public class DataGenerator {  
	public static String getDate(SimpleDateFormat f)
	{
		Date d=new Date();
		String str= f.format(d);
		return str;
	}
public static void main(String[] args) {  
     SimpleDateFormat format=new SimpleDateFormat("dd/MM/YYYY");
     System.out.println(getDate(format));
}  
}  
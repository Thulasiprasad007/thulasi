package thulasi;
import java.text.*;
//import java.util.Calendar;
import java.util.Date;
import java.util.Scanner; 

public class Case3 {  
  
    public static void main(String[] args) throws Exception { 
    	Scanner scan=new Scanner(System.in);
    	String input[]=new String[3];
    	for(int i=0;i<1;i++)
    	{
    	     input[i]=scan.next();
    	}
    	for(int i=0;i<1;i++)
    	{
    	  String input_date=input[i];
    	  SimpleDateFormat format1=new SimpleDateFormat("yyyy/MM/dd");
    	  Date dt1=format1.parse(input_date);
    	  DateFormat df = new SimpleDateFormat("EEEE");
    	  System.out.println(df.format(dt1));
    	 /* int l=dt1.getDay();
    	  switch (l)
    	  {
    	  case 1:
    		    System.out.println("Monday");
    		    break;
    		  case 2:
    		    System.out.println("Tuesday");
    		    break;
    		  case 3:
    		    System.out.println("Wednesday");
    		    break;
    		  case 4:
    		    System.out.println("Thursday");
    		    break;
    		  case 5:
    		    System.out.println("Friday");
    		    break;
    		  case 6:
    		    System.out.println("Saturday");
    		    break;
    		  case 7:
    		    System.out.println("Sunday");
    		    break;
    	  }*/
        }  
} 
}

package thulasi;

import java.util.*;

public class Collecction9 {
	public static String CollMethod(String arr[])
	{
		String m="";
		ArrayList<String> a1=new ArrayList<String>(Arrays.asList(arr));
		for(int i=0;i<arr.length;i++)
		{
			String s=a1.get(i);
		    m=m+s.charAt(s.length()-1);
		}
		return m;
		
	}
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println(CollMethod(arr));
	}

}

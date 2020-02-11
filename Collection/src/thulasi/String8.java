package thulasi;

import java.util.Scanner;

public class String8 {
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[3];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextLine();
		}
		System.out.println("enter city name");
		String s1=scan.nextLine();
		for(int i=0;i<arr.length;i++)
		{
			String s[]=arr[i].split("_");
			//System.out.println(s[0]+" "+s[1]);
			if(s1.equals(s[0]))
			{
				System.out.println(s[1]);
			}
		}
	}

}

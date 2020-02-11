package thulasi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueCollection {
	public static TreeSet<String> getCollection(String[] Elements)
	{
		TreeSet<String> s1=new TreeSet<String>(Arrays.asList(Elements));
		return s1;
	}
	public static void main(String...args)
	{
		Scanner scan=new Scanner(System.in);
		String Elements[]=new String[5];
		for(int i=0;i<Elements.length;i++)
		{
			Elements[i]=scan.nextLine();
		}
		System.out.println(getCollection(Elements));
	}

}

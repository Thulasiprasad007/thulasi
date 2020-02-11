package thulasi;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class ListManager2 {
	public static ArrayList<String> getArrayList(String elements[]) 
	{
		ArrayList<String> ele=new ArrayList<String>(Arrays.asList(elements));
	    Collections.sort(ele);
	    return ele;
		
	}
public static void main(String...args)
{
	Scanner scan=new Scanner(System.in);
	String Elements[]=new String[4];
	for(int i=0;i<Elements.length;i++)
	{
		Elements[i]=scan.nextLine();
	}
	System.out.print(getArrayList(Elements));
}
}


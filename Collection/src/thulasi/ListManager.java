package thulasi;

import java.util.ArrayList;

public class ListManager {
	public static ArrayList<String> removeElements(ArrayList<String> a1,ArrayList<String> a2)
	{
		a1.removeAll(a2);
		return a1;
	}
	public static void main(String...args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		a1.add("thulasi");
		a1.add("prasad");
		a1.add("ram");
		a1.add("bhanu");
		a1.add("venky");
		a2.add("thulasi");
		a2.add("prasad");
		a2.add("sai");
		System.out.println(removeElements(a1,a2));
		
	}

}

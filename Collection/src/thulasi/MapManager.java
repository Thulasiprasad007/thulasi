package thulasi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;

public class MapManager {
	public static Set<Integer> getKeys(HashMap<Integer,String> a)
	{
		Set<Integer> s=a.keySet();
		return s;
		
	}
	public static void main(String...arg)
	{
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		s.put(1,"thulasi");
		s.put(2, "bhargav");
		s.put(3, "ram");
		s.put(4,"bhanu");
		System.out.println(getKeys(s));
		
	}

}

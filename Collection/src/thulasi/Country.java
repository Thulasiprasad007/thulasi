package thulasi;


import java.util.*;
import java.util.Map.Entry;

class HashMapCountry
{
	  HashMap<String,String> sortByValue(HashMap<String, String> hm) 
	    { 
		  Set<Entry<String,String>> Val=hm.entrySet();
		  ArrayList<String> Arr=new ArrayList<String>();
		  LinkedHashMap<String,String> temp=new LinkedHashMap<String,String>();
	      for(Entry<String,String> e:Val)
	      {
	    	  Arr.add(e.getValue());
	      }
	      Collections.sort(Arr);
	      Iterator<String> i=Arr.iterator();
	      while(i.hasNext())
	      {
	    	  String s=i.next();
		      for(Entry<String,String> e:Val)
		      {
		    	  if(s==e.getValue())
		    	  {
		    		  temp.put(e.getKey(),e.getValue());
		    	  }
		      }
	      }
		  return temp; 
	    } 
}
class Country {

	public static void main(String[] args) {
		HashMap<String,String>h=new HashMap<String,String>();
		HashMapCountry hmc=new HashMapCountry();
		h.put("China","Beijing");
		h.put("Pakistan","Islamabad");
		h.put("India","Dehli");
		h.put("Russia","Moscow");
		System.out.println("Before Sorting");
		System.out.print(h);
		System.out.println();
		System.out.println("After Sorting");
		Map<String, String> hm1 = hmc.sortByValue(h);
		for(Map.Entry<String,String> e:hm1.entrySet())
		{
				System.out.println(e.getKey()+"="+e.getValue());
		}
		}
	}







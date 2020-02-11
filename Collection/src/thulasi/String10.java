package thulasi;

public class String10 {
	public static void main(String...args)
	{
		String s="21457";
		int arr[]=new int[s.length()];
		String t="";
		for(int i=0;i<s.length();i++)
		{
			 if(i==s.length()-1)
			  {
				  System.out.print(s.charAt(s.length()-1));
				  break;
			  }
			  
		  for(int j=i+1;j<s.length();j++)
		  {

			   arr[i]=s.charAt(i)-s.charAt(j);  
			   System.out.print(Math.abs(arr[i]));        //01234
			   break;                                     //21457
		  }                                               //13127
		}
	
	}

}

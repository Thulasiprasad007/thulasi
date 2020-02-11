package thulasi;

public class Ex1 {
	public static void main(String[] args) {
		int c=0;

	int m=500;
	for(int i=2;i<=m;i++)
	{
	  for(int j=1;j<=m;j++)
	  {
		if(i%j==0)
		{
		   c++;	
		}
	  }
	  if(c==2)
	    {
		System.out.println(i);
	    } 
	  c=0;
	}
	}
}

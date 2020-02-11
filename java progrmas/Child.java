import java.util.*;
class Child
{
	public static void main(String args[])
	{
             Scanner sc=new Scanner(System.in);
        int m,n;
	System.out.println("Enter Children No ");	
	n=sc.nextInt();
        System.out.println("Enter Chocalate No ");	
        m=sc.nextInt();
        for(int i=1;i<=n;i++)
	  {
              if(m>=i)
                   {
                     m=m-i;
                    }
              else {
		     n=i-1;
                     break;
                    }
           }
          System.out.println("remaining= "+m);
          System.out.println("Collected Child= "+n);
}
}		
  
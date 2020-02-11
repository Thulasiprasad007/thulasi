import java.util.*;
class prob004
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of the Array :");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter the value in Array :");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	  System.out.println("Enter the Target :");
	  int tar=sc.nextInt();
	  for(int i=0;i<n;i++)
		  {
			  if(tar==arr[i])
				  System.out.println(i);
		  }
		  for(int i=0;i<n;i++)
		  {
			  if(arr[i]<tar && arr[i+1]>tar)
				  System.out.println(i+1);
		  }
	  
 }
}
	 
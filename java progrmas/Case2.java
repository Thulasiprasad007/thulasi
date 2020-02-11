import java.util.*;
class Case2
{
  public static void main(String...args)
  {
   int n;
   Scanner scan=new Scanner(System.in);
   n=scan.nextInt();
   int arr[]=new int[n];
   System.out.println("enter the"+n+" values");
    int c=0;
   for(int i=0;i<arr.length;i++)
   {
      arr[i]=scan.nextInt();
   }
   for(int i=0;i<arr.length;i++)
   {
      if(arr[i]>0)
      {
            c++;
      }
   }
    System.out.println("The number of positive values are"+c);
  }
}
import java.util.*;
class Case1
{
public static void main(String...args)
{
  int number;
   int c=0,d=0;
  Scanner scan=new Scanner(System.in);
  number=scan.nextInt();
  int arr[]=new int[number];
  for( int i=2;i<=number;i++)
   {
    for(int j=1;j<=number;j++)
     {
        if(i%j==0)
        {
           c++;
           
        }  
     }
     
     if(c==2)
      {
        arr[d]=i;
        d++;
      }
      c=0;
    }
   for(int i=0;i<=d;i=i+2)
    {
     System.out.println(arr[i]);
    }
}
}
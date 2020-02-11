
package thulasi;
import java.util.*;
public class Arr4 {
	 public static void main(String...args)                //1 2 3 4 5
                                                           //0 1 2 3 4
{
int number;
Scanner scan=new Scanner(System.in);
number=scan.nextInt();
System.out.println("Enter array size");
int arr[]=new int[number];
int q=0;
for(int i=0;i<arr.length;i++)
{
arr[i]=scan.nextInt();
}
for(int i=0;i<arr.length;i++)
{
if(i%2==0)
{
q=q+arr[i]*i;
}
}
System.out.println(q);
}
}

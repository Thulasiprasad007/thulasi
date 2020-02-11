package thulasi;
import java.util.ArrayList;
import java.util.Scanner;
public class Collection {
	public static void main(String...args)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr.add(i);
		}
		System.out.println(arr);
	}
	

}

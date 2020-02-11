package thulasi;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		/*for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}*/
		System.out.println(arr[0]+arr[arr.length-1]);
		
		
	}
}
		
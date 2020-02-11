package thulasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Thulasi 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	 
	ArrayList a1 =  new ArrayList(); 
    for (int i = 0; i < arr.length; i++) {
   
        a1.add(arr[i]); 
    }
    System.out.print(a1); 
	
  }
}

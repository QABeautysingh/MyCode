package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinput {
	public static void main(String args[])
	{
	Scanner sc = new Scanner (System.in);	
	int n = sc.nextInt();
    int[] arr = new int[n];
	System.out.println("enter the size of array");
	for(int i =0;i<arr.length;i++)
	{
		arr[i] =sc.nextInt();
	}
	System.out.println("enter the values");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	sc.close();
	}

}

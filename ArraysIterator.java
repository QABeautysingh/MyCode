package ArraysAssignment;

import java.util.Arrays;

public class ArraysIterator {
	
public static void main(String args[])
{
	String s1="Automation";
	char [] a= s1.toCharArray();
    for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println(Arrays.toString(a));
}
}

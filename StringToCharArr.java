package ArraysAssignment;

import java.io.CharArrayReader;

public class StringToCharArr {
	public static void main(String args[])
	{
		String s= "javaScript";
		char [] c=s.toCharArray();
		int [] a = {10,20,30,56,36};
		
		String name[] = {"Ram","Rahul","rita"};
		System.out.println("enter characyter array");
		 
		for (int i = 0; i <s.length(); i++)	
		{
			System.out.println(c[i]);
			
		}
		for (int i =0;i<a.length;i++)
		{
		System.out.println(a[i]);	
		}
		for (int i = 0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}

}

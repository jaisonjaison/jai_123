package javaproject;

import java.util.Scanner;

public class A 
{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a=4;
			A.add(a);
		}
	public static void add(int a) {
		Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	
	
	if(b==5)
	{
	System.out.println(b+a);	
	}
	else {
		try
		{
		throw new Exception("not valid");	
		}
		catch (Exception e) {
			System.out.println("Invalid data  ");
			System.out.println("Try Again");
			A.add(a);
		
		}
	}
	}
}	


package Refresher;

import java.util.Scanner;

public class BankAccount {
	private Scanner input=new Scanner(System.in);
	int acid[]=new int[2];
	int acno[]=new int[2];
	public void getAccount()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter Account Id");
			acid[i]=input.nextInt();
			System.out.println("Enter Account no.");
			acno[i]=input.nextInt();
		}
	}
	public void dispAccount()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("A/c Id is"+acid[i]);
			System.out.println("A/c no. is"+acno[i]);
		}
	}
}

package Refresher;
import java.util.Scanner;
public class ElectricityBill {

	private Scanner input=new Scanner(System.in);
	String cname[]=new String[2];
	String caddress[]=new  String[2];
	public void getdetail()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter name");
			cname[i]=input.next();
			System.out.println("Enter Address");
			caddress[i]=input.next();
		}
	}
	public void dispdetail()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("name is="+cname[i]);
			System.out.println("Address is="+caddress[i]);
			
		}
	}
	
}

package Assignment;
import java.util.Scanner;
import java.lang.Exception.*;

public class Calculator {
	int num1;
	int num2;
	Scanner s=new Scanner(System.in);
int  add()
{	
	int sum;
	System.out.println("Enter number to Add");
	num1=s.nextInt();
	System.out.println("Enter next number");
	num2=s.nextInt();
	sum=num1+num2;
return sum ;	
}
int sub()
{
int deduct;
System.out.println("Enter number to substract");
num1=s.nextInt();
System.out.println("Enter next number to substract");
num2=s.nextInt();
deduct=num1-num2;
return deduct;
}
int mul()
{
	int mul;
	System.out.println("Enter number for multiplication");
	num1=s.nextInt();
	System.out.println("Enter next no.s to multiply");
	num2=s.nextInt();
	mul=num1*num2;
	return mul;
}
int div()
{		
	int div;
	System.out.println("Enter number for division");
	num1=s.nextInt();
	System.out.println("Enter next no. to divide");
	//num2=0;
	num2=s.nextInt();
	div=num1/num2;
	return div;
}
/*catch(ArithmeticException e){
System.out.println("Incorrect value"+e);	
}*/

public static void main(String args[])
{
	int value=0;
	Scanner sc=new Scanner(System.in);
	Calculator cal=new Calculator();
	System.out.println("Your Calculator");
	System.out.println("Which Operation do you want to operate");
	do {
		try {
	System.out.println("Enter 1 for add,2 for substract, 3 for multiplication, 4 for divison ");
	System.out.println("If you want to exit then Enter value more than 4");
	value=sc.nextInt();
		if (value==1)
	{
	System.out.println("Total sum ="+cal.add());
	}
	else if(value==2)
	{
		System.out.println("After substraction="+cal.sub());
	}
	else if(value==3)
	{
		System.out.println("Multiplication of numbers ="+cal.mul());
	}
	else if(value==4)
{
	System.out.println("Division of both no.s =" +cal.div());
}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Incorrect input"+e);
		}
	}
	while(value<=4);
}
}




package Assignment;

import java.util.Scanner;

public class Countnew_char {
	String st=new String("meenu");
	String st1="meenu";
	String st2="meenu";
	public void str()
	{
		System.out.println("your  "+st);
		System.out.println("your  "+st1);
		System.out.println("your  "+st2);	
		System.err.println(st == st1);
        System.err.println(st1 == st2);
        System.out.println(st.concat(st1));
        System.out.println(st1.concat("Delhi"));
        if(st.charAt(1)==st1.charAt(1))
        {
        	System.out.println(st.charAt(1));
        	System.out.println(st1.charAt(1));
        System.out.println("equal");
        }
        else
        {
        System.out.println("not equal");
        }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Countnew_char cs=new Countnew_char();
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	int count=0;
	String str1=str.toLowerCase();
	char[] charArr=str1.toCharArray();
	for(char i='a';i<'z';i++)
	{
	for(char c:charArr)
	{
	if(c==i)
	{
	count=count+1;
	}
	}
	if(count!=0)
	{
	System.out.println(i +" = "+count);
	count=0;
	}
	}
	cs.str();
	}
	
}

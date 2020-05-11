package Assignment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Colorforday {
	void dayofweek() throws Exception
	{
		String date;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date to find day");
		date=sc.nextLine();
		try {
		boolean dateValid=dateValidate(date);
		if(dateValid==true)
		{
		date = String.format("%s/%s/%s",date);
		Date Yourdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		Calendar c=Calendar.getInstance();
		c.setTime(Yourdate);
		int DayofWeek=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(DayofWeek);	
		
		if(date.compareTo("mon")==1) 
        {
            System.out.println(date+": White");
        }
        else if(date.compareTo("Tue")==1)
        {
            System.out.println(date+": Red");
        }
        else if(date.compareTo("Wed")==1)
        {
        	System.out.println(date+":Green");
        }
        else if(date.compareTo("Thru")==1)
        {
        	System.out.println(date+":Yellow");
        }
        else if(date.compareTo("Fri")==1)
        {
        	System.out.println(date+":Pink");
        }
        else
        {
        	System.out.println("Weekend");
        }
		}else
		{
			System.out.println("Invalid date!");
	}	
	}
	catch(Exception e)
	{
		System.out.println("Invalid date format"+e);
	}
	}
	private boolean dateValidate(String date) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String args[]) throws Exception
	{
		Colorforday col=new Colorforday();
		col.dayofweek();
	}	
}

package Assignment;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
public class ConnectionDemo {
Statement stmt;
Connection con;
void connection()
{
	try
	{
		System.out.println("Preparing Connection");
		Class.forName("jdbc.odbc.driver.oracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@10.110.84.88.1521:orcl","meenu","Oracle123");
		System.out.println("Connection established"+con);
		}
	catch(Exception e)
	{
	System.out.println(e);	
	}
}
void dataoperation()
{try {
		stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
			String name=rs.getString("name");
			String course=rs.getString("course");
		}
}
catch(Exception e) {
	System.out.println(e);
}
}
public static void main(String args[])
{
ConnectionDemo d=new ConnectionDemo();
d.connection();
d.dataoperation();
}

}

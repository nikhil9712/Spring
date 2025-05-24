package jdbcMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertConvent {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//load the driver class by 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Citizen","root","9712");
		Statement st=con.createStatement();
		//st.execute("insert into convent values(3,'sonu',5,'Wardha')");
		st.execute("delete from convent where id=3");
		System.out.println("Value inserted");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}

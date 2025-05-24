package jdbcMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.Statement;


public class CreateDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //throws exception if url does not contain correct driver class url
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Citizen" ,"root", "9712");
       Statement st= con.createStatement();
       st.executeUpdate("create table convent(id int,name varchar(20),age int,location varchar(20))");
       System.out.println("Table created ");
	}
	}

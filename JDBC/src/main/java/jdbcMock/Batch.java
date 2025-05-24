package jdbcMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Citizen","root","9712");
				Statement s=con.createStatement();
				s.addBatch("insert into Convent values(3,'Jayesh',45,'Mumbai')");
				s.addBatch("insert into Convent values(4,'Mahesh',30,'Pune')");
				
				s.executeBatch();
				System.out.println("successful");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

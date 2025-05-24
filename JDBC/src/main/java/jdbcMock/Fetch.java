package jdbcMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fetch {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Citizen", "root", "9712");
			PreparedStatement ps=con.prepareStatement("select * from Convent");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
				System.out.println("********");
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				System.out.println(rs.getString("location"));
			}
			
		}
	  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

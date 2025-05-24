package jdbcMock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatement {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Citizen","root","9712");
			java.sql.PreparedStatement ps=con.prepareStatement("select * from convent where id=?");
			System.out.println("Enter values: ");
			ps.setInt(1, sc.nextInt());
//			ps.setString(2, sc.next());
//			ps.setInt(3, sc.nextInt());
//			ps.setString(4, sc.next());
			
			int n=ps.executeUpdate();
			if (n>0) {
				System.out.println("Successful");
			} else {
				System.out.println("Failed");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

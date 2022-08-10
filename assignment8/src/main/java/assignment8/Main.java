package assignment8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
import java.sql.PreparedStatement;


public class Main {

	public static void main(String[] args) throws SQLException{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Driver myDriver = new com.mysql.cj.jdbc.Driver();
			//DriverManager.registerDriver(myDriver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_company", "root", "hclsql1324");

			stmt = con.createStatement();
			String sql = "";
			for(int i = 0; i < 10; i++) {
				sql = "INSERT INTO user(first_name, last_name, email, username, password, email_verified) VALUES ('fname" + i + "', 'lname" + i + "', 'email" + i + "@hcl.com', 'username" + i + "', 'pword" + i + "', TRUE);";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			}
			
			rs = stmt.executeQuery("SELECT first_name, last_name, email FROM user;");
			
			while (rs.next()) {
				System.out.println(rs.getString("first_name") + ", " + rs.getString("last_name") + ", " + rs.getString("email"));
			}
			
			for(int i = 0; i < 10; i++) {
				sql = "UPDATE user SET last_name = 'newname" + i + "' WHERE last_name = 'lname" + i + "';";
				System.out.println(sql);
				stmt.executeUpdate(sql);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
			con.close();
		}
		
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_company", "root", "hclsql1324");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

}

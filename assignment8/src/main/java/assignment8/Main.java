package assignment8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;


public class Main {

	public static void main(String[] args) throws SQLException{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/INFORMATION_SCHEMA", "root", "hclsql1324");

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from TABLES");

			while (rs.next()) {
				System.out.println(rs.getString("TABLE_NAME"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
			con.close();
		}

	}

}

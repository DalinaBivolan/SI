package ConexiuneBD;

import java.sql.*;

public class ConexiuneDB {
	protected static Connection GetConnection() throws ClassNotFoundException{
		String myUrl = null;
		Connection con = null;
		try
		{
			String myDriver = "com.mysql.jdbc.Driver";
			myUrl = "jdbc:mysql://localhost:3306/inspectoratpolitie";
			Class.forName(myDriver);
			return DriverManager.getConnection(myUrl, "root", "dalina23");
		}
		catch (SQLException e)
		{
			StackTraceElement[] st = Thread.currentThread().getStackTrace();
			System.err.println("GenericOperatii.GetConnection a dat eroare, mesajul este: " + st[2] + e.getMessage());
			return null;
		}
		finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


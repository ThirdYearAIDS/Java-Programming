package JavaDataBaseConnectivity;

import java.sql.*;

public class JDBC {
	public static void main(String[] args) throws Exception {
		
		String sql = "SELECT name FROM jdbc WHERE id = 3;";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "abc123";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

        rs.next();
        String name = rs.getString(1);
        System.out.println(name);

        con.close();
	}
}

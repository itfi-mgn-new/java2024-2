package lesson14;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try(final Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres", 
				"postgres", 
				"postgres")) {
			System.err.println("connected");
			
			try(final Statement	stmt = conn.createStatement()) {
				stmt.executeUpdate("drop table if exists x");
				stmt.executeUpdate("create table x(y integer, z text)");
				stmt.executeUpdate("insert into x(y,z) values(10,'test string')");
				stmt.executeUpdate("insert into x(y,z) values(20,'test string 2')");
				
//				CallableStatement c;
				try(final ResultSet	rs = stmt.executeQuery("select * from x")) {
					final ResultSetMetaData rsmd = rs.getMetaData();
					
					System.err.println("count="+rsmd.getColumnCount());
					for(int index = 1; index <= rsmd.getColumnCount(); index++) {
						System.err.println("name["+index+"]="+rsmd.getColumnName(index));
					}
					
					while (rs.next()) {
						System.err.println("y="+rs.getInt(1));
						System.err.println("z="+rs.getString("z"));
					}
				}
			}
			
			final DatabaseMetaData meta = conn.getMetaData();

			try(final PreparedStatement	ps = conn.prepareStatement(
								"insert into x(y,z) values(?,?)")) {
				ps.setInt(1, 15);
				ps.setString(2, "sdsdsd");
				ps.execute();

				ps.setInt(1, 25);
				ps.setString(2, "bgfgbvgf");
				ps.execute();
			}
			
			
			conn.setAutoCommit(false);
			conn.commit();
			conn.rollback();
			
			
		}
	}
}

import java.sql.*;
public class DataBase {
	
	//Driver & Database URL setting
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/johnsjose";
	
	//USERNAME & PASSWORD CREATING
	static final String USER = "johns";
	static final String PWD = "123";
	
	public static void main(String[] args){  //throws SQLException,ClassNotFoundException;
		Connection con = null;
		Statement statement = null;
		try{
			//2.Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			//3.Open a connection
			System.out.println("Connection to database...");
			con = DriverManager.getConnection(DB_URL,USER,PWD);
			
			//4.Execute a query
			System.out.println("Creating database...");
			statement = con.createStatement();
			
			String sql = "create table johns " +
					"(roll_number integer not null, " +
							" first_name varchar(50), " +
					" last_name varchar(50), " +
							" age integer, " +
					" primary key ( roll_number ))";
					
					int i = statement.executeUpdate(sql);
					System.out.println("Table Created,"+"Value of i="+i);
					
			/*String sql = "create database JohnsJose";
			boolean result = statement.execute(sql);
			System.out.println(result);
			System.out.println("Database created successfully...");*/
			
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (statement != null)
					statement.close();
				if(con != null)
					con.close();
			} 
			catch (SQLException e) {
				
			}

		}
	}
}
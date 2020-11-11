package com.cybage.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static String dbUrl;
	public static String dbUser;
	public static String dbPassword;
	static {
		try {
			//FileReader fr = new FileReader("C:\\miniproject2\\Deccan sports club\\deccansortsclub\\app.properties"); // reading file
			//Properties props = new Properties(); // properties to convert data into key value
			//props.load(fr);
			dbUrl = "jdbc:mysql://localhost:3306/deccansportclub";
			dbUser = "root";
			dbPassword = "cybage@123";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// without connection pool
	 public static Connection getConnection() throws Exception{
	 Class.forName("com.mysql.cj.jdbc.Driver"); //class will be loadedautomatically (thin driver)
	 Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
	 return con;
	 }

	// getting connection from connection pool
//	public static Connection getConnection() throws Exception {
//		Connection con = getDataSource().getConnection();
//		return con;
//	}

//	private static BasicDataSource getDataSource() {
//		BasicDataSource ds = new BasicDataSource();
//		ds.setUrl(dbUrl);
//		ds.setUsername(dbUser);
//		ds.setPassword(dbPassword);
//		ds.setMinIdle(5);
//		ds.setMaxIdle(10);
//		ds.setMaxOpenPreparedStatements(100);
//		return ds;
//	}
}
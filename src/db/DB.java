package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	private static Connection getConnection() throws FileNotFoundException, IOException {
		if (conn == null) {
			try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url,props);
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		} 
		return conn;
		
	}

	private static void closeConnection() {
		if (conn != null) {
			try {
			conn.close();
			}
			catch (SQLException e ){
				throw new DbException (e.getMessage());
			}
		}
		
	}
	
	private static Properties loadProperties() throws FileNotFoundException, IOException {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		
		}
	}
	


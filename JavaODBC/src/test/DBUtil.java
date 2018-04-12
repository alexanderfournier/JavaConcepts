package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	
	private static final String oraUser="q";
	private static final String oraPass = "q";
	private static final String oraUrl = "q";
	private static final String mysqlUser= "root";
	private static final String mysqlPass= "Analytics2!";
	private static final String mysqlUrl= "jdbc:mysql://localhost:3306/world";
	
	
	public static Connection getConnection(Dbtype dbtype) throws SQLException{
		switch(dbtype) {
		case ORACLE:
			return DriverManager.getConnection(oraUrl,oraUser , oraPass);
			
		case MYSQL:
			return DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPass);
		
		default:
		return	null;
	}
	
		
	}
	
	
	



}

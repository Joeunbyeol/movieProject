package db;

 
import java.sql.Connection;
import java.sql.DriverManager;

public class dbCommon {

	public static Connection con;
	public static void setDBConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@210.221.253.215:1521:xe","five","oracle");
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 
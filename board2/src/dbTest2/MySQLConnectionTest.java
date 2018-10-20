package dbTest2;
import java.sql.*;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/bbs?serverTimezone=UTC";
	private static final String USER = "newuser"; //DB ID
	private static final String PW = "newuser"; //DB PASSWORD

	public void test() throws Exception{
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("成功的にDBに連動されました"); // 연결시 콘솔창 메세지
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

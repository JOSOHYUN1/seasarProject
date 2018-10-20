package dbTest2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbTest2.entity.Board;
import dbTest2.form.boardForm;

public class BoardDao {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/bbs?serverTimezone=UTC";
	private static final String USER = "newuser"; // DB ID
	private static final String PW = "newuser"; // DB PASSWORD

	public List<Board> boardTBLAllSeclect() throws Exception {

		List<Board> list = new ArrayList<Board>();

		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("===boardTBLAllSeclect==="); // 연결시 콘솔창 메세지

			String query = "SELECT * FROM board";

			// create the java statement
			Statement st = con.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next()) {
				Board board = new Board();

				board.setBoardNo(rs.getInt("BOARD_NUM"));
				board.setWriter(rs.getString("USER_ID"));
				board.setTitle(rs.getString("TITLE"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getString("REGDATE"));

				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


	public void boardTBLInsert(boardForm boardform) throws Exception {
		System.out.println(boardform+"88888888");

		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("===boardTBLInsert===");

			String query = "INSERT INTO board(USER_ID, TITLE, CONTENT) VALUES(?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, boardform.writer);
			pstmt.setString(2, boardform.title);
			pstmt.setString(3, boardform.content);

			pstmt.execute();

			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boardForm boardTBLOneSeclect(int boardNo) throws Exception {

		boardForm result = new boardForm();

		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("===boardTBLOneSeclect===");

			String query = "SELECT * FROM board WHERE BOARD_NUM = " + boardNo;

			// create the java statement
			Statement st = con.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next()) {
				result.setBoardNo(rs.getInt("BOARD_NUM"));
				result.setWriter(rs.getString("USER_ID"));
				result.setTitle(rs.getString("TITLE"));
				result.setContent(rs.getString("CONTENT"));
				result.setRegdate(rs.getString("REGDATE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}


	public void boardTBLUpdate(boardForm boardform) throws Exception {
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("===boardTBLUpdate===");

			String query = "UPDATE board SET USER_ID = ?, TITLE = ?, CONTENT = ? WHERE BOARD_NUM = ?";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, boardform.writer);
			pstmt.setString(2, boardform.title);
			pstmt.setString(3, boardform.content);
			pstmt.setInt(4, boardform.boardNo);//NullPointerException

			System.out.println(boardform.toString() + "111111111");

			pstmt.execute();

			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void boardTBLDelete(boardForm boardform) throws Exception {
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("===boardTBLDelete===");

			String query = "DELETE FROM board WHERE BOARD_NUM = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, boardform.getBoardNo());
			System.out.println(boardform.toString() + "111111111");
			pstmt.execute();

			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}

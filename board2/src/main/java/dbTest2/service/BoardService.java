package dbTest2.service;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;

import dbTest2.dao.BoardDao;
import dbTest2.entity.Board;
import dbTest2.form.boardForm;

public class BoardService {
	public JdbcManager jdbcManager;


	/**
	 *
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public List<Board> boardListAllSeclect() throws Exception {

		BoardDao boardDao = new BoardDao();

		List<Board> list = boardDao.boardTBLAllSeclect();

		return list;
	}

	public void boardListInsert(boardForm boardform) throws Exception {
		BoardDao boardDao = new BoardDao();

		boardDao.boardTBLInsert(boardform);

	}

	public boardForm boardListOneSeclect(int boardNo) throws Exception {
		BoardDao boardDao = new BoardDao();

		boardForm result = boardDao.boardTBLOneSeclect(boardNo);

		return result;
	}

	public void boardListUpdate(boardForm boardform) throws Exception{
		BoardDao boardDao = new BoardDao();
		boardDao.boardTBLUpdate(boardform);

	}

	public void boardListDelete(boardForm boardform) throws Exception {
		BoardDao boardDao = new BoardDao();
		boardDao.boardTBLDelete(boardform);

	}

}

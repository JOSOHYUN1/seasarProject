package dbTest2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {
	@Id
    @GeneratedValue
    public Integer boardNo;

	public String title;

	public String content;

	public String writer;

	public String regdate;

	public Integer getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Integer boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String toString() {
	    //return "\n\nID:" + id + "\nName:" + name + "\n\n"+"Dob"+dob;
		return "No "+boardNo+"title "+title+"writer "+writer+"date "+regdate;
	  }

}

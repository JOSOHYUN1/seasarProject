package dbTest2.form;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;

public class boardForm {

	public Integer boardNo;

	@Required(msg = @Msg(key="제목을 입력해주십시오.", resource = false))
	public String title;

	@Required(msg = @Msg(key="내용을 입력해주십시오.", resource = false))
	@Maxlength(maxlength = 50, msg = @Msg(key="내용은 최대 50자까지입니다.", resource = false))
	public String content;

	@Required(msg = @Msg(key="작성자를 입력해주십시오.", resource = false))
	@Maxlength(maxlength = 10, msg = @Msg(key="작성자는 최대 10자까지입니다.", resource = false))
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

	@Override
	public String toString() {
		return "boardForm [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + "]";
	}

	//20181019_19:10追加
//	public ActionMessages validate(){
//		ActionMessages errors = new ActionMessages();
//
//		if (writer.length() == 0) {
//			errors.add("writer", new ActionMessage("작성자를 입력해주십시오.", false));
//		}else if(writer.length() >10){
//			errors.add("writer", new ActionMessage("작성자는 10글자 이내로 입력해주십시오.", false));
//		}
//
//		return errors;
//
//	}

}

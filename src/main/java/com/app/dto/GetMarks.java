package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetMarks {
	public int examid;
	public int myrollno;
	public String cls;
	
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public int getMyrollno() {
		return myrollno;
	}
	public void setMyrollno(int myrollno) {
		this.myrollno = myrollno;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}

}

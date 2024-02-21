package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddMarks {
	public String cls;
	public String subject;
	public String date;
	public int obtmarks;
	public int total;
	public String remark;
	public int examid;
	public int myrollno;
	
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getObtmarks() {
		return obtmarks;
	}
	public void setObtmarks(int obtmarks) {
		this.obtmarks = obtmarks;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
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
	
	
}

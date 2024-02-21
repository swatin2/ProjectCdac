package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentAttendance {
	public int myrollno;
	public String date;
	
	public int getMyrollno() {
		return myrollno;
	}
	public void setMyrollno(int myrollno) {
		this.myrollno = myrollno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}

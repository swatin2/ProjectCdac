package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PromoteStudent {
	public String fromcls;
	public String tocls;
	
	public String getFromcls() {
		return fromcls;
	}
	public void setFromcls(String fromcls) {
		this.fromcls = fromcls;
	}
	public String getTocls() {
		return tocls;
	}
	public void setTocls(String tocls) {
		this.tocls = tocls;
	}
	
}

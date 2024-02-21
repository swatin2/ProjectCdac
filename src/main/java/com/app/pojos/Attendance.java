package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attendance")
@NoArgsConstructor
@Data
public class Attendance extends BaseEntity{
	@NotNull(message = "Date can't be blank")
	public LocalDate date;
	@NotEmpty(message = "class can't be blank")
	@Column(name = "class", length = 10)
	public String cls;
	@NotEmpty(message = "Subject can't be blank")
	@Column(length = 15)
	public String subject;
	@NotEmpty(message = "Remark can't be blank")
	@Column(length = 10)
	public String remark;
	@ManyToOne()
	@JoinColumn(name = "roll_no", nullable = false)
	public Student rollNo;

	public Attendance(LocalDate date, String cls, String subject, String remark) {
		super();
		this.date = date;
		this.cls = cls;
		this.subject = subject;
		this.remark = remark;
	}

	public Attendance() {
		super();
	}
	

}

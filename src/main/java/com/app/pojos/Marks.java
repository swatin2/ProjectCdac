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
@Table(name = "marks")
@NoArgsConstructor
@Data
public class Marks extends BaseEntity {
	@NotEmpty(message = "class can't be blank")
	@Column(name = "class", length = 5)
	public String cls;
	@NotEmpty(message = "Subject can't be blank")
	@Column(length = 15)
	public String subject;
	@NotNull(message = "Date can't be blank")
	public LocalDate date;
	@NotNull(message = "Obtained marks can't be blank")
	public int obt_marks;
	@NotNull(message = "Total marks can't be blank")
	public int total;
	@NotEmpty(message = "Remark can't be blank")
	@Column(length = 15)
	public String remark;
	@ManyToOne()
	@JoinColumn(name = "exam_id", nullable = false)
	public Exam examId;
	@ManyToOne()
	@JoinColumn(name = "roll_no", nullable = false)
	public Student rollNo;
	public Marks(@NotEmpty(message = "class can't be blank") String cls,
			@NotEmpty(message = "Subject can't be blank") String subject,
			@NotNull(message = "Date can't be blank") LocalDate date,
			@NotNull(message = "Obtained marks can't be blank") int obt_marks,
			@NotNull(message = "Total marks can't be blank") int total,
			@NotEmpty(message = "Remark can't be blank") String remark, Exam examId, Student rollNo) {
		super();
		this.cls = cls;
		this.subject = subject;
		this.date = date;
		this.obt_marks = obt_marks;
		this.total = total;
		this.remark = remark;
		this.examId = examId;
		this.rollNo = rollNo;
	}
	public Marks() {
		super();
	}
	
	
	
	
}

package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exam")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Exam extends BaseEntity {
	@NotEmpty(message = "Exam type can't be blank")
	@Column(length = 20)
	public String examType;
	@JsonIgnore
	@OneToMany(mappedBy = "examId", cascade = CascadeType.ALL,orphanRemoval = true)
	//@OneToMany(mappedBy = "examId")
	public List<Marks> marks = new ArrayList<>();
	
	public Exam() {
		super();
		
		
	}

	public Exam(@NotEmpty(message = "Exam type can't be blank") String examType, List<Marks> marks) {
		super();
		this.examType = examType;
		this.marks = marks;
	}
	
}

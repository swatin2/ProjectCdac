package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Data
public class Student extends BaseEntity {
	@NotEmpty(message = "First Name can't be blank")
	@Length(message = "Invalid First Name length!!!!")
	@Column(name = "fname", length = 30)
	public String fname;
	@NotEmpty(message = "Last Name can't be blank")
	@Length(message = "Invalid Last Name length!!!!")
	@Column(name = "lname", length = 30, unique = true)
	public String lname;
	@NotNull(message = "Date of birth can't be blank")
	public LocalDate dob;
	@NotEmpty(message = "gender can't be blank")
	@Column(length = 15)
	public String gender;
	@Length(max = 13, message = "contact number must be of 10 characters")
	@Length(min = 10, message = "contact number must be of 10 characters")
	public String contact;
	@NotEmpty(message = "user name can't be blank")
	@Column(unique = true, length = 20)
	public String userName;
	@NotEmpty(message = "password  can't be blank")
	@Column(length = 20)
	public String password;
	@NotEmpty(message = "class can't be blank")
	@Column(name = "class", length = 15)
	public String cls;
	@NotEmpty(message = "address must be provided")
	@Column(length = 100)
	public String address;
	@NotNull(message = "fees can't be blank")
	public double fees;
	@NotEmpty(message = "division can't be blank")
	@Column(length = 5)
	public String division;

	@JsonIgnore
	@OneToMany(mappedBy = "rollNo", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Attendance> attendance = new ArrayList<>();
	@JsonIgnore
	@OneToMany(mappedBy = "rollNo", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Marks> marks = new ArrayList<>();

	public Student(String fname, String lname, String dob, String gender, String contact, String userName,
			String password, String cls, String address, double fees, String division) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = LocalDate.parse(dob);
		this.gender = gender;
		this.contact = contact;
		this.userName = userName;
		this.password = password;
		this.cls = cls;
		this.address = address;
		this.fees = fees;
		this.division = division;
	}

	public Student() {
		super();
	}

	public Student(
			@NotEmpty(message = "First Name can't be blank") @Length(message = "Invalid First Name length!!!!") String fname,
			@NotEmpty(message = "Last Name can't be blank") @Length(message = "Invalid Last Name length!!!!") String lname,
			@NotNull(message = "Date of birth can't be blank") LocalDate dob,
			@NotEmpty(message = "gender can't be blank") String gender,
			@Length(max = 13, message = "contact number must be of 10 characters") @Length(min = 10, message = "contact number must be of 10 characters") String contact,
			@NotEmpty(message = "user name can't be blank") String userName,
			@NotEmpty(message = "password  can't be blank") String password,
			@NotEmpty(message = "class can't be blank") String cls,
			@NotEmpty(message = "address must be provided") String address,
			@NotNull(message = "fees can't be blank") double fees,
			@NotEmpty(message = "division can't be blank") String division, List<Attendance> attendance,
			List<Marks> marks) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.userName = userName;
		this.password = password;
		this.cls = cls;
		this.address = address;
		this.fees = fees;
		this.division = division;
		this.attendance = attendance;
		this.marks = marks;
	}
	
	

}

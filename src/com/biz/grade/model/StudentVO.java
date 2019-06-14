package com.biz.grade.model;

public class StudentVO {
	
	private int number;
	private String name;
	private int grade;
	private String addr;
	private String tel;

	private String detp;

	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public StudentVO(int number, String name, int grade, String addr, String tel, String detp) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
		this.addr = addr;
		this.tel = tel;
		this.detp = detp;
	}



	public StudentVO(int number, String name, int grade) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDetp() {
		return detp;
	}

	public void setDetp(String detp) {
		this.detp = detp;
	}

	@Override
	public String toString() {
		return "StudentVO [number=" + number + ", name=" + name + ", grade=" + grade + ", addr=" + addr + ", tel=" + tel
				+ ", detp=" + detp + "]";
	}
	
	
	
	
	
}

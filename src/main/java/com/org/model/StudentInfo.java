package com.wipro.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="StudentInfo")
public class StudentInfo {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name ="Branchn")
	private String branch;
	@Column(name ="Emailid")
	private String email;
	@Column(name ="registerid")
	private String regno;
	@Column(name = "usernamew")
    private	String uname ;
	@Column(name = "passwordd" )
	private String pword;
	@OneToOne(cascade = CascadeType.ALL)
	private Addressinfo addr;
	
	public StudentInfo() {
		
	}

	public StudentInfo(int id, String regno, String uname, String pword,Addressinfo addr,String email,String branch) {
		super();
		this.id = id;
		this.regno = regno;
		this.uname = uname;
		this.pword = pword;
		this.addr  = addr;
		this.email = email;
		this.branch = branch;
		
	}

	public String getRegno() {
		return regno;
	}


	public void setRegno(String regno) {
		this.regno = regno;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPword() {
		return pword;
	}


	public void setPword(String pword) {
		this.pword = pword;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public Addressinfo getAddr() {
		return addr;
	}



	public void setAddr(Addressinfo addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", branch=" + branch + ", email=" + email + ", regno=" + regno + ", uname="
				+ uname + ", pword=" + pword + ", addr=" + addr + "]";
	}
	

}

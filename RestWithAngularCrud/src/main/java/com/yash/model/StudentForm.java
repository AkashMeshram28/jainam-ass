package com.yash.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Student")
public class StudentForm implements Serializable{

	/**
	 * 
	 */
//	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String sid;
	
	private String sname;
	
	private String address;
	
	private double mobno;
	
	private String email;
	
	public StudentForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentForm(String sid, String sname, String address, double mobno, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.mobno = mobno;
		this.email = email;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMobno() {
		return mobno;
	}

	public void setMobno(double mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, mobno, sid, sname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentForm other = (StudentForm) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Double.doubleToLongBits(mobno) == Double.doubleToLongBits(other.mobno) && sid == other.sid
				&& Objects.equals(sname, other.sname);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentForm [sid=");
		builder.append(sid);
		builder.append(", sname=");
		builder.append(sname);
		builder.append(", address=");
		builder.append(address);
		builder.append(", mobno=");
		builder.append(mobno);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
}

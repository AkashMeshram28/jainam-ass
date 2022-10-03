/**
 * 
 */
package com.yash.bny.training.j8.ass13;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author akash.meshram
 *
 */
public class StudentModel {

	int rollno;
	LocalDateTime date_of_addmission, dob;
	int maths, physics, chemistry, English, hindi; // marks in subjects
	String classname;

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}

	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(English, chemistry, classname, date_of_addmission, dob, hindi, maths, physics, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentModel other = (StudentModel) obj;
		return English == other.English && chemistry == other.chemistry && Objects.equals(classname, other.classname)
				&& Objects.equals(date_of_addmission, other.date_of_addmission) && Objects.equals(dob, other.dob)
				&& hindi == other.hindi && maths == other.maths && physics == other.physics && rollno == other.rollno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentModel [rollno=");
		builder.append(rollno);
		builder.append(", date_of_addmission=");
		builder.append(date_of_addmission);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", maths=");
		builder.append(maths);
		builder.append(", physics=");
		builder.append(physics);
		builder.append(", chemistry=");
		builder.append(chemistry);
		builder.append(", English=");
		builder.append(English);
		builder.append(", hindi=");
		builder.append(hindi);
		builder.append(", classname=");
		builder.append(classname);
		builder.append("]");
		return builder.toString();
	}

}

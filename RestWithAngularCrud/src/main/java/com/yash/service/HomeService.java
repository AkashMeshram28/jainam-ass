package com.yash.service;

import java.util.List;
import java.util.Optional;

import com.yash.model.StudentForm;

public interface HomeService {

	public StudentForm SaveData(StudentForm sf);
	public List<StudentForm> GetAllStudentForm();
	public void deleteData(String sid);
	public Optional<StudentForm> getStudent(String sid);
	public StudentForm updateStudent(StudentForm sf, String sid) throws Exception;
}
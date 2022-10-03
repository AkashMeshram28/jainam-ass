package com.yash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.StudentForm;
import com.yash.service.HomeService;

@RestController
@CrossOrigin("*")
public class StudentFormController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/save")
	public StudentForm SaveData(@RequestBody StudentForm sf)
	{
		StudentForm saveData = hs.SaveData(sf);
		System.out.println(saveData);
		return saveData;
//		return "Data saved successfully...!!!";
	}
	
	@GetMapping("/getAllData")
	public List<StudentForm> GetAllData()
	{
		return hs.GetAllStudentForm();
	}
	
	@DeleteMapping("/deleteData/{sid}")
	public void deleteData(@PathVariable String sid) {
		// TODO Auto-generated method stub
		hs.deleteData(sid);
	}
	
	@GetMapping("/getStudent/{sid}")
	public Optional<StudentForm> getStudent(@PathVariable String sid) {
		Optional<StudentForm> student = hs.getStudent(sid);
		
		System.out.println("enter into controller......getStudent");
		return student;
	}
	
	@PatchMapping(path= "/update/{sid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentForm updateStudent(@RequestBody StudentForm sf, @PathVariable String sid) throws Exception
	{
		StudentForm student = hs.updateStudent(sf,sid);
		System.out.println(student);
		return student;
		
	}
	
}

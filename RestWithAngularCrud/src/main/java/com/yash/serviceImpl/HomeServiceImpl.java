package com.yash.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.StudentForm;
import com.yash.repository.HomeRepository;
import com.yash.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository homeRepo;

	
	@Override
	public StudentForm SaveData(StudentForm sf) {
	// TODO Auto-generated method stub
		StudentForm student = homeRepo.save(sf);
		System.out.println("data save : " + student);
		return student;
	}

	@Override
	public List<StudentForm> GetAllStudentForm() {
	// TODO Auto-generated method stub
	return homeRepo.findAll();
	}
	
	@Override
	public void deleteData(String sid) {
		// TODO Auto-generated method stub
		homeRepo.deleteById(sid);
	}

	@Override
	public Optional<StudentForm> getStudent(String sid) {
		
//		StudentForm student = homeRepo.getById(sid);
		Optional<StudentForm> student = homeRepo.findById(sid);
		

		System.out.println("student : " + student);
		return student;
	}

	@Override
	public StudentForm updateStudent(StudentForm sf, String sid) throws Exception {
		
		Optional<StudentForm> studObj = Optional.of(new StudentForm());
		StudentForm studentForm =new StudentForm();
		StudentForm student2=null;
		try {
			studObj = getStudent(sid);
			if(!studObj.isEmpty()) {
				studentForm.setSid(sid);
				studentForm.setSname(sf.getSname());
				studentForm.setAddress(sf.getAddress());
				studentForm.setEmail(sf.getEmail());
				studentForm.setMobno(sf.getMobno());
				student2 = homeRepo.save(studentForm);
			}
		}catch(Exception e){
			throw new Exception("invalid student id");
		}
		return student2;
	}
}

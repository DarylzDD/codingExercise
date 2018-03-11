package j2eeTransferObjectPattern;

import java.util.*;


public class StudentBO {

	private List<StudentVO> studentVOs;
	
	
	public StudentBO() {
		this.studentVOs = new ArrayList<StudentVO>();
	}	
	
	public List<StudentVO> getAllStudents() {
		return this.studentVOs;
	}
	
	public void updateStudent(StudentVO student) {
		this.studentVOs.get(student.getRollNo()).setName(student.getName());
	}
	
	public void deleteStudent(StudentVO student) {
		this.studentVOs.remove(student.getRollNo());
	}
	
	public void addStudent(StudentVO student) {
		this.studentVOs.add(student);
	}
	
}

package j2eeDAOPattern;

import java.util.*;

public class StudentDaoImpl implements StudentDao {

	private List<Student> students;
	
	
	public StudentDaoImpl() {
		this.students = new ArrayList<Student>();
	}
	
	public List<Student> getAllStudents() {
		return this.students;
	}
	
	public void updateStudent(Student student) {
		this.students.get(student.getRollNo()).setName(student.getName());
		System.out.println("update students["+student.getRollNo()+"]");
	}
	
	public void deleteStudent(Student student) {
		this.students.remove(student.getRollNo());
		System.out.println("remove students["+student.getRollNo()+"]");
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
		System.out.println("add students, student:"+student.getName());
	}
	
}

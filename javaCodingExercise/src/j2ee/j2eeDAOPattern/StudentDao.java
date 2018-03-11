package j2eeDAOPattern;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudents();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Student student);
	
	public void addStudent(Student student);
	
}

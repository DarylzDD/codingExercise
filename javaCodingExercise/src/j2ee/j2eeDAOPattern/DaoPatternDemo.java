package j2eeDAOPattern;

import java.util.*;

public class DaoPatternDemo {
	
	private static void printStudents(List<Student> students) {
		System.out.println("[students]");
		for(Student student: students) {
			System.out.println("name: "+student.getName()+", rollNo: "+student.getRollNo());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDao studentDao = new StudentDaoImpl();
		
		studentDao.addStudent(new Student("Authur", 0));
		studentDao.addStudent(new Student("Austin", 1));
		
		printStudents(studentDao.getAllStudents());
		
		studentDao.addStudent(new Student("Neer", 2));
		
		printStudents(studentDao.getAllStudents());
		
		studentDao.updateStudent(new Student("Will", 2));
		
		printStudents(studentDao.getAllStudents());
		
		studentDao.deleteStudent(new Student("Will", 2));
		
		printStudents(studentDao.getAllStudents());
		
	}

}

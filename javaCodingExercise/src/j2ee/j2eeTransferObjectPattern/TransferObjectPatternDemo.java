package j2eeTransferObjectPattern;

import java.util.*;

public class TransferObjectPatternDemo {
	
	private static void printStudentVO(List<StudentVO> students) {
		System.out.println("[studentVO]");
		for(StudentVO student: students) {
			System.out.println("name: "+student.getName()+", rollNo: "+student.getRollNo());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentBO studentBO = new StudentBO();
		
		studentBO.addStudent(new StudentVO("Authur", 0));
		studentBO.addStudent(new StudentVO("Austin", 1));
		
		printStudentVO(studentBO.getAllStudents());
		studentBO.addStudent(new StudentVO("Neer", 2));
		printStudentVO(studentBO.getAllStudents());
		studentBO.updateStudent(new StudentVO("Willian", 2));
		printStudentVO(studentBO.getAllStudents());
		studentBO.deleteStudent(new StudentVO("Willian", 2));
		printStudentVO(studentBO.getAllStudents());
		
	}

}

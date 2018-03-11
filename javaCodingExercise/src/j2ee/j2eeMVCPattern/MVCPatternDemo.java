package j2eeMVCPattern;

public class MVCPatternDemo {

	public static void main(String[] args) {
		
		Student student = retriveStudentFromDatabase();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(student, view);
		
		controller.updateView();
		
		System.out.println("student, name: "+controller.getStudentName()+", rollNo: "+controller.getStudentRollNo());
		
		controller.setStudentName("lalala");
		controller.setStudentRollNo("456");
		
		controller.updateView();
		
	}
	
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("jack");
		student.setRollNo("123");
		return student;
	}
	
}

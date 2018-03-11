package j2eeMVCPattern;

public class StudentController {

	private Student model;
	private StudentView view;
	
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getStudentName() {
		return this.model.getName();
	}
	
	public void setStudentName(String name) {
		this.model.setName(name);
	}
	
	public String getStudentRollNo() {
		return this.model.getRollNo();
	}
	
	public void setStudentRollNo(String rollNo) {
		this.model.setRollNo(rollNo);
	}
	
	public void updateView() {
		this.view.printStudentDetails(this.model.getName(), this.model.getRollNo());
	}
	
}

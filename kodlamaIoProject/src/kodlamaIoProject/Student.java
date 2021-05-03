package kodlamaIoProject;

public class Student extends User{
	
	private int studentId;
	private String firstName;
	private String lastName;
	private String adress;
	
	


	public Student(int id, String email, int studentId, String firstName, String lastName, String adress) {
		super(id, email);
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
	

}

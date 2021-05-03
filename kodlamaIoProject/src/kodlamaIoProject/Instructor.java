package kodlamaIoProject;

public class Instructor extends User {
	private int instructorId;
	private String firstName;
	private String lastName;
	private String branch;
	private String course;
	


	public Instructor(int id, String email, int instructorId, String firstName, String lastName, String branch,
			String course) {
		super(id, email);
		this.instructorId = instructorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.course = course;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
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



	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
	
}

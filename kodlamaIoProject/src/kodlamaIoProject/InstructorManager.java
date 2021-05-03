package kodlamaIoProject;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " eðitmen ders ekledi.");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " eðitmen dersi sildi.");
	}
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " eðitmen dersi güncelledi.");
	}

}

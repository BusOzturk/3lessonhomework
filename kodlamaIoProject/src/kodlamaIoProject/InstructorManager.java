package kodlamaIoProject;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " e�itmen ders ekledi.");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " e�itmen dersi sildi.");
	}
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " e�itmen dersi g�ncelledi.");
	}

}

package kodlamaIoProject;

public class StudentManager {
	public void signCourse(Student student) {
		System.out.println(student.getFirstName() + " kullan�c�s� kursa kaydoldu:"  );
	}
	
	public void cancelCourse(Student student) {
		System.out.println(student.getFirstName() +" kullan�c�s� kursu sildi."   );
	}

}

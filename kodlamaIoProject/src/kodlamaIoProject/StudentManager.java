package kodlamaIoProject;

public class StudentManager {
	public void signCourse(Student student) {
		System.out.println(student.getFirstName() + " kullanıcısı kursa kaydoldu:"  );
	}
	
	public void cancelCourse(Student student) {
		System.out.println(student.getFirstName() +" kullanıcısı kursu sildi."   );
	}

}

package kodlamaIoProject;

public class Main {

	public static void main(String[] args) {
		 Instructor instructor1 = new Instructor(1, "engindemirog@gmail.com", 1, "Engin", "Demirog", "C# , Java", "Java");
		 
		 Student student1 = new Student(2, "busraozturk66@gmail.com", 1, "Büşra","Öztürk", "Adana");
		 
		 Student student2 = new Student(3, "ahmetcan@gmail.com", 2, "Ahmet","Can", "Ankara");
		 
		 Student student3 = new Student(4, "cansuyilmaz@gmail.com", 3, "Cansu","Yılmaz", "İstanbul");
		
		 
		 User[] users = {instructor1,student1,student2,student3};
		 
		 for (User user : users) {
			 
			 UserManager userManager = new UserManager();
			 userManager.addUser(user);
			 
		}
		 
		 StudentManager studentManager = new StudentManager();
		 studentManager.cancelCourse(student2);
		 
		 
		 InstructorManager instructorManager = new InstructorManager();
		 instructorManager.addCourse(instructor1);
		 instructorManager.updateCourse(instructor1);

	}

}

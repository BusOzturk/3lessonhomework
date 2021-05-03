package kodlamaIoProject;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getId());
	}
	
	public void deleteUser(User user) {
		System.out.println("Kullanýcý silindi: " + user.getId());
	}

}

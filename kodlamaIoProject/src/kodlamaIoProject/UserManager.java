package kodlamaIoProject;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getId());
	}
	
	public void deleteUser(User user) {
		System.out.println("Kullan�c� silindi: " + user.getId());
	}

}

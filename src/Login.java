import java.util.*;

public class Login {

	public String username;
	public String password;
	
	Login(){
		this.username = "nope";
		this.password = "nah";
	}
	
	//Sending a Login object as parameter, and two arrays of object
	public static String login(Admin[] admins,SuperAdmin[] superAdmins,Login l) { 
		int i = 0;
		while(i<admins.length) {
			if(admins[i].username.equals(l.username) && admins[i].getPassword().equals(l.password)) {
				return l.username;
			} else {
				int j = 0;
				while(j<superAdmins.length) {
					if(superAdmins[j].getUsername().equals(l.username) && superAdmins[j].getPassword().equals(l.password)) {
						return l.username;
					} else {
						return "notFound";
					}
				}
			}
		}
		return "notSure";
	}
	
	public void getLoginInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username: ");
		this.username = scan.next();
		System.out.println("Enter password: ");
		this.password = scan.next();
	}
}

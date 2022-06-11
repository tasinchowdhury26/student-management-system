import java.util.*;

public class Admin {

	public String username;
	private String password;
	private static String designation = "Admin";
	
	Admin(){
		this.username = "threat";
		this.password = "1234";
	}
	Admin(String username,String password){
		this.username = username;
		this.password = password;
	}
	public static String getDesignation() {
		return designation;
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
}

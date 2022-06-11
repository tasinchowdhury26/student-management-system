import java.util.*;

public class SuperAdmin {
	private String username;
	private String password;
	private static String designation = "SuperAdmin";

	SuperAdmin(){
		username = "threat";
		password = null;
	}
	SuperAdmin(String username,String password){
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public static String getDesignation() {
		return designation;
	}
	
}

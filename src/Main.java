import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("- - - - - Welcome to the portal - - - - -\n\n\n\n\n");
		
		Admin[] admins = new Admin[3];	//this is an array of Admin objects
		admins[0] = new Admin("admin1","1234");
		admins[1] = new Admin("admin2","1234");
		admins[2] = new Admin("admin3","1234");
		
		SuperAdmin[] superAdmins = new SuperAdmin[2];	//this is an array of SuperAdmin objects
		superAdmins[0] = new SuperAdmin("super1","12345");
		superAdmins[1] = new SuperAdmin("super2","12345");
		
		//Creating the data directory and necessary files in it
		File dir = new File("Data");
		dir.mkdir();
		String dataPath = dir.getAbsolutePath();	
//		System.out.println(dataPath); //view directory location
		File studentsData = new File(dataPath+"/students.txt");
		File adminsData = new File(dataPath+"/admins.txt");
		File superAdminsData = new File(dataPath+"/superAdmins.txt");
		
		try {
			studentsData.createNewFile();	//creating the necessary data files
			adminsData.createNewFile();
			superAdminsData.createNewFile();
			System.out.println("Files: OK");
			}catch(Exception e){
			System.out.println(e);
		}
		
		//Writing administrator and superAdmin info into the file 
		try {
			Formatter writeStudents = new Formatter("F:/Stamford/Spring 2022/student-management-system/Data/students.txt");
			writeStudents.format("%s %s %f %s","Amber","301",3.24,"due");
			writeStudents.format("%s %s %f %s","Johny","300",3.47,"payed");
			writeStudents.format("%s %s %f %s","Rafael","302",3.24,"payed");
			writeStudents.format("%s %s %f %s","Katy","304",3.10,"due");
			writeStudents.format("%s %s %f %s","Emma","303",3.06,"due");
			
			Formatter writeAdmins = new Formatter("F:/Stamford/Spring 2022/student-management-system/Data/admins.txt");
			for(int i = 0;i<admins.length;i++) {
				writeAdmins.format("%s %s %s\r\n",admins[i].getUsername(),admins[i].getPassword(),Admin.getDesignation());
			}
			
			Formatter writeSuperAdmins = new Formatter("F:/Stamford/Spring 2022/student-management-system/Data/superAdmins.txt");
			writeSuperAdmins.format("%s %s %s\r\n","Username","Password","Designation");
			for(int i = 0;i<superAdmins.length;i++) {
				writeSuperAdmins.format("%s %s %s\r\n",superAdmins[i].getUsername(),superAdmins[i].getPassword(),SuperAdmin.getDesignation());
			}
			
			writeStudents.close();
			writeAdmins.close();
			writeSuperAdmins.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Please login\n\n");
		Login signIn = new Login();
		signIn.getLoginInfo();
		String loggedInUser = Login.login(admins, superAdmins, signIn);
		System.out.println("Hello "+loggedInUser+"\n");
		
		int option,numberOfStudents = 0;
		System.out.println("Choose an option: ");
		System.out.println("1.View All\t2.Add Students");
		option = scan.nextInt();
		if(option == 1) {
			try {
				Scanner readStudents = new Scanner(studentsData);
				while(readStudents.hasNext()) {
					String name = readStudents.next();
					String id = readStudents.next();
					double cgpa = readStudents.nextDouble();
					String payment = readStudents.next();
					System.out.println("Name: "+name+"\nID: "+id+"\nCGPA: "+cgpa+"\nPayment: "+payment+"\n\n");
				}
				readStudents.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("Empty");
		}
//		if(option == 1) {
//			numberOfStudents = scan.nextInt();
//			Student[] students = new Student[numberOfStudents];
//			for(int i=0;i<students.length;i++) {
//				System.out.println("Enter Student"+i+1+" details\n");
//				System.out.println("Name: ");
//				students[i].name = scan.next();
//				System.out.println("ID: ");
//				String ID = students[i].getID();
//				ID = scan.next();
//				System.out.println("Enter CGPA: ");
//				double cgpa = students[i].getCGPA();
//				cgpa = scan.nextDouble();
//				String payment = students[i].getPaymentStatus();
//				payment = scan.next();
//			}
//		}
		
		
		
		
		try {
			Scanner readAdmins = new Scanner(adminsData);	//getting the files to be read using Scanner object
			Scanner readSuperAdmins = new Scanner(superAdminsData);
			Scanner readStudents = new Scanner(studentsData);
			
//			while(readAdmins.hasNext()) {
//				String user = readAdmins.next();
//				String pw = readAdmins.next();
//				String desig = readAdmins.next();
//				if(uname == user) {
//					System.out.println("Name: "+user+" password: "+pw+" desig: "+desig);					
//				}
//			}
			readAdmins.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

}

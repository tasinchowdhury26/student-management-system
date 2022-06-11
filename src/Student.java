import java.util.*;

public class Student {
	
	public String name;
	private String id;
	private double cgpa;
	private String paymentStatus;
	
	
	Student(){
		this.name = "unknown";
		this.id = null;
		this.cgpa = 0.0;
		this.paymentStatus = "Not Found";
	}
	Student(String name,String id,double cgpa,String paymentStatus){
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.paymentStatus = paymentStatus;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public double getCGPA() {
		return cgpa;
	}
	public void setCGPA(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setpaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
}

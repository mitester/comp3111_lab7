package main;
import java.lang.String;

public class Student {
	public Student(String id, String name, String email, int k1, int k2,boolean k3_tick1, boolean k3_tick2, boolean preference, String concerns)
		{
			studentId = id;
			studentName = name;
			this.email = email;
			K1Energy = k1;
			K2Energy = k2;
			K3_Tick1 = k3_tick1;
			K3_Tick2 = k3_tick2;
			myPreference = preference;
			this.concerns = concerns;
		}
	
	public static void main(String arg[]) {
		System.out.println("Hello, JUnit 4!");	
		Student stu = new Student("20010003", "Peter Alexander", "peter@ust.hk", 90, 80, true, true, true, "I want to be a leader");
		System.out.println("Success!");
	}
	
	private String studentId;
	private String studentName;
	private String email;
	private int K1Energy;
	private int K2Energy;
	private boolean K3_Tick1;
	private boolean K3_Tick2;
	private boolean myPreference;
	private String concerns;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getK1Energy() {
		return K1Energy;
	}
	public void setK1Energy(int k1Energy) {
		K1Energy = k1Energy;
	}
	public int getK2Energy() {
		return K2Energy;
	}
	public void setK2Energy(int k2Energy) {
		K2Energy = k2Energy;
	}
	public boolean isK3_Tick1() {
		return K3_Tick1;
	}
	public void setK3_Tick1(boolean k3_Tick1) {
		K3_Tick1 = k3_Tick1;
	}
	public boolean isK3_Tick2() {
		return K3_Tick2;
	}
	public void setK3_Tick2(boolean k3_Tick2) {
		K3_Tick2 = k3_Tick2;
	}
	public boolean isMyPreference() {
		return myPreference;
	}
	public void setMyPreference(boolean myPreference) {
		this.myPreference = myPreference;
	}
	public String getConcerns() {
		return concerns;
	}
	public void setConcerns(String concerns) {
		this.concerns = concerns;
	}
}

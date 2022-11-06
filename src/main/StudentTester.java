package main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StudentTester {
	public static Student student;
	
	@Before
	public void setUp() throws Exception {
		Student stu = new Student("20010003", "Peter Alexander", "peter@ust.hk", 90, 80, true, true, true, "I want to be a leader");
		student = stu;
	}
	
	@Test
	public void getStudentId() {
		assertEquals("20010003", student.getStudentId());
	}
	
	@Test
	public void getStudentName() {
		assertEquals("Peter Alexander", student.getStudentName());
	}
	
	@Test
	public void getEmail() {
		assertEquals("peter@ust.hk", student.getEmail());
	}
	
	@Test
	public void getK1() {
		assertEquals(90, student.getK1Energy());
	}
	
	@Test
	public void getK2() {
		assertEquals(80, student.getK2Energy());
	}
	
	@Test
	public void getK3Tick1() {
		assertEquals(true, student.isK3_Tick1());
	}
	
	@Test
	public void getK3Tick2() {
		assertEquals(true, student.isK3_Tick2());
	}
	
	@Test
	public void getMyPreference() {
		assertEquals(true, student.isMyPreference());
	}
	
	@Test
	public void getConcerns() {
		assertEquals("I want to be a leader", student.getConcerns());
	}
}

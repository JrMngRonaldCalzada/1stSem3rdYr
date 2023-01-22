package SecondYearOOP;
import java.util.*;
import java.io.*;

class Student {
	String student_name;
	int student_id;
	String student_dept;
	
	Student(String student_name, int student_id, String student_dept) {
		this.student_name = student_name;
		this.student_id = student_id;
		this.student_dept = student_dept;
	}
}

class Branch {
	String Branch_name;
	private List<Student> students;
	
	Branch(String Branch_name, List<Student> students){
		this.Branch_name = Branch_name;
		this.students = students;
	}
	
	public List<Student> getStudents(){
		return students;
	}
}

class Institute {
	String instituteName;
	private List<Branch> branches;
	
	Institute(String instituteName, List<Branch> branches){
		this.instituteName = instituteName;
		this.branches = branches;
	}
	
	public int getAllStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		
		for(Branch branch : branches) {
			students = branch.getStudents();
			for(Student s : students) {
				noOfStudents++;
			}
		} return noOfStudents;
	}
}

public class Blanco {
	 public static void main(String[] args) {
		 
		Student s1 = new Student("Ako", 1, "IT");
		Student s2 = new Student("Ikaw", 1, "IT");
		Student s3 = new Student("kayo", 1, "BSIT");
		Student s4 = new Student("Tayo", 1, "BSIT");
		
		List<Student> IT_students = new ArrayList<Student>();
		IT_students.add(s1);
		IT_students.add(s2);
		
		List<Student> BSIT_students = new ArrayList<Student>();
		BSIT_students.add(s3);
		BSIT_students.add(s4);
		
		Branch IT = new Branch("IT", IT_students);
		Branch BSIT = new Branch("BSIT", BSIT_students);
		
		List<Branch> branches = new ArrayList<Branch>();
		branches.add(IT);
		branches.add(BSIT);
		
		Institute institute = new Institute("NIT", branches);
		System.out.print("Total students in NIT institute: ");
		System.out.print(institute.getAllStudentsInInstitute());
	}
}

package com.assignment;

class AgeNotValidException extends Exception{
	String message;
	AgeNotValidException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

class NameNotValidException extends Exception{
	String message;
	public NameNotValidException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

class Student{
	int rollno, age;
	String name, course;
	
	public Student(int rollno, String name, int age, String course) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
//		validateAge();
//		validateName();
	}
	
	void validateAge() throws AgeNotValidException {
		if(this.age<15 || this.age>21) {
			throw new AgeNotValidException(this.age + " is not a valid age.");
		}
	}
	
	void validateName() throws NameNotValidException {
		if (!name.matches("[a-zA-Z]+")) {
			throw new NameNotValidException(this.name + " is not a valid name.");
		}
	}
	
	void printDetails() {
		System.out.println("ROLL NO. : " +  this.rollno);
		System.out.println("NAME : " + this.name);
		System.out.println("AGE : " + this.age);
		System.out.println("COURSE : " + this.course);
	}
}

public class exception_8 {
	public static void main(String[] args) {
		try {
			Student s1 = new Student(101, "Sourav14", 16, "JAVA Backend");
			s1.validateAge();
			s1.validateName();
			s1.printDetails();
		}catch(AgeNotValidException | NameNotValidException e) {
			System.out.println(e.getMessage());
		}
	}
}

package javaOdev_3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,"Engin","Demiro�","C#");
		Instructor instructor2 = new Instructor(1,"Engin","Demiro�","Java");
		Instructor instructor3 = new Instructor(1,"Engin","Demiro�","Python");
		
		instructor1.getCreatedCourses();
		
		Student student1 = new Student(1, "Sinan", "Fen", "Java");
		
		student1.getCurrentCourseName();
				
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();
		
		
		instructorManager.createdCourse(instructor1);
		instructorManager.createdCourse(instructor2);
		instructorManager.createdCourse(instructor3);
		System.out.println("-----------------------");
		studentManager.selectCourse(student1);
		System.out.println("-----------------------");
		userManager.Login(instructor1);
		userManager.Login(student1);
		System.out.println("-----------------------");
		userManager.Logout(instructor1);
		userManager.Logout(student1);
		
		
		
	}

}

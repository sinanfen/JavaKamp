package javaOdev_2;

public class Main {

	public static void main(String[] args) {
		//Kurs s�n�f�ndan bir referans yarat�yoruz
		Course kurs1 = new Course(1,"Java");

		Course kurs2 = new Course(2,"C#");
		
		//E�itmen s�n�f�ndan bir referans yarat�yoruz
		Instructor egitmen1 = new Instructor(1,"Engin","Demiro�",kurs1);
		
		//��renci s�n�f�ndan bir referans yarat�yoruz
		Student ogrenci1 = new Student(1,"Sinan","Fen",egitmen1);
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(kurs1);
		System.out.println("---");
		courseManager.addCourse(kurs2);
		
		System.out.println("");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(egitmen1);
		
		System.out.println("");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(ogrenci1);
		
		
	}

}

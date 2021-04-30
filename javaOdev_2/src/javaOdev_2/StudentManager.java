package javaOdev_2;

public class StudentManager {

	public void addStudent(Student ogrenci) {
		 System.out.println("��renci eklendi."
	                + "\nId: " + ogrenci.id
	                + "\nAd� Soyad�: " + ogrenci.firstName + " " + ogrenci.lastName
	                + "\n��rencinin E�itmeni: " + ogrenci.ogrInstructor.firstName + " " + ogrenci.ogrInstructor.lastName);
	}
	
	public void updateStudent(Student ogrenci) {
		 System.out.println("��renci g�ncellendi."
	                + "\nId: " + ogrenci.id
	                + "\nAd� Soyad�: " + ogrenci.firstName + " " + ogrenci.lastName
	                + "\n��rencinin E�itmeni: " + ogrenci.ogrInstructor.firstName + " " + ogrenci.ogrInstructor.lastName);
	}
	
	public void deleteStudent(Student ogrenci) {
		 System.out.println("��renci silindi."
	                + "\nId: " + ogrenci.id
	                + "\nAd� Soyad�: " + ogrenci.firstName + " " + ogrenci.lastName
	                + "\n��rencinin E�itmeni: " + ogrenci.ogrInstructor.firstName + " " + ogrenci.ogrInstructor.lastName);
	}
}

package p1;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class DatabaseOperation {

	public static void main(String[] args) {
		Session hibernate = HibernateConnection.getHibernateLink();

		Address a = new Address("ABC-123","New Delhi", "Delhi", "India", 110058);
		Student s1 = new Student("Hemlata", "Development", 5, "Good to Deploy", "Facebook");
		s1.setId(103);
		s1.setAddress(a);

		 insertSudent(hibernate, s1);
		//getStudentById(hibernate, 102);
		//doUpdate(hibernate, 102);
	}

	public static void doUpdate(Session hibernate, int id) {
		
		Transaction t1 = hibernate.beginTransaction();

		Student student = (Student) hibernate.get(Student.class, id);
		System.out.println(student);

		System.out.println("------------ calling some setter methods-------------------------");

		student.setRaiting(3);
		student.setProjectTeam("HDFC Bank App");
		
		t1.commit();
		hibernate.close();

	}

	public static void getStudentById(Session hibernate, int id) {
		Transaction t1 = hibernate.beginTransaction();

		Student savedData = (Student) hibernate.get(Student.class, id);
		System.out.println(savedData);


		t1.commit();
		hibernate.close();

		
	}

	public static void insertSudent(Session hibernate, Student s) {

		Transaction t1 = hibernate.beginTransaction();

		hibernate.save(s); // code to save Student in the database

		t1.commit();
		hibernate.close();

		System.out.println(" 5. Database commit & hibernate closed ...");
	}
}

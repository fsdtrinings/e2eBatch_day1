package p1;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class DatabaseOperation {

	public static void main(String[] args) {
		Session hibernate = HibernateConnection.getHibernateLink();

		Address a = new Address("New Town-741","Pune", "Mah.", "India", 220058);
		Address tempAddress = new Address("CenterCity-234","Banglore", "Karnataka","India",123456);
		
		Certification c1 = new Certification(952,"Java", "Hackrank - 1", LocalDate.of(2021, 1, 23).toString() ,LocalDate.of(2025, 1, 22).toString(), "Very Good");
		
		List<Certification> s1AllCertificates = Arrays.asList(c1);
		
		
		Hostel boysHostel = new Hostel(3000, "Hostel-A",151, 35000, 25000, "Make it clean");
		
		
		
		Student s1 = new Student("Mike", "Sales",4 , "Re Exam", "On Banch");
		s1.setId(102);
		s1.setAddress(a);
		s1.setTempAddress(tempAddress);
		s1.setAllCertificates(s1AllCertificates);
		s1.setHostelInfo(boysHostel);

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

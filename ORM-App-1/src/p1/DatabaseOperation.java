package p1;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class DatabaseOperation {

	public static void main(String[] args) {
		Session hibernate = HibernateConnection.getHibernateLink();
		
		Student s1 = new Student("Hemlata","Development",5,"Good to Deploy","Facebook");
		s1.setId(103);
		
		
		insertSudent(hibernate, s1);
		
	}
	
	public static void insertSudent(Session hibernate,Student s)
	{
		
		Transaction t1 = hibernate.beginTransaction();
		
		hibernate.save(s); // code to save Student in the database
		
		t1.commit();
		hibernate.close();
		
		System.out.println(" 5. Database commit & hibernate closed ...");
	}
}

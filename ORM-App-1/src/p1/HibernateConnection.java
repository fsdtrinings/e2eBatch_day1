package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConnection {
	public static Session hibernate = null;
	static {
		try {
			System.out.println(" --- Inside Try ---");
			Configuration cfg = new Configuration();
			System.out.println(" A) conf cfg :- " + cfg);
			SessionFactory factoryToProvideORM = cfg.configure().buildSessionFactory();
			System.out.println(" B) factory :- " + factoryToProvideORM);
			System.out.println("1 factory created :- " + factoryToProvideORM);

			hibernate = factoryToProvideORM.openSession();
			System.out.println("2 verify Hbernate " + hibernate);
		} catch (Exception e) {
			System.out.println("\n\n ************************************");
			System.out.println(" Exception during Connection establishment :- " + e + "\n\n");
		}

	}

	public static Session getHibernateLink() {
		return hibernate;
	}
}
